import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static int fibo(int i) {
        if (i <= 1) {
            return 1;
        } else {
            return fibo(i-1) + fibo(i-2);
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = n-1; i>=0; i--) {
            if (i==0) {
                System.out.print(fibo(i));
            } else {
                System.out.print(fibo(i)+" ");
            }
        }
        System.out.println();
    }
}
