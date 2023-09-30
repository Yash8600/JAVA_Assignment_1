import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minFahrenheit = sc.nextInt();
        int maxFahrenheit = sc.nextInt();
        int step = sc.nextInt();

        for (int fahrenheit = minFahrenheit; fahrenheit <= maxFahrenheit; fahrenheit += step) {
            int celsius = (int) ((5.0 / 9.0) * (fahrenheit - 32));
            System.out.println(fahrenheit + " " + celsius);
        }

        sc.close();
    }
}