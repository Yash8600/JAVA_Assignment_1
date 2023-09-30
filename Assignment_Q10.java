import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
        int q = num.nextInt();
        int w = num.nextInt();
        int qwe = 1;
        for(int i =1;i<=q && i<=w;i++){
            if(q%i==0 && w%i==0)
                qwe = i;
        }
        System.out.println(qwe);
    }
}