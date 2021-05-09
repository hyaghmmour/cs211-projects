package project;

public class MasonStudent {
    String studentId, studentName;
    StudentClass[] studentClasses;


    public MasonStudent(String studentId, String studentName, StudentClass[] studentClasses) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentClasses = studentClasses;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void printStudentClass(){
        for (int x = 0; x < studentClasses.length; x++){
            System.out.println("Code: " + studentClasses[x].getClassCode() + ", Class: " + studentClasses[x].getClassName()
                    + ", Grade: " + studentClasses[x].getGrade());
        }
    }

    public double getGPA(){
        double sum = 0;
        for (int i = 0; i < studentClasses.length; i++){
            sum += studentClasses[i].getGrade();
        }
        return sum/(25*studentClasses.length);
    }

    public void printStudentInfo(){
        System.out.println("Student ID: " + this.getStudentId() + ", Student Name: " + this.getStudentName());
    }

}
