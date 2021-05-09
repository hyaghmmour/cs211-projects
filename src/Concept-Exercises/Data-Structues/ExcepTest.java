public class ExcepTest {
    private static int[] num = new int[10];

    public static void main(String[] args) {
        try{
            for (int x = 0; x <= 11; x++){
                System.out.println(num[x]);
            }
        }catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){

            System.out.println(arrayIndexOutOfBoundsException.getMessage());
        }finally{
            num[0] = 3;
            System.out.println(num[0]);
        }
    }
}
