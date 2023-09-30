import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        String s = Integer.toString(N);
        String ss = "";
        for(int i= s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            ss = ss + c;
        }
        System.out.println(ss);
    }
}