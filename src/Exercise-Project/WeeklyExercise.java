import java.util.ArrayList;

public class WeeklyExercise {
    private ArrayList<Fitness> exerciseList;
    private int days;
    private double weeklyCalorieTarget;
    private Profile profile;

    public WeeklyExercise(ArrayList<Fitness> exerciseList, int days, double weeklyCalorieTarget, Profile profile) {
        this.exerciseList = exerciseList;
        this.days = (days);
        this.weeklyCalorieTarget = weeklyCalorieTarget;
        this.profile = profile;
    }

    public WeeklyExercise(ArrayList<Fitness> exerciseList, Profile profile) {
        this.exerciseList = exerciseList;
        this.profile = profile;
        this.days = 7;
        this.weeklyCalorieTarget = 3500;
    }

    public ArrayList<Fitness> getExerciseList() {
        return exerciseList;
    }

    public void setExerciseList(ArrayList<Fitness> exerciseList) {
        this.exerciseList = exerciseList;
    }

    public int getDays() {
        return this.days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getWeeklyCalorieTarget() {
        return weeklyCalorieTarget;
    }

    public void setWeeklyCalorieTarget(double weeklyCalorieTarget) {
        this.weeklyCalorieTarget = weeklyCalorieTarget;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    /**
     * adds exercise to this list
     * @param fitness
     */
    public void addExercise(Fitness fitness){
        this.exerciseList.add(fitness);
    }

    /**
     * finds exercise, then removes if found, otherwise, keep list the same
     * @param fitness
     */
    public void removeExercise(Fitness fitness){
        if (this.exerciseList.contains(fitness)){
            this.exerciseList.remove(fitness);
        }
    }

    /**
     *  A method that returns a list of DailyExercises that the user should do in order to meet the targeted calorie loss.
     *  The method evenly distributes the calorie loss over the number of days the user plans to workout.
     *  This method accepts the intensity of the exercises. One exercise will be used per day and we have exactly
     *  days number of exercises in the exerciseList.
     *  Note that the DailyExercise suggestions include the duration (minutes) the user should workout towards the targeted calorie loss.
     * We may assume that the input number of days matches the number of Fitness exercises in the exercise list,
     * and that each one gets its own day in the output and an equal fraction of the total calorie loss responsibility.
     * See the example below. We must somehow figure out how to use a class's calorieLoss to help us deduce the number of
     * minutes needed to achieve the calorie loss goal. Note that the duration we calculate may be a fractional value.
     * @param intensity
     * @return list of exercises
     */
    public ArrayList<DailyExercise> getWeeklyExercises(Intensity intensity){
        ArrayList<DailyExercise> dailyExercises = new ArrayList<>();
        double dailyCalorieLoss = this.weeklyCalorieTarget/this.days;
        for (Fitness fitness: this.exerciseList){
            DailyExercise dailyExercise =  new DailyExercise(this.exerciseList, this.profile);
            double forOneHour = fitness.calorieLoss(intensity, this.profile.getWeight(), dailyExercise.getDuration());
            double increaseRate = dailyCalorieLoss/forOneHour;
            int duration = (int)(dailyExercise.getDuration()*increaseRate);
            dailyExercise.setDuration(duration);
            dailyExercises.add(dailyExercise);
        }
        return dailyExercises;
    }

    /**
     *  A method that returns a list of DailyExercises that the user should do in order to meet the targeted calorie loss.
     *  The method evenly distributes the calorie loss over the number of days the user plans to work out.
     *  This method is similar to the previous version except that it assumes LOW intensity exercises.
     *  One exercise will be used per day and we have exactly days number of exercises in the exerciseList.
     *  Note that the DailyExercise suggestions include the duration (minutes) the user should work out towards the targeted calorie loss.
     * @return a list which has all daily exercises with durations
     */
    public ArrayList<DailyExercise> getWeeklyExercises(){
       ArrayList<DailyExercise> dailyExercises = new ArrayList<>();
       double dailyCalorieLoss = this.weeklyCalorieTarget/this.days;
       for (Fitness fitness: this.exerciseList){
           DailyExercise dailyExercise =  new DailyExercise(this.exerciseList, this.profile);
           double forOneHour = fitness.calorieLoss(Intensity.LOW, this.profile.getWeight(), dailyExercise.getDuration());
           double increaseRate = dailyCalorieLoss/forOneHour;
           int duration = (int)(dailyExercise.getDuration()*increaseRate);
           dailyExercise.setDuration(duration);
           dailyExercises.add(dailyExercise);
       }
        return dailyExercises;
    }

    /**
     *  this method returns the string that contains a suggestion on how to loss the targeted weight within the specified number of days.
     *  Assume that you need to burn (or decrease your intake by ) 7000 calories to lose 1Kg.
     *  The format of the output is "You need to lose 755.00 calories per day or decrease your
     *  intake from 1700.00 to 945.00 inorder to lose 10.00 kg of weight".
     *  (Note that you can use "%.2f" to have two decimal places after the dot).
     *  If the target weight is greater than the actual weight of the user, the method throws a TargetWeighException.
     *  You need to define a TargetWeightException that extends Java's RuntimeException class and displays the
     *  string "Only works to lose weight".
     * @param targetWeight
     * @param withInDays
     * @return targeted calorie loss
     */
    public String targetedCalorieLoss(double targetWeight, int withInDays) throws TargetWeightException {
        int caloriesPerKG = 7000;
        if (targetWeight > this.profile.getWeight()) {
            throw new TargetWeightException();
        }
        double dailyLoss = this.profile.dailyCalorieIntake() - ((this.profile.getWeight() - targetWeight) * caloriesPerKG) / withInDays;
        return String.format("You need to lose %.2f calories per day or decrease your intake from %.2f to %.2f in order to lose %.2f kg of weight",
                this.profile.dailyCalorieIntake() - dailyLoss, this.profile.dailyCalorieIntake(), dailyLoss, this.profile.getWeight() - targetWeight);
    }


}
