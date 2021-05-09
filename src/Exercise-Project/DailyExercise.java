import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DailyExercise {
    private ArrayList<Fitness> exerciseList;
    private int duration;
    private double calorieTarget;
    private Profile profile;

    public DailyExercise(ArrayList<Fitness> exerciseList, int duration, double calorieTarget, Profile profile) {
        this.exerciseList = exerciseList;
        this.duration = duration;
        this.calorieTarget = calorieTarget;
        this.profile = profile;
    }

    public DailyExercise(ArrayList<Fitness> exerciseList, Profile profile) {
        this.exerciseList = exerciseList;
        this.profile = profile;
        this.duration = 60;
        this.calorieTarget = 500;
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

    public void setExerciseList(ArrayList<Fitness> exerciseList) {
        this.exerciseList = exerciseList;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setCalorieTarget(double calorieTarget) {
        this.calorieTarget = calorieTarget;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public ArrayList<Fitness> getExerciseList() {
        return exerciseList;
    }

    public int getDuration() {
        return duration;
    }

    public double getCalorieTarget() {
        return calorieTarget;
    }

    public Profile getProfile() {
        return profile;
    }

    /**
     * returns an array of Fitness exercises from the exerciseList that fulfills all the target muscle groups (targetMuscle)
     * the user wants to work on for that specific day.
     * The method will return null if there is no exercise that targets all the muscle groups.
     * @param muscles
     * @return an array of qualifying exercises
     */
    public Fitness[] getExercises(Muscle[] muscles){
        ArrayList<Fitness> fitnesses = new ArrayList<>();
        for (int x = 0; x < this.exerciseList.size(); x++){
            List<Muscle> muscles1 = Arrays.asList(this.exerciseList.get(x).muscleTargeted());
            boolean allMatch = false;
            for (int i = 0; i < muscles.length; i++){
                if (muscles1.contains(muscles[i])){
                    allMatch = true;
                }else{
                    allMatch = false;
                    break;
                }
            }
            if (allMatch){
                fitnesses.add(this.exerciseList.get(x));
            }
        }
        if (fitnesses.size() == 0){
            return null;
        }
        return fitnesses.toArray(new Fitness[fitnesses.size()]);
    }

    protected double calculateTime(Fitness fitness, double dailyGoal){
//        double value = fitness.getMetValue(Intensity.LOW);
//        for (int x = 1; x <= 10; x++){
//            System.out.println(fitness.calorieLoss(Intensity.LOW, ));
//        }
        return this.getDuration();
    }
}
