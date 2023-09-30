import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner num  = new Scanner(System.in);
        int n = num.nextInt();
        int d = 0;
        int i = 0;
        int remin = 0;
        while(n!=0){
            remin = n%10;
            n = n/10;
            d+=remin * Math.pow(2,i);
            ++i;
        }
        System.out.println(d);
    }
}