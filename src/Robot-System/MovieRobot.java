package exercise;

public class MovieRobot extends Robot{

    private String catchphrase;
    private boolean canSpeak;

    /**
     * A constructor, with the parameters int serialNumber, boolean flies, boolean autonomous, boolean teleoperated.
     * The serialNumber is a number which uniquely identifies the robot, while the remaining parameters all represent different capabilities
     * a robot can have: if flies is true, the robot can move through the air, autonomous is true when
     * the robot can act on its own without a human operator, and teleoperated indicates whether a human can operate the robot manually.
     *
     * @param serialNumber
     * @param autonomous
     * @param flies
     * @param teleoperated
     */
    public MovieRobot(int serialNumber, boolean flies, boolean  autonomous, boolean teleoperated, String catchphrase) {
        super(serialNumber, autonomous, flies, teleoperated);
        this.catchphrase = catchphrase;
        canSpeak = true;
    }

    public MovieRobot(int serialNumber, boolean flies, boolean  autonomous, boolean teleoperated) {
        super(serialNumber, autonomous, flies, teleoperated);
        this.catchphrase = null;
        canSpeak = false;
    }

    public boolean canSpeak(){
        return this.canSpeak;
    }

    @Override
    public String getCapabilities() {
       return (super.getCapabilities()  + " " +  (this.canSpeak ? "canSpeak" : "")).trim();
    }

    @Override
    public String toString() {
        return (super.toString() + " " + (this.canSpeak ?  "\"" + this.catchphrase + "\"":"")).trim();
    }
    //Done
}

