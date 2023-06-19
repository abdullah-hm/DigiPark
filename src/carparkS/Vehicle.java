
package carparkS;


public abstract class Vehicle {
    
public abstract void vehicleTypeS(String vehicleType);
public abstract void vhiclesID(int id);

public int VEhicleID;
private String vehicleBrand;
public String vehicleTipes;
private DateAndTime entryTime;

    public int getpVehicleID() {
        return VEhicleID;
    }

    public void setpVehicleID(int vehicleID) {
        this.VEhicleID = vehicleID;
    }

    public String getpVehicleBrand() {
        return vehicleBrand;
    }

    public void setpVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getpVehicleTYPES() {
        return vehicleTipes;
    }

    public void setpVehicleTYPES(String vehicleTYPES) {
        this.vehicleTipes = vehicleTYPES;
    }

    public DateAndTime getpEntryTime() {
        return entryTime;
    }

    public void setpEntryTime(DateAndTime entryTime) {
        this.entryTime = entryTime;
    }

}

