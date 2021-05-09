

public abstract class Flexibility implements Fitness {

    @Override
    public abstract Muscle[] muscleTargeted();

    @Override
    public abstract double calorieLoss(Intensity intensity, double weight, int duration);

    @Override
    public String description() {
        return "Flexibility is uncomfortable and it takes time, so people don't like to do it";
    }
}
