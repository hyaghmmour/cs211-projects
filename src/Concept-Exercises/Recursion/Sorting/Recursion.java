
public class Recursion {

    /**
     * Tower of Hanoi Problem
     * @param dish  the number of dishes
     * @param from start tower
     * @param temp
     * @param to   target tower
     *
     */public static void hanoi(int dish, String from, String temp, String to){
        if (dish == 0){
            return;
        }else{
            System.out.printf("Moving dish %s from %s to %s", temp, from, to);
            System.out.println();
            hanoi(dish-1, from, temp, to);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


		System.out.println("-------------------------Three dishes Problem-------------------------------\n");
		hanoi(3,"A","B","C");

		//four dishes
		System.out.println("\n-------------------------Four dishes Problem-------------------------------\n");
		hanoi(4,"A","B","C");


    }

}

