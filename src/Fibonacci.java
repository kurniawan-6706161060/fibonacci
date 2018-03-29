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
        int sum = 0;
        for (int i = 0; i<n; i++) {
            sum += fibo(i);
        }
        System.out.println(sum);
    }
}
