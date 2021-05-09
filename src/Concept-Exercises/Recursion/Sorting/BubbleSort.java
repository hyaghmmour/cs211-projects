import java.util.Arrays;

public class BubbleSort {



    // bubble Sort
    public static void bubbleSort(int [] a){
        Arrays.sort(a);
    }


    /*
     * Generic Bubble Sort
     * replace ??? with appropriate return type
     */
    public static <T> void genericBubbleSort(T[] arr){
        Arrays.sort(arr);
    }


    public static void main(String[] args) {

         //Bubble Sort


        System.out.println("Integer Bubble Sort\n");

        int[] arr = {1,1,2,0,9,3,12,7,8,3,4,65,22};

        System.out.print("Before Sort: " + Arrays.toString(arr) + "\n");
        BubbleSort.bubbleSort(arr);
        System.out.print("After Sort: " + Arrays.toString(arr) + "\n");



        System.out.println("\n===================================================");

        // Generic Bubble Sort

	    System.out.println("Generic Bubble Sort: Sorting Integers\n");

	    Integer[] arr1 = {4,7,6,5,2,1,3};

	    System.out.print("Before sort: " + Arrays.toString(arr1) + "\n");
	    genericBubbleSort(arr1);
	    System.out.print("After sort: " + Arrays.toString(arr1) + "\n");

	    System.out.println("_________________________________________");

	    System.out.println("Generic Bubble Sort: Sorting Doubles\n");

	    Double[] arr2 = {2.35,8.65,2.10,6.22,11.2};

	    System.out.print("Before sort: " + Arrays.toString(arr2) + "\n");
	    genericBubbleSort(arr2);
	    System.out.print("After sort: " + Arrays.toString(arr2) + "\n");

	    System.out.println("_________________________________________________________________________\n");

	    System.out.println("Generic Bubble Sort: Sorting People by height\n");

	    Person[] people = {
	    		new Person("Peter", 5.82),
	    		new Person("Lisa", 5.50),
	    		new Person("Brahim", 8.08),
	    		new Person("John", 6.49),
	    		new Person("Lola", 6.75)};


	    System.out.print("Before sort: " + Arrays.toString(people) + "\n");
	    genericBubbleSort(people);
	    System.out.print("After sort: " + Arrays.toString(people) + "\n");


    }

}


class Person implements Comparable<Person>{

    String name;
    double height;

    Person(String name, double height){
        this.name = name;
        this.height = height;
    }

    public String toString() {

        return this.name + "("+ this.height +")";
    }

    @Override
    public int compareTo(Person p) {

        if(this.height < p.height)
            return -1;
        else if (this.height > p.height)
            return 1;
        else
            return 0;

    }

}

