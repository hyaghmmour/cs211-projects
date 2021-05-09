package exercise;

public class HAL9000 extends MovieRobot {
    public HAL9000(int serialNumber, boolean flies, boolean  autonomous, boolean teleoperated, String catchphrase){
        super(serialNumber, autonomous, true, teleoperated, "I can't let you do that Dave.");
    }

    @Override
    public boolean canSpeak() {
        return true;
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public String getCapabilities() {
        return super.getCapabilities();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
