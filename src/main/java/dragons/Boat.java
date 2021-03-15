package dragons;

import java.util.ArrayList;
import java.util.List;

public class Boat {

    private String manufacturer;
    private BoatSize size;

    private List<Boat> boats = new ArrayList<>();

    public Boat(String manufacturer, BoatSize size) {
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public BoatSize getSize() {
        return size;
    }

    public void addList(Boat boat){
        boats.add(boat);
    }

    public List<Boat> getBoats() {
        return boats;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "manufacturer='" + manufacturer + '\'' +
                ", size=" + size +
                '}';
    }
}
