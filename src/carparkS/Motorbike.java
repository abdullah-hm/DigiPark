package carparkS;

public class Motorbike extends Vehicle {

    private int PengineCapacity;

    public int getPengineCapacity() {
        return PengineCapacity;
    }

    public void setPengineCapacity(int PengineCapacity) {
        this.PengineCapacity = PengineCapacity;
    }

   

    @Override
    public void vehicleTypeS(String vehicleTypeS) {
        this.vehicleTipes = vehicleTypeS;
    }

    @Override
    public void vhiclesID(int Vid) {
        this.VEhicleID=Vid;
    }

}
