

public class Plyometrics extends Anaerobic {

    @Override
    public Muscle[] muscleTargeted() {
        return new Muscle[]{Muscle.Abs, Muscle.Legs, Muscle.Glutes};
    }

    /**
     * Calculates calories burned based on the following criteria
     *      - Calories burn at 1kcal/kg/hr
     *      - MET is unit of calories burned based on intensity
     *      - cal/hr = MET*weight or MET*weight*hr = cal
     *      - Plyometrics Calorie Chart
     *              - High Intensity: MET = 7.4
     *              - Medium Intensity: MET = 4.8
     *              - Low Intensity: MET = 2.5
     *      * @param intensity
     * @param weight
     * @param duration
     * @return calories burned
     */
    @Override
    public double calorieLoss(Intensity intensity, double weight, int duration) {
        double calories = 0.0, time = duration/60.0;
        switch (intensity){
            case LOW: calories = weight*2.5*time; break;
            case MEDIUM: calories = weight*4.8*time; break;
            case HIGH: calories = weight*7.4*time; break;
        }
        return calories;
    }

    @Override
    public String description() {
        return "Plyometrics";
    }

    @Override
    public double getMetValue(Intensity intensity) {
        double MET = 0.0;
        switch (intensity){
            case LOW: MET = 2.5; break;
            case MEDIUM: MET = 4.8; break;
            case HIGH:MET = 7.4; break;
        }
        return MET;
    }
}
