import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        String N = num.next();
        int odd_sum = 0;
        int even_sum = 0;
        String s = "";
        String q= "";
        String ss= "";
        for(int i =N.length()-1;i>=0;i--){
            char c = N.charAt(i);
            s = s + c;
        }
        for(int j = 0;j<s.length();j++){
            if(j%2!=0){
                char c = s.charAt(j);
                q = q + c;
                int nume = Integer.parseInt(q);
                q = "";
                even_sum = even_sum+nume;
            }
            if(j%2==0){
                char w = s.charAt(j);
                ss = ss + w;
                int Num = Integer.parseInt(ss);
                ss = "";
                odd_sum = odd_sum+Num;
            }
        }
        System.out.println(odd_sum);
        System.out.println(even_sum);
    }
}
