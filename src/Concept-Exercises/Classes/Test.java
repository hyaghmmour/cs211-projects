package project;

public class Test {

    public static void main(String[] args) {
        StudentClass studentClass = new StudentClass("CS211", "Object Oriented Programming with Java",
                100);
        StudentClass studentClass1 = new StudentClass("HS102", "World's History", 90);
        StudentClass studentClass2 = new StudentClass("HC201", "Human Computer Interaction", 95);

        StudentClass[] studentClasses = new StudentClass[]{studentClass, studentClass1, studentClass2};

        MasonStudent masonStudent = new MasonStudent("G123456", "John Doe", studentClasses);

        masonStudent.printStudentInfo();
        System.out.println();
        System.out.println("CLASSES: ");
        masonStudent.printStudentClass();
        System.out.println();
        System.out.println("The GPA is " + masonStudent.getGPA());



    }
}
