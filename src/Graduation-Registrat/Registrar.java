package exercise;

import java.util.ArrayList;

public class Registrar {
    //FixMe: Debug to match test cases
    public static float minGPA;
    public static int minCredits;
    protected static ArrayList<Object[]> courseContent = new ArrayList<>();

    static {
        minGPA = 3.0f;
        minCredits = 10;
    }

    public static float getMinGPA() {
        return minGPA;
    }

    public static void setMinGPA(float minGPA) {
        Registrar.minGPA = minGPA;
    }

    public static float getMinCredits() {
        return minCredits;
    }

    public static void setMinCredits(int minCredits) {
        Registrar.minCredits = minCredits;
    }

    public static void setMinimumGrade(Course course, float grade){
        Object[] content = {course, grade};
        courseContent.add(content);
    }

    public static float getMinimumGrade(Course course) throws Exception{
        boolean found = false;
        float grade = 0;
        for (int x = 0; x < courseContent.size(); x++){
            if (courseContent.get(x)[0] == course){
                found = true;
                grade = (float)courseContent.get(x)[1];
            }
        }

        if (found){
            return grade;
        }else{
            throw new Exception(course.getCode() + " was not found in the registry");
        }
    }

    public static void class2020(Student[] s) throws Exception {
        for (int x = 0; x < s.length; x++){
            try {
                s[x].graduation();
                System.out.println("Congrats to " + s[x].getName() + " for graduating with GPA " + s[x].calculateGPA());
            }catch (StudentException studentException){
                System.out.println(studentException.getMessage());
            }catch (UniversityException universityException){
                System.err.println("Sorry," + universityException.getMessage());
            }
            continue;
        }
    }


}
