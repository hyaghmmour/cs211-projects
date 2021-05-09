package exercise;

public class Course {
    private String courseCode;
    private int credits;

    public Course(String courseCode, int credits) throws UniversityException {
        this.courseCode = courseCode;
        if (credits >= 1 && credits <= 10){
            this.credits = credits;
        }else{
            throw new UniversityException("Invalid number of credits for " + this.getCode());
        }

    }

    public String getCode() {
        return courseCode;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "GMU " + this.getCode() + " | " + this.getCredits() + " credits";
    }
}
