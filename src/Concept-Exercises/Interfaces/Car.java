package lab;

public class Car extends Vehicle implements Market{

    public Car(int year, String made, String color) {
        super.color = color;
        super.made = made;
        super.year = year;
    }

    public static void main(String[] args) {
        Car c1 = new Car(2020,"Honda", "White");
        System.out.println(c1.getVehicleInfo());
        c1.ignite();
        c1.quote();
    }

    @Override
    public void quote() {
        double worth = 0;
        if (this.year < baseYear){
            worth = 0;
        }else {
            worth = (this.year - baseYear)*Color.RED.getColorRate()*1000;
        }
        System.out.println("A " + this.getVehicleInfo() + " is worth " + worth);
    }
}
