package Assignment_1;
import java.util.*;
public class binaryToDecimal {
    public static void main(String args[]) {
        int N,c=0,dec=0,n;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary no ");
		N=sc.nextInt();
		n=N;
		while(n>0){
		c+=1;
		n/=10;
		}
		for(int i=0;i<=c;i++){
			dec+=((N%10)*Math.pow(2,i));
			N/=10;}
		System.out.print("decimal value of binary no is "+dec);
    }
}
