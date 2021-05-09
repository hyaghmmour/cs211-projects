public class Cycling extends Aerobic {
    @Override
    public Muscle[] muscleTargeted() {
        return new Muscle[]{Muscle.Glutes,Muscle.Cardio,  Muscle.Legs};
    }

    /**
     * Calculates calories burned based on the following criteria
     *      - Calories burn at 1kcal/kg/hr
     *      - MET is unit of calories burned based on intensity
     *      - cal/hr = MET*weight or MET*weight*hr = cal
     *      - Swimming Calorie Chart
     *              - High Intensity: MET = 14.0
     *              - Medium Intensity: MET = 8.5
     *              - Low Intensity: MET = 4.0
     *      * @param intensity
     * @param weight
     * @param duration
     * @return calories burned
     */
    @Override
    public double calorieLoss(Intensity intensity, double weight, int duration) {
        double calories = 0.0, time = duration/60.0;
        switch (intensity){
            case LOW: calories = weight*4.0*time; break;
            case MEDIUM: calories = weight*8.5*time; break;
            case HIGH: calories = weight*14.0*time; break;
        }
        return calories;
    }

    @Override
    public String description() {
        return "Cycling";
    }

    @Override
    public double getMetValue(Intensity intensity) {
        double MET = 0.0;
        switch (intensity){
            case LOW: MET = 4.0; break;
            case MEDIUM: MET = 8.5; break;
            case HIGH:MET = 14.0; break;
        }
        return MET;
    }


}
