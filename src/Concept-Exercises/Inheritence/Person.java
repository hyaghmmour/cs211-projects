public class Person{
    /**
     * Person class represents a person who has a name and an age.
     * This is the parent class you should inherit from.
     */


    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        System.out.println("(Person) " + this.name + " has changed name to " + name);
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        System.out.println("(Person) " + this.name + " has changed age from " + this.age + " to " + age);
        this.age = age;
    }

    // toString() outputs the person's name and age
    @Override
    public String toString(){
        return "(Person) " + this.getName() + ", " + this.age + " years old";
    }

    public static void main(String[] args){

        // Test the inheritance implementation


        /*
         * ===========================================================================================================
         * TEST CASE 1
         * ===========================================================================================================
         *
         * Create a Person object, and print out the info by calling toString()
         *
         */
        System.out.println("Test Case 1");
        Person person = new Person("John", 20);
        System.out.println(person.toString());
        // Change the person's name, print out the info, and notice the setName of Person class is called
        person.setName("Mike");
        System.out.println(person.toString());
        System.out.println();

        /*
         * ===========================================================================================================
         * TEST CASE 2
         * ===========================================================================================================
         *
         * Create a Student object, and print out the info by calling toString()
         *
         */
        System.out.println("Test Case 2");
        Student student = new Student("Tom", 18, "Physics");
        System.out.println(student.toString());
        // Change the Student's age, and explain why setAge() method can be called

        /*
        //this method can be called because 'Student' is a subclass of Person and inherits the setAge method
         */
        student.setAge(21);
        System.out.println(student.toString());
        System.out.println();
        /*
         * ===========================================================================================================
         * TEST CASE 3
         * ===========================================================================================================
         *
         * Create an UndergradStudent object, and print out the info by calling toString()
         *
         */
        System.out.println("Test Case 3");
        Undergraduate undergraduate = new Undergraduate("Lisa", 19, "CS", "dancing");
        System.out.println(undergraduate.toString());

        /*
        //UndergradStudent has access to the 'major' field because it's a child class of Student
        //as well as the variable being 'protected' which is accessible to all package members.
         */
        undergraduate.setMajor("Math");
        System.out.println(undergraduate.toString());
        System.out.println();
        /*
         * ===========================================================================================================
         * TEST CASE 4
         * ===========================================================================================================
         *
         * Create a Person object that is actually an UndergradStudent, and print out the info by calling toString()
         * Explain why we can do this, of which class setAge method is called and how the code executes
         */
        System.out.println("Test Case 4");
        Person person1 = new Undergraduate("Jessica", 19, "CS", "jogging");
        System.out.println(person1.toString());
        /*
        /this method is accessible due to Student being a parent class of Undergraduate as well as
        //Student being a subclass of Person
         */
        person1.setAge(22);
        System.out.println(person1.toString());
        System.out.println();
    }
}
