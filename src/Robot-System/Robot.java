package exercise;

/**
 * The term "robot" (at least in popular usage) can refer to a very broad category of things, and yet there is a common
 * image that we often have in mind when discussing robots in general: machines that interact with the world.
 * Usually, we categorize different types of robots based on their capabilities. Let's create a general class that identifies some common capabilities that different robots might have, with the possibility that new capabilities might be added in the future. The Robot class we are about to write will be a general class which we can use to describe any type of robot - we won't
 * worry about the specifics yet, and instead we'll use subclasses to describe those.
 */
public class Robot {
    //Fields
    private final int serialNumber;
    private boolean autonomous, flies, teleoperated;

    /**
     * A constructor, with the parameters int serialNumber, boolean flies, boolean autonomous, boolean teleoperated.
     * The serialNumber is a number which uniquely identifies the robot, while the remaining parameters all represent different capabilities
     * a robot can have: if flies is true, the robot can move through the air, autonomous is true when
     * the robot can act on its own without a human operator, and teleoperated indicates whether a human can operate the robot manually.
     * @param serialNumber
     * @param autonomous
     * @param flies
     * @param teleoperated
     */
    public Robot(int serialNumber, boolean flies, boolean  autonomous, boolean teleoperated) {
        this.serialNumber = serialNumber;
        this.setCapabilities(flies, autonomous, teleoperated);
    }

    /**
     * A void method called setCapabilities for setting the capabilities
     * after object creation with the parameter list boolean flies, boolean autonomous, boolean teleoperated.
     * @param flies
     * @param autonomous
     * @param teleoperated
     */
    public void setCapabilities(boolean flies, boolean autonomous, boolean teleoperated){
        this.flies = flies;
        this.autonomous = autonomous;
        this.teleoperated = teleoperated;
    }

    /**
     * Format: "canFly" "isAutonomous" "isTeleoperated"
     * @return formatted String
     */
    public String getCapabilities(){
        String capabilities = "";

        capabilities = this.canFly() ? capabilities + "canFly": capabilities;
        capabilities = this.isAutonomous() ? capabilities + " isAutonomous": capabilities;
        capabilities = this.isTeleoperated() ? capabilities + " isTeleoperated": capabilities;
        return capabilities.trim();
    }

    /**
     * Format: ID: serialNumber, Capabilities: list of capabilities
     * @return formatted String
     */
    public String toString(){
        return "ID: " + this.getSerialNumber() + ", Capabilities: " + this.getCapabilities();
    }

    public final int getSerialNumber() {
        return serialNumber;
    }

    public boolean isAutonomous() {
        return autonomous;
    }

    public boolean canFly() {
        return flies;
    }

    public boolean isTeleoperated() {
        return teleoperated;
    }



}
