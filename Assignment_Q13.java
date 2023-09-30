import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int count = 0;
        int n = 1;
        while (count < N1) {
            int term = 3 * n + 2;
            if (term % N2 != 0) {
                System.out.println(term);
                count++;
            }
            n++;
        }
        sc.close();
    }
}