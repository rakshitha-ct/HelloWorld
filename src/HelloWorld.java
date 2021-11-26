import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("hello world!!!");
	
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		a=sc.nextInt();
		System.out.println("Enter b:");
		b=sc.nextInt();
		int c=a+b;
		System.out.println("result c="+c);
		
	}

}
