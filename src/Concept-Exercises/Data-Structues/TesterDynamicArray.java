import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TesterDynamicArray {

    @BeforeClass
    public static void beforeClassMethod() { // we dont need this for our simple tests, but used in more complex scenarios with many classes
        //System.out.println("\n@BeforeClass - beforeClassMethod():\n\tAutomatically called ONCE before all tests. Involves common operations i.e., Database connection, threads etc.");
    }

    @AfterClass
    public static void afterClassMethod() { // we dont need this for our simple tests, but used in more complex scenarios with many classes
        //System.out.println("\n@AfterClass - afterClassMethod():\n\tAutomatically called ONCE after all tests. Involves common operations i.e., close connection, cleanup etc.");
    }


    @Before
    public void beforeTestMethod() { // we dont need this for our simple tests, but used in more complex scenarios with many classes
        //System.out.println("\n\n------------------- @Before - beforeTestMethod(): runs ONCE before EACH tests automatically (Optional). -------------------");
    }

    @After
    public void afterTestMethod() { // we dont need this for our simple tests, but used in more complex scenarios with many classes
        //System.out.println("------------------- @After - afterTestMethod(): runs ONCE after EACH tests automatically (Optional). -------------------");
    }

    // these are actual tests
    @Test 
    public void test1() {
        System.out.println("\n@Test: test1(): Testing normal behavior of dynamic array. Expected output = [32, 2, 32]");
        String expected = "[32, 2, 32]";
        
        DynamicArray da = new DynamicArray();
        da.append(32);
        da.append(2);
        da.append(32);
        String actual = da.toString();
        
        assertEquals("Failure: test1(): Failed the test for normal behavior.", expected, actual); // in case of error junit shows the expected vs actual. No need to show them in error message.
    }

    @Test
    public void test2() {
        System.out.println("\n@Test: test2(): Testing normal behavior of dynamic array. Expected output = []");
        //add your code here
    }

    @Test 
    public void test3() {
        System.out.println("\n@Test: test3(): Testing normal behavior of remove(). Expected output = [32]");
        //add youe code here
    }


    @Test(expected = IllegalStateException.class) // this is a neat way to deal with exceptions. We can use try-catch (extra coding).
    public void test4() {
        System.out.println("\n@Test: test4(): Testing exceptional behavior of remove(). Expected output = IllegalStateException");
        DynamicArray da = new DynamicArray();
        da.remove(); // removes the last item
    }


    @Test 
    public void test5() {
        System.out.println("\n@Test: test5(): Testing normal behavior of removeAt(). Expected output = [2]");
        String expected = "[2]";
        
        DynamicArray da = new DynamicArray();
        da.append(32);
        da.append(2);
        da.removeAt(0); // removes the last item
        String actual = da.toString();
        
        assertEquals("Failure: test5(): Failed the test for normal behavior of removeAt().", expected, actual);
    }

    
    @Test(expected = IllegalStateException.class)
    public void test6() {
        System.out.println("\n@Test: test6(): Testing exceptional behavior of removeAt(). Expected output = IllegalStateException");
        DynamicArray da = new DynamicArray();
        da.removeAt(2); // removes the last item
    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test7() {
        System.out.println("\n@Test: test7(): Testing exceptional behavior of removeAt(). Expected output = ArrayIndexOutOfBoundsException");
        DynamicArray da = new DynamicArray();
        da.append(32);
        da.append(2);
        da.removeAt(-1); // removes the last item
    }

    // we can continue like this. Exceptional cases are often more important than normal cases.
    // Think of more exceptional cases of various methods in DynamicArray and design your tests.
    // Add your exceptions from here.
    @Test
    public void test8(){
        System.out.println("\n@Test test8(): Testing getLastItem() behavior. Expected 5");
        DynamicArray da = new DynamicArray();
        da.append(15);
        da.append(35);
        da.append(5);
        assertEquals("Wrong return for getLastItem", 5, da.getLastItem());
    }

  public static void main(String args[]){
    org.junit.runner.JUnitCore.main("TesterDynamicArray");
  }

}