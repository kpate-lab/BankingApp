import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		//Create a Scanner object
		Scanner scanner = new Scanner(System.in);
		
		
		//Input
		System.out.println("Enter the first name:");
		String a = scanner.next(); //Read user input
		
		System.out.println("Enter the last name:");
		char b = scanner.next().charAt(0); //Read first character as input

		System.out.println("Enter the age: (only #s)");
		int c = scanner.nextInt(); //Read user input (number)

		//Output
		System.out.println(a.toUpperCase() + " " +  Character.toUpperCase(b) + " " + "is "+ c);
	}

}
