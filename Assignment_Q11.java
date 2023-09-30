import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long x = scn.nextLong();
        long[] arr = new long[20];
        int c = 0;
        long n=x;
        while (n != 0) {
            long r = n % 10;
            arr[c] = r;
            c++;
            n = n / 10;
        }
        for (int i = 0; i < c; i++) {
            if (i != c - 1) {
                if (arr[i] >= 5) {
                    arr[i] = 9 - arr[i];
                }
            } else {
                if (arr[i] >= 5 && arr[i] <= 8) {
                    arr[i] = 9 - arr[i];
                }
            }
        }
        for (int i = c - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
