package exercise;

public class Roomba extends Robot{
    private boolean canClean;

    public Roomba(int serialNumber){
        super(serialNumber, true, false, false);
    }

    public boolean canClean(){
        return true;
    }

    @Override
    public String getCapabilities() {
        return super.getCapabilities() + " canClean";
    }

    @Override
    public boolean isAutonomous() {
        return true;
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean isTeleoperated() {
        return false;
    }
    //Done
}
