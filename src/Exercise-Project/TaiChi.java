

public class TaiChi extends Flexibility {
    @Override
    public Muscle[] muscleTargeted() {
        return new Muscle[]{Muscle.Arms, Muscle.Legs};
    }

    /**
     * Calculates calories burned based on the following criteria
     *      - Calories burn at 1kcal/kg/hr
     *      - MET is unit of calories burned based on intensity
     *      - cal/hr = MET*weight or MET*weight*hr = cal
     *      - TaiChi Calorie Chart
     *              - High Intensity: MET = 5.0
     *              - Medium Intensity: MET = 3.0
     *              - Low Intensity: MET = 1.5
     * @param intensity
     * @param weight
     * @param duration
     * @return calories burned
     */
    @Override
    public double calorieLoss(Intensity intensity, double weight, int duration) {
        double calories = 0.0, time = duration/60.0;
        switch (intensity){
            case LOW: calories = weight*1.5*time; break;
            case MEDIUM: calories = weight*3.0*time; break;
            case HIGH: calories = weight*5.0*time; break;
        }
        return calories;
    }

    @Override
    public String description() {
        return "TaiChi";
    }

    @Override
    public double getMetValue(Intensity intensity) {
        double MET = 0.0;
        switch (intensity){
            case LOW: MET = 1.5; break;
            case MEDIUM: MET = 3.0; break;
            case HIGH:MET = 5.0; break;
        }
        return MET;
    }
}
