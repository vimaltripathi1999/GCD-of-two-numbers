import java.util.*;
public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2 number\n");
		a=sc.nextInt();
		b=sc.nextInt();
		Boolean flag=true;
		while(flag) {
			rem=a%b;
			if(rem==0) {
				System.out.println("The gcf of the given number is "+b);
				flag=false;
			}
			a=b;
			b=rem;
		}
	}

}
