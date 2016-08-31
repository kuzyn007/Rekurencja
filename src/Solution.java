import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        
        System.out.println(factorial(i));
    }
    
    public static int factorial(int number) {
        if (number<=1) {
            return 1;
        }
        else {
           
            return factorial(number-1) * number;
        }

    }
}