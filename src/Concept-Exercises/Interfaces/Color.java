package lab;

public enum Color {
    RED(2.0), GREEN(0.2), BLUE(0.0);
    private double colorRate;


    Color(final double v){
        this.colorRate = v;
    }

    public double getColorRate() {
        return colorRate;
    }
}
