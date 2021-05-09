package exercise;

public class Terminator extends MovieRobot{
   private boolean canTimeTravel;

    public Terminator(int serialNumber, boolean autonomous, boolean flies, boolean teleoperated, String catchphrase){
        super(serialNumber, autonomous, flies, teleoperated, "I'll be back.");
        canTimeTravel = true;
    }

    public boolean canTimeTravel() {
        return canTimeTravel;
    }

    @Override
    public String getCapabilities() {
        return super.getCapabilities() + " canTimeTravel";
    }
}
