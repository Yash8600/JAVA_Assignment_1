import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            int a = 0;
            int h = 0;
            int step =1;
            while(true){
                int d = step%2;
                if(d==1){
                    if(a+step<=p){
                        a=a+step;
                    }
                    else{
                        System.out.println("Harshit");
                        break;
                    }
                }
                else{
                    if(h+step<=q){
                        h=h+step;
                    }
                    else{
                        System.out.println("Aayush");
                        break;
                    }
                }
                step++;
            }
        }

    }
}
