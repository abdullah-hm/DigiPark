
package carparkS;

public class Van extends Vehicle {
    private int Pcargo;

    public int getPcargo() {
        return Pcargo;
    }

    public void setPcargo(int Pcargo) {
        this.Pcargo = Pcargo;
    }
    
    
    @Override
    public void vehicleTypeS(String vehicleTypeS) {
        this.vehicleTipes=vehicleTypeS;
    }

    @Override
    public void vhiclesID(int VEid) {
        this.VEhicleID=VEid;
    }

   
    
}
