import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        long n = num.nextInt();
        int flag = 0;
        long m=n/2;
        for(int i=2;i<=m;i++){
            if(n%i==0){
                System.out.println("Not Prime");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Prime");
        }
    }
}