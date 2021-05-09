public class Student extends Person{
    protected String major;



    Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String getName() {
        return super.getName() + ", Mason student";
    }

    @Override
    public String toString() {
        return "(Student)(Person)" + this.getName() + ", Mason student" + ", " + this.getAge()
                + " years old, majored in " + this.getMajor() ;
    }
}
