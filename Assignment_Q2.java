import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        int n = N;
        int Digit = num.nextInt();
        int count = 0;
        int Count = 0;
        while(N!=0){
            N = N/10;
            Count++;
        }
        for(int i =0;i<Count;i++){
            int Num = n%10;
            if(Num==Digit){
                count+=1;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}