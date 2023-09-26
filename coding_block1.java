package Assignment_1;

// 0 < N <= 1000000000
// Output Format
// Sample Input
// 2635
// Sample Output
// 11
// 5
// Explanation
// 5 is present at 1st position, 3 is present at 2nd position, 6 is present at 3rd position 
// and 2 is present at 4th position.
// Sum of odd placed digits on first line. 5 and 6 are placed at odd position. Hence odd place sum is 5+6=11
// Sum of even placed digits on second line. 3 and 2 are placed at even position. Hence even place sum is 3+2=5 */
import java.util.*;
public class coding_block1 {

    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
	String s[]=sc.next().split("");
	int a[]=new int[s.length];
	for(int i=0;i<s.length;i++)
	{
		a[i]=Integer.parseInt(s[i]);
	}
	int even=0,odd=0;
	for(int i=a.length-1;i>=0;i--)
	{
		int pos=a.length-i+1;
		if(pos%2==0)
		even=even+a[i];
		else
		odd=odd+a[i];
	}
	System.out.println(even);
	System.out.println(odd);

    }
}