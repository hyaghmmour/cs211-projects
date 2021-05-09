public class Swimming extends Aerobic {


    public SwimmingType swimmingType;

    public Swimming(SwimmingType swimmingType) {
        this.swimmingType = swimmingType;
    }

    public Swimming() {
        this.swimmingType = SwimmingType.Freestyle;
    }

    public void setSwimmingType(SwimmingType swimmingType) {
        this.swimmingType = swimmingType;
    }

    public SwimmingType getSwimmingType() {
        return swimmingType;
    }

    /**
     * Return targeted muscle groups with the following conditions
     *      - Butterflystroke: Abs, Back, shoulders, Biceps, Triceps
     *      - Breaststroke: Glutes, Cardio
     *      - Freestyle: Arms, Legs, Cardio
     * @return corresponding array for excercise
     */
    @Override
    public Muscle[] muscleTargeted() {
        Muscle muscle;
        switch (this.swimmingType){
            case Butterflystroke:
                return new Muscle[]{Muscle.Abs, Muscle.Back, Muscle.Shoulders, Muscle.Biceps, Muscle.Triceps};
            case Breaststroke: return new Muscle[]{Muscle.Glutes, Muscle.Cardio};
            case Freestyle: return new Muscle[]{Muscle.Arms, Muscle.Legs, Muscle.Cardio};
            default: return new Muscle[0];
        }
    }

    /**
     * Calculates calories burned based on the following criteria
     *      - Calories burn at 1kcal/kg/hr
     *      - MET is unit of calories burned based on intensity
     *      - cal/hr = MET*weight or MET*weight*hr = cal
     *      - Swimming Calorie Chart
     *              - High Intensity: MET = 10.0
     *              - Medium Intensity: MET = 8.3
     *              - Low Intensity: MET = 6.0
     *      * @param intensity
     * @param weight
     * @param duration
     * @return calories burned
     */
    @Override
    public double calorieLoss(Intensity intensity, double weight, int duration) {
        double calories = 0.0, time = duration/60.0;
        switch (intensity){
            case LOW: calories = weight*6.0*time;
                break;
            case MEDIUM: calories = weight*8.3*time;
                break;
            case HIGH: calories = weight*10.0*time;
                break;
        }
        return calories;
    }

    @Override
    public String description() {
        return "Swimming";
    }

    @Override
    public double getMetValue(Intensity intensity) {
        double MET = 0.0;
        switch (intensity){
            case LOW: MET = 6.0; break;
            case MEDIUM: MET = 8.3; break;
            case HIGH:MET = 10.0; break;
        }
        return MET;
    }
}
