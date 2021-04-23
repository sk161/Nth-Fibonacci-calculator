import java.math.*;
import java.util.Scanner;

class Fib{
	public static void main(String args[]){
		
		//Getting N value from user 
		Scanner in=new Scanner(System.in);
		System.out.print("\nEnter N value: ");	
		int n=in.nextInt();
		
		//Calling Fib function & passing N value
		Fib(n);
	}
	
	private static void Fib(int n){
		
		//Declaring & initializing variables
		//BigInteger can hold values upto 2^integer.MAX_VALUE
		String str1="",str2="";
		BigInteger a=new BigInteger("0");
		BigInteger b=new BigInteger("1");
		BigInteger t=new BigInteger("0");
		
		//printing initial values
		if(n<=1) 
			System.out.println("\n0th Number : 0");
		else if(n<=2)
			System.out.println("\n1st Number : 1");
		
		//computing value in iterative method
		else{
			for(int i=2;i<=n;i++){
				t=a.add(b);
				str1=""+t;
				str2=""+b;
				a=new BigInteger(str2);
				b=new BigInteger(str1);
			}
			System.out.println("\n"+n+"th Number : "+t);
		}
	}
}