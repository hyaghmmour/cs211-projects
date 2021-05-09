public class Profile {

    private int age;
    private double weight, height;
    private static Gender gender;


    public Profile(int age, double height, double weight, Gender gender) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     *  returns the string that represents the
     *  profile of the user as Age 26, Weight 78.0kg, Height 1.7m, Gender MALE. Use one digit after the decimal point.
     * @return
     */
    @Override
    public String toString() {
        return String.format("Age %d, Weight %.1fkg, Height %.1fm, Gender %s", this.getAge(), this.getWeight(), this.getHeight()
        , this.getGender().toString());
    }

    /**
     *  this method calculates and returns the Body Mass Index (BMI) of the user
     * @return BMI is calculated by dividing the weight by the square of the height (in kg and in meters respectively).
     */
    public double calcBMI(){
        return this.weight/Math.pow(this.height, 2);
    }

    /**
     * this method calculates and returns the rough daily calorie
     * intake necessary to maintain the current weight based on Body Mass Ratio (BMR) of the user
     * @return calorie intake needed to maintain body weight
     */
    public double dailyCalorieIntake(){
        double intake = 0.0;
        switch (this.getGender()){
            case MALE: intake = 66.47 + (13.75*this.getWeight()) + (5.003*(this.getHeight()*100)) - (6.755*this.getAge()); break;
            case FEMALE: intake = 655.1 + (9.563*this.getWeight()) + (1.85*(this.getHeight()*100)) - (4.676*this.getAge()); break;
        }
        return intake;
    }
}
