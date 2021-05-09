package test;

public class Test {
    public String placeHolder;
    protected static String name;
    static int id;
    private static int yearsOnCampus;

    /**
     * @author Hamza Yaghmmour
     * @version 1.0
     */
    public Test() {
    }

    /**
     * @author Hamza Yaghmmour
     * @version 1.0
     * @param str
     * @return "str is modified!"
     */
    public static String testPrint(String str){
        return "str is modified!";
    }

    /**
     * Checks argument data types and prints error if not compatible, otherwise print corresponding messages
     * @param args, name, id, yearsOnCampus
     */
    public static void main(String[] args) {
       if (args.length == 3){
            Test test = new Test();
            try {
                test.name = args[0];
                System.out.print("Name: " + test.name);
                test.id = Integer.parseInt(args[1]);
                System.out.print(" ID: " + test.id);
                test.yearsOnCampus = Integer.parseInt(args[2]);
                System.out.println(" Years On Campus: " + test.yearsOnCampus);
            }catch (Exception e){
                System.out.println(" Improper format: String, int, int");
            }

           switch(test.yearsOnCampus) {
               case 0:
                   System.out.println("Welcome freshman!");
                   break;
               case 1:
                   System.out.println("Welcome back sophomore!");
                   break;
               case 2:
                   System.out.println("Welcome back junior!");
                   break;
               case 3:
                   System.out.println("Welcome back senior!");
                   break;
               case 4:
                   System.out.println("Congrats on your graduation!");
                   break;
               default:
                   System.out.println("Welcome to GMU!");
           }
       }else{
           System.out.println("Need 3 arguments{}");

       }
    }
}
