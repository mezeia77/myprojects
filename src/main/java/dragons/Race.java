package dragons;

import java.time.LocalDate;
import java.util.List;

public class Race {

    private String name;
    private LocalDate localDate;
    private Boat boat;
    private List<TeamManager> teamManagers;

    public Race(String name, LocalDate localDate, Boat boat, List<TeamManager> teamManagers) {
        this.name = name;
        this.localDate = localDate;
        this.boat = boat;
        this.teamManagers = teamManagers;
    }

    public String getName() {
        return name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public Boat getBoat() {
        return boat;
    }

    public List<TeamManager> getTeamManagers() {
        return teamManagers;
    }

    @Override
    public String toString() {
        return "Race{" +
                "name='" + name + '\'' +
                ", localDate=" + localDate +
                ", boat=" + boat +
                ", teamManagers=" + teamManagers +
                '}';
    }
}
