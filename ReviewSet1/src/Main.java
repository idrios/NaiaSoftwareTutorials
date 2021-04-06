import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println(computeFactorial(12));
    }

    // Problem 1: make it so this function returns the sum of a and b
    public static int add2Integers(int a, int b){

        return a+b;
    }

    // Problem 2: make it so this function returns the factorial an inputted number, e.g. "5" returns "5!"
    // A factorial is the product of all numbers that came before it, so 5! = 5*4*3*2*1
    public static int computeFactorial(int input){
        int numba = input;
        int result = 1;
        while(numba > 0){
            result = result * numba;
            numba = numba - 1;
        }
        return result;
    }

    // Problem 3: make it so this function capitalizes all of the letters in a given character array
    // Helpful info: ASCII 'a' is 97, 'z' is 122, and 'A' is 65
    public static String customToUpper(String input){
        char[] letters = input.toCharArray();
        /** start code here */

        /** end code here */
        return String.valueOf(letters);
    }
}
