import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
        int q = num.nextInt();
        int a = 0 , b = 1;
        int c = a;
        for(int i = 2;i<=q;i++){
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}