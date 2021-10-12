package demoTwo;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// int a = 12;
		// int b = 17;
		// int c = 342;
		// int d = a + b + c;
		// System.out.println("the summation is = " + d);
		/*Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("what is your name?");
		String userName= scanner.next();
		System.out.println(userName+" is a nice name");
		
		System.out.println("how old are you?");
		int age=scanner.nextInt();	
		System.out.println("you are "+age +"years old");
		*/
		/*
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("what is your name?");
		String name= scanner.next();
		System.out.println(name+"is a nice name");
		
		System.out.println("how old are you?");
		int age = scanner.nextInt();
		System.out.println("you are"+age+"years old");
		*/
		
		Scanner scanner =new Scanner(System.in);
		
		
		System.out.println("welcome to superfast Rollercoaster");
		System.out.print("what is your height in cm? : ");
		
		int height = scanner.nextInt();
		
		if(height<=145 || height>=200) {
			System.out.println("sorry, you are not eligable for the ride");
		}		
		
		else {
			System.out.println("hurray, you are eligable for the ride!!!");
			
		}
		
		
		
		
		
		
	}

}
