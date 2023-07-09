package collatz;
import java.util.Scanner;

public class Collatz{
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int temp=n;
		scan.close();
		System.out.print(n+" ");
		while(temp>1) {
			if(temp%2==0) {
				temp/=2;
				System.out.print(temp+" ");
			}
			else {
				temp=(3*temp)+1;
				System.out.print(temp+" ");
			}
		}
	}
}