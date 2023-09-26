package Assignment_1;
import java.util.*;
public class armstrongNo {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for(int i = n1; i<n2; i++){
            int c,s=0,r;
            c = i;
            while(c>0){
                r = c%10;
                s = s+(r*r*r);
                c = c/10;
            }
            if(s==i){
                System.out.println(i);
            }
        }
    }
}
    

