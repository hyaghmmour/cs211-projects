

public class WeightLifting extends Anaerobic {


    @Override
    public Muscle[] muscleTargeted() {
        return new Muscle[]{Muscle.Shoulders, Muscle.Legs, Muscle.Arms, Muscle.Triceps};
    }

    /**
     * Calculates calories burned based on the following criteria
     *      - Calories burn at 1kcal/kg/hr
     *      - MET is unit of calories burned based on intensity
     *      - cal/hr = MET*weight or MET*weight*hr = cal
     *      - Weightlifting Calorie Chart
     *              - High Intensity: MET = 6.0
     *              - Medium Intensity: MET = 5.0
     *              - Low Intensity: MET = 3.5
     *      * @param intensity
     * @param weight
     * @param duration
     * @return calories burned
     */@Override
    public double calorieLoss(Intensity intensity, double weight, int duration) {
        double calories = 0.0, time = duration/60.0;
        switch (intensity){
            case LOW: calories = weight*3.5*time; break;
            case MEDIUM: calories = weight*5.0*time; break;
            case HIGH: calories = weight*6.0*time; break;
        }
        return calories;
    }

    @Override
    public String description() {
        return "WeightLifting";
    }

    @Override
    public double getMetValue(Intensity intensity) {
        double MET = 0.0;
        switch (intensity){
            case LOW: MET = 3.5; break;
            case MEDIUM: MET = 5.0; break;
            case HIGH:MET = 6.0; break;
        }
        return MET;
    }

}
