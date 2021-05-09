

public class PullUp extends Endurance {

    /**
     * Returns muscle group effected by fitness,
     *
     * @return Targeted muscle
     */
    @Override
    public Muscle[] muscleTargeted() {
        return new Muscle[]{Muscle.Biceps, Muscle.Arms};
    }

    /**
     * Calculates calories burned based on the following criteria
     *     - Calories burn at 1kcal/kg/hr
     *     - MET is unit of calories burned based on intensity
     *     - cal/hr = MET*weight or MET*weight*hr = cal
     *     - PullUp Calorie Chart
     *             - High Intensity: MET = 7.5
     *             - Medium Intensity: MET = 6.0
     *             - Low Intensity: MET = 4.8
     * @param intensity
     * @param weight
     * @param duration
     * @return amount of calories burnt by exercise
     */
    @Override
    public double calorieLoss(Intensity intensity, double weight, int duration) {
        double calories = 0.0, time = duration/60.0;
        switch (intensity){
            case LOW: calories = weight*4.8*time; break;
            case MEDIUM: calories = weight*6.0*time; break;
            case HIGH: calories = weight*7.5*time; break;
        }
        return calories;
    }

    /**
     * @return short description of exercise
     */
    @Override
    public String description() {
        return "PullUp";
    }

    @Override
    public double getMetValue(Intensity intensity) {
        double MET = 0.0;
        switch (intensity){
            case LOW: MET = 4.8; break;
            case MEDIUM: MET = 6.0; break;
            case HIGH:MET = 7.5; break;
        }
        return MET;
    }
}
