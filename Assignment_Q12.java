import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
        long n = num.nextLong();
        String q = String.valueOf(n);
        String qwe = q.replace("0","5");
        System.out.println(qwe);
    }
}