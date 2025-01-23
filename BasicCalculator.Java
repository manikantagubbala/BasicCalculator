import java.util.Scanner;

public class Casio {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter num1 : ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter num2 :");
		int num2 = scanner.nextInt();
		
		System.out.println("Select an operation : ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		System.out.println("Enter the choice 1 >= 4 :" );
		int choice = scanner.nextInt();
		
		double result = 0;
		
		switch(choice) {
			case 1:
				result = num1 + num2;
				break;
			case 2:
				result = num1 - num2;
				break;
			case 3:
				result = num1 * num2;
				break;
			case 4:
				if(num2 == 0) {
					System.out.println("Can't divide with 0 ");
				}
				else {
					result = num1 / num2;
				}
				break;
				default:
					System.out.println("can't find any choice number.");
					
		}
		System.out.println("Result : " + result);
	}
}
