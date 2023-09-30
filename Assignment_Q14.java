import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int cumulativeSum = 0;

        while (sc.hasNext()) {
            int num = sc.nextInt();
            cumulativeSum += num;
            if (cumulativeSum < 0) {
                break;
            }

            numbers.add(num);
        }
        for (int num : numbers) {
            System.out.println(num);
        }

        sc.close();
    }
}