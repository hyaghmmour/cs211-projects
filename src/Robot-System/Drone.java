package exercise;

public class Drone extends Robot {


    public Drone(int serialNumber){
        super(serialNumber, false, true, true);
    }


    @Override
    public boolean canFly(){
        return true;
    }

    @Override
    public boolean isAutonomous(){
        return false;
    }

    @Override
    public boolean isTeleoperated(){
        return true;
    }
    //Done
}
