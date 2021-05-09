package lab2;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**Problem 1
         *Write a java program that has two double variables named num1 and
         * num2. The variables have values of 10.5 and 12.5 respectively. The
         * program displays the sum, product, difference, quotient, and
         * remainder of the two numbers
         */
        double num1 = 10.5;
        double num2 = 12.5;

        /**Problem 2
         * Modify the previous program in such a way that the values of the
         * variables are accepted from the user.
         * Hint: import Scanner class from java.util package
         */
        System.out.print("Num1: ");
        num1 = sc.nextDouble();
        System.out.print("Num2: ");
        num2 = sc.nextDouble();

        /**Program 3
         *  What if, the user enters 0 for num2?
         *  Modify, your program in such a way that it handles the runtime error
         *  gracefully, if num2=0.
         */
        while(num2 == 0){
            System.out.println("Num2 cannot be 0");
            System.out.print("Num2: ");
            num2 = sc.nextDouble();
        }


        System.out.println("Select function: ");
        System.out.println("Addition(Type A): ");
        System.out.println("Subtraction(Type S): ");
        System.out.println("Multiplication(Type M): ");
        System.out.println("Division(Type D): ");

        String choice;
        System.out.print("Function: ");
        choice = sc.next().toUpperCase();

        while(!choice.equals("A") && !choice.equals("S") && !choice.equals("M") &&!choice.equals("D")){
            System.out.println("Invalid Function: ");
            System.out.print("Function: ");
            choice = sc.next().toUpperCase();
        }

        switch(choice){
            case "A": System.out.println("Sum: " + (num1 + num2)); break;
            case "S": System.out.println("Difference: " + (num1 - num2)); break;
            case "M": System.out.println("Product: " + (num1 * num2)); break;
            case "D": System.out.println("Quotient: " + (Math.round((num1 / num2)*100.0)/100.0)); break;
        }







        /**Problem 4
         * Modify the program in such a way that the user also enters the
         * operation to be performed. Your program should display the output
         * according to the numbers and the operator accepted from the use
         */

    }


}
