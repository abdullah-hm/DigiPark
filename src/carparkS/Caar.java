package carparkS;

public class Caar extends Vehicle {

    private int numOfDoors;
    private String color;

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void vehicleTypeS(String vehicleType) {
        this.vehicleTipes = vehicleType;
    }

    @Override
    public void vhiclesID(int id) {
        this.VEhicleID = id;
    }

}
