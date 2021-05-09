
import java.util.ArrayList;

public class TestGenerics {
	
	@Override
	public String toString() {
		return "toString method of the TestGenerics class";
	}
	

	public static void main(String[] args) {
		
		
		// Test the printAnyArrayType method
		

		System.out.println("\n================THE printAnyArrayType METHOD=================================\n");
		
		String[] stringArray = {"GMU", "is", "a", "public", "research", "university", "located", "in", "Fairfax", "Virginia" };
		Integer[] integerArray = {534, 990, 123, 88, 23, 23, 834, 33, 89, 23};
		Double[] doubleArray = {23.5, 323.45, 553.22, 2388.23, 843.89, 88.43, 235.43, 874.23, 74.98, 42.29};
		Character[] characterArray = {'P', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g'};		
		
		printAnyArrayType(stringArray);
		printAnyArrayType(integerArray);
		printAnyArrayType(doubleArray);
		printAnyArrayType(characterArray);

		
		
		// Test the OrderedPair class
		

		System.out.println("\n================THE OrderPair CLASS=========================================\n");
		
		OrderedPair<String, Integer> op1 = new OrderedPair<>("Test", 55);
		OrderedPair<TestGenerics, Double> op2 = new OrderedPair<>(new TestGenerics(), Math.PI);		
		OrderedPair<Character, Exception> op3 = new OrderedPair<>('P', new Exception());
		
		System.out.println(op1.toString());
		System.out.println(op2.toString());
		System.out.println(op3.toString());
		
		
		//Test the sort method from the SortItems class
		

		System.out.println("\n================THE sort METHOD============================================\n");
		
		String[] stringArray2 = {"Tom", "Susan", "Kim", "John", "Alice"};
		Integer[] integerArray2 = {27, 4, 13, 8, 3};
		Double[] doubleArray2 = {53.5, 568.66, 22.4, 45.2, 33.5};
		Character[] characterArray2 = {'J', 'u', 'a', 'r', 'B'};
		
		System.out.print("Before Sorting: ");
		printAnyArrayType(stringArray2);
		System.out.println();
		System.out.print("After Sorting: ");
		SortItems.sort(stringArray2);
		printAnyArrayType(stringArray2);


		System.out.println();
		
		System.out.print("Before Sorting: ");
		printAnyArrayType(integerArray2);
		System.out.println();
		System.out.print("After Sorting: ");
		SortItems.sort(integerArray2);
		printAnyArrayType(integerArray2);
		
		System.out.println();
		
		System.out.print("Before Sorting: ");
		printAnyArrayType(doubleArray2);
		System.out.println();
		System.out.print("After Sorting: ");
		SortItems.sort(doubleArray2);
		printAnyArrayType(doubleArray2);
		
		System.out.println();
		
		System.out.print("Before Sorting: ");
		printAnyArrayType(characterArray2);
		System.out.println();
		System.out.print("After Sorting: ");
		SortItems.sort(characterArray2);
		printAnyArrayType(characterArray2);		

		
		
		// Test the printArrayList method

		System.out.println("\n================THE printArrayList METHOD============================================\n");
		
		ArrayList<Integer> arrayListIntegers = new ArrayList<>();
		arrayListIntegers.add(5);
		arrayListIntegers.add(89);
		arrayListIntegers.add(23);
		arrayListIntegers.add(91);
		arrayListIntegers.add(54);
		
		ArrayList<Number> arrayListNumbers = new ArrayList<>();
		arrayListNumbers.add(5.5);
		arrayListNumbers.add(34.9f);
		arrayListNumbers.add((byte)43);
		arrayListNumbers.add((long) 234234);
		arrayListNumbers.add((short)4430);
		
		
		ArrayList<Object> arrayListObjects = new ArrayList<>();
		arrayListObjects.add("This is a String");
		arrayListObjects.add(new TestGenerics());
		arrayListObjects.add('C');
		arrayListObjects.add(true);
		arrayListObjects.add(new ArrayIndexOutOfBoundsException());
		
				
		printArrayList(arrayListIntegers);
		printArrayList(arrayListNumbers);
		printArrayList(arrayListObjects);

	}

	public static <T> void printAnyArrayType(T[] array){
		System.out.println();
	    for (int x = 0; x < array.length; x++){
            System.out.print(array[x] + " ");
        }
    }

    public static <T> void printArrayList(ArrayList<? super T> arrayList){
		for (int x = 0; x < arrayList.size(); x++){
			System.out.print(arrayList.get(x) + " |");
		}
		System.out.println();
	}
	
}
