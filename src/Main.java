import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// W.I.P
		// This project will start once Chez_Poofz is done learning Java.
		// NOT FINISHED
		
		// I'm gonna make a random calculator program to pass the time
		// until operation tempus actually starts lmao
		
		Scanner scanner = new Scanner(System.in);
		
		char op;
		int num1;
		int num2;
		
		try {
			System.out.print("Enter a number: ");
			num1 = scanner.nextInt();
			
			System.out.println();
			
			System.out.print("Enter another number: ");
			num2 = scanner.nextInt();
			
			System.out.println();
			
			System.out.println("Example: *, /, +, -");
			System.out.println("Enter an operator: ");
			op = scanner.next().charAt(0);
			
			switch(op) {
			case '+':
				System.out.println(num1 + num2);
				break;
			case '-':
				System.out.println(num1 - num2);
				break;
			case '*':
				System.out.println(num1 * num2);
				break;
			case '/':
				System.out.println(num1 / num2);
				break;
			default:
				System.out.println("Invalid operator.");
				break;
			}
			
		}
		
		catch(ArithmeticException e) {
			System.out.println("Can't divide by zero.");
		}
		
		catch(InputMismatchException e) {
			System.out.println("Enter a proper number.");
		}
		
		catch(Exception e) {
			System.out.println("You messed something up.");
		}
		
		finally{
			scanner.close();
		}
		
	}

}
