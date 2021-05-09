

public abstract class Endurance implements Fitness {

    /**
     * Returns muscle group effected by fitness,
     * @return Targeted muscle
     */
    @Override
    public abstract Muscle[] muscleTargeted();

    /**
     * @param intensity
     * @param weight
     * @param duration
     * @return amount of calories burnt by exercise
     */
    @Override
    public abstract double calorieLoss(Intensity intensity, double weight, int duration);

    /**
     * @return short description of exercise
     */
    @Override
    public String description() {
        return "Endurance is all about sweat and patience";
    }
}
