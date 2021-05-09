public class Undergraduate extends Student{
    private String hobby;

    Undergraduate(String name, int age, String major, String hobby) {
        super(name, age, major);
        this.hobby = hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setMajor(String major){
        System.out.println("(Undergraduate)" + this.getName() + ", Mason Student, has changed major from " + this.getMajor() + " to " +
                major);
        this.major = major;
    }


    @Override
    public String toString() {
        return "(Undergraduate)(Student)(Person)" + this.getName() + ", Mason student" + ", " + this.getAge()
                + " years old, majored in " + this.getMajor() + ", likes " + this.getHobby() ;
    }

    @Override
    public void setAge(int age) {
        System.out.println("(UndergradStudent)" + super.getName() + ", Mason student has changed age from " +
                 this.getAge() + " to " + age);
        super.setAge(age);
    }



}
