package project;

public class StudentClass {
    private String classCode, className;
    private int grade;

    public StudentClass(String classCode, String className, int grade) {
        this.classCode = classCode;
        this.className = className;
        this.grade = grade;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


}
