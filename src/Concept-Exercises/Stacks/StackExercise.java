import java.util.Stack;

public class StackExercise {

    public static void main(String[] args)
    {
        String[] in1 = {"The", "lake", "is", "long", "way", "from", "here", "!"};
        String[] in2 = {"Hello", "World", "!", "!", "World", "Hello"};

        String[] in3 = "( 1 ) + 2 ) * 4 / 5".split(" ");
        String[] in4 = "( ( 1 + 2 ) + 3 ) * ( 4 / 5 )".split(" ");



        //System.out.println(reverse(in1));

        //System.out.println(palindrome(in1));
        //System.out.println(palindrome(in2));

        System.out.println(validateExpression(in3));
        System.out.println(validateExpression(in4));



    }
    public static String reverse(String[] in)
    {
        Stack<String> stack = new Stack<String>();
        String string = "";
        for (int x = 0; x < in.length; x++){
            stack.push(in[x]);
        }
        while(!stack.isEmpty()){
            string += stack.pop() + " ";
        }
        return string;
    }

    public static boolean palindrome(String[] in)
    {
        Stack<String> stack = new Stack<String>();
        String string1 = "", string2 = "";
        for (int i = 0; i < in.length/2; i++){
            string1 += in[i] + " ";
        }
        for (int i = in.length/2; i < in.length; i++){
            stack.push(in[i]);
        }
        while (!stack.isEmpty()){
            string2 += stack.pop() + " ";
        }
        return string1.equals(string2);

    }

    public static boolean validateExpression(String[] in)
    {
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < in.length; i++){
            if (in[i].equals("(")){
                stack.push(in[i]);
            }else if (in[i].equals((")"))){
                if (stack.isEmpty()){
                    return false;
                }else if (stack.pop().equals("(")){
                    continue;
                }
            }
        }
        return true;
    }
}
