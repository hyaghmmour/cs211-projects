public interface Fitness {



    /**
     * Returns muscle group effected by fitness,
     * @return Targeted muscle
     */
   Muscle[] muscleTargeted();



    /**
     *
     * @param intensity
     * @param weight
     * @param duration
     * @return amount of calories burnt by exercise
     */
    double calorieLoss(Intensity intensity, double weight, int duration);



    /**
     *
     * @return short description of exercise
     */
    String description();

    double getMetValue(Intensity intensity);
}
