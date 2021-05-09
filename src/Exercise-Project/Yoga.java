public class Yoga extends Flexibility {

    @Override
    public Muscle[] muscleTargeted() {
        return new Muscle[]{Muscle.Triceps, Muscle.Biceps};
    }

    /**
     * Calculates calories burned based on the following criteria
     *      - Calories burn at 1kcal/kg/hr
     *      - MET is unit of calories burned based on intensity
     *      - cal/hr = MET*weight or MET*weight*hr = cal
     *      - Yoga Calorie Chart
     *              - High Intensity: MET = 4.0
     *              - Medium Intensity: MET = 3.0
     *              - Low Intensity: MET = 2.0
     *      * @param intensity
     * @param weight
     * @param duration
     * @return calories burned
     */
    @Override
    public double calorieLoss(Intensity intensity, double weight, int duration) {
        double calories = 0.0, time = duration/60.0;
        switch (intensity){
            case LOW: calories = weight*2.0*time; break;
            case MEDIUM: calories = weight*3.0*time; break;
            case HIGH: calories = weight*4.0*time; break;
        }
        return calories;
    }

    @Override
    public String description() {
        return "Yoga";
    }

    @Override
    public double getMetValue(Intensity intensity) {
        double MET = 0.0;
        switch (intensity){
            case LOW: MET = 2.0; break;
            case MEDIUM: MET = 3.0; break;
            case HIGH:MET = 4.0; break;
        }
        return MET;
    }
}
