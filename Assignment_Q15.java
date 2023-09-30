import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        for (int num = N1; num <= N2; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }

        sc.close();
    }
    static boolean isArmstrong(int num) {
        int originalNum = num;
        int numberOfDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        return sum == originalNum;
    }
}