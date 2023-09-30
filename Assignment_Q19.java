import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println(isArmstrong);
        sc.close();
    }
    static boolean isArmstrongNumber(int num) {
        int originalNumber = num;
        int numberOfDigits = countDigits(num);
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        return sum == originalNumber;
    }
    static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}