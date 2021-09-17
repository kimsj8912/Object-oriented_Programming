import java.util.*;

// An exploration of basic input and output.
class BasicIO {
	
	//Reads and processes string input.
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		// get first input
		System.out.print("Enter your name: ");
		String name = stdin.nextLine();
		
		// get second input
		System.out.print("Enter your age: ");
		int years = stdin.nextInt();
		
		// get third input
		System.out.print("Enter your height");
		int height = stdin.nextInt();
		
		// display output in console
		System.out.println("your name is " + name + " and you are " + years + " years old");
		
		// convert age to the number of days.
		System.out.println(years * 365);
		
		// Date, name, age, height
		System.out.printf("2021년 09월 15일 현재 %s(%d)의 키는 %d cm 입니다.", name, years, height);
	
	} // method main

} //class BASIC_IO
