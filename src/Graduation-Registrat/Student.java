package exercise;

import java.util.ArrayList;

public class Student {
    private String name, year;
    private ArrayList<Object[]> gradebook;

    public Student(String name, String year) throws StudentException{

        if (name == null || name == "" || name == " "){
                throw new StudentException("Student name is invalid");
            }else{
                this.name = name;
        }

        switch (year){
            case "freshman":
            case "sophomore":
            case "junior":
            case "senior": this.year = year; break;
            default: throw new StudentException("Student must be one of freshman|sophomore|junior|senior");
        }
        this.gradebook = new ArrayList<>();
    }

    public Student(String name) throws StudentException{
        if (name.trim().length() == 0){
            throw new StudentException("Student name is invalid");
        }else{
            this.name = name;
        }
        this.year = "freshman";
        this.gradebook = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public boolean addCourse(Course course, float grade) throws Exception {
        float minGrade = Registrar.getMinimumGrade(course);
        if (this.gradebook != null){
            for (Object[] objects: this.gradebook){
                Course course1 = (Course)objects[0];
                if (course1.getCode() == course.getCode()){
                    throw new StudentException(this.getName() + " has already taken " + course.getCode());
                }
            }
        }

        if(grade < minGrade){
            throw new UniversityException(course.getCode() + " requires a grade greater than or equal to " + minGrade);
        }else{
            this.gradebook.add(new Object[]{course, grade});
            return true;
        }

    }


    public float graduation() throws Exception{
        float gpa = this.calculateGPA();
        int numCredits = this.numCredits();
        if (this.gradebook.size() == 0){
            throw new StudentException(this.getName() + " hasn't taken any courses yet");
        }else if (gpa < Registrar.getMinGPA()){
            throw new UniversityException(this.getName() + "'s GPA is lower than the minimum required");
        }else if (numCredits < Registrar.getMinCredits()){
            throw new UniversityException(this.getName() + " doesn't have enough credits to graduate");
        }else {
            return gpa;
        }

    }

    public float calculateGPA(){
        float totalGPA = 0.0f;
        for (int x = 0; x < this.gradebook.size(); x++){
            totalGPA += (float)this.gradebook.get(x)[1];
        }
        return totalGPA/this.gradebook.size();
    }

    public int numCredits(){
        int num = 0;
        for (int x = 0; x < this.gradebook.size(); x++){
            Course course = (Course) this.gradebook.get(x)[0];
            num += course.getCredits();
        }
        return num;
    }

}
