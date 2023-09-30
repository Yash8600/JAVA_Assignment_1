import java.util.*;
public class Main {
    public static int LCM(int a, int b){
        int q = a*b;
        int qwe = 0;
        for(int i =1;i<=q;i++){
            if((i%a==0 && i%b==0)){
                qwe = i;
                break;
            }
        }
        return qwe;
    }
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int NUMBER = LCM(a,b);
        System.out.println(NUMBER);

    }
}