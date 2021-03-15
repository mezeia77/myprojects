package dragons;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeamDao {
    MariaDbDataSource dataSource;

    public void createConnection(){
        try { dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("root");
            dataSource.setPassword("12345");
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Can't create datasource", sqlException);
        }
    }

    public void writeToDb(TeamMember teamMember){
            try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("insert into teammembers (name, age, gender) values (?, ?, ?)")){
                    stmt.setString(1, teamMember.getName());
                    stmt.setInt(2, teamMember.getAge());
                    stmt.setString(3, teamMember.getGender().toString());
                    stmt.executeUpdate();
            } catch (SQLException sqlException) {
                throw new IllegalStateException("Can't write file", sqlException);
            }
    }

    public List<String> readNamesFromDbOrderedByAge(){
        List<String> teamMembers = new ArrayList<>();
        try
                (Connection conn = dataSource.getConnection();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("select name from teammembers order by age")
        ){
            while (rs.next()){
                String name = rs.getString("name");
                teamMembers.add(name);
                System.out.println(name);
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Can't read file", sqlException);
        }
        return teamMembers;
    }
}
