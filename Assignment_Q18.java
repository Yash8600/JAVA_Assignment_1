import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int n1 = sc.nextInt();
            int even_no = 0;
            int odd_no = 0;
            while(n1!=0){
                int r = n1%10;
                if((r)%2==0){
                    even_no+=n1%10;
                }
                else{
                    odd_no+=n1%10;
                }
                n1=n1/10;
            }
            int e = even_no%4;
            int f = odd_no%3;
            if((e==0)||(f==0)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            n--;
        }
    }
}
