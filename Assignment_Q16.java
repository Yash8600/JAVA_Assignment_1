import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (isBostonNumber(N)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    static boolean isBostonNumber(int num) {
        int originalNum = num;
        int sumOfPrimeFactors = 0;

        for (int i = 2; i <= num; i++) {
            if (isPrime(i) && num % i == 0) {
                while (num % i == 0) {
                    sumOfPrimeFactors += sumOfDigits(i);
                    num /= i;
                }
            }
        }

        if (num > 1) {
            sumOfPrimeFactors += sumOfDigits(num);
        }

        return sumOfPrimeFactors == sumOfDigits(originalNum);
    }
}
