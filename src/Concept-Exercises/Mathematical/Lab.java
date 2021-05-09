import java.util.Arrays;
import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < array.length; i++){
            if (array[i] == 4){
                continue;
            }else{
                System.out.println(array[i]);
            }
        }

        int[] list = new int[10];
       for (int x = 0; x < list.length; x++){
            list[x] = x+1;
        }
        System.out.println(Arrays.toString(list));

        int size = 0;
        double sum = 0;
        double average = 0;
        Scanner sc = new Scanner(System.in);
        while(size < list.length){
            System.out.print("Add Number: ");
            list[size] = sc.nextInt();
            sum+= list[size];
            size++;
        }
        average = sum/list.length;
        System.out.println("Sum: " + sum + "\nAverage: " + average);

        int numAbove = 0;
        for (int x = 0; x < list.length; x++) {
            if (list[x] >average){
                numAbove++;
            }
        }
        System.out.println("There are: " + numAbove + " numbers above the average");

        Arrays.sort(list);

        for(int x = 0; x < list.length; x++){
            int count = 1;
            for (int y = 1; y < list.length; y++){
                if (list[y] == list[x]){
                    count++;
                }else{
                    break;
                }
            }
            System.out.println(list[x] + " occurs " + count + " times");
        }




    }


}
