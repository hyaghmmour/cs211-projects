package exercise;

public class WALL_E extends MovieRobot{
    private boolean canClean;

    public WALL_E(int serialNumber, boolean flies, boolean  autonomous, boolean teleoperated, String catchphrase){
        super(serialNumber, autonomous, flies, teleoperated);
        canClean = true;
    }

    @Override
    public String getCapabilities() {
        return (super.getCapabilities() + "canClean").trim();
    }

    public boolean canClean(){
        return canClean;
    }

}
