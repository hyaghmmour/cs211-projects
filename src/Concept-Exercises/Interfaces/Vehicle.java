package lab;

public abstract class Vehicle {
    protected int year;
    protected String made, color;

    public String getVehicleInfo() {
        return this.year + " " + this.color + " " + this.made;
    }

    public void ignite(){
        System.out.println("It's one!");
    }
}
