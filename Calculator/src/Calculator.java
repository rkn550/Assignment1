import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    char operator;
		    Double num1, num2, result;

		    try (// create an object of Scanner class
			Scanner sc = new Scanner(System.in)) {
				// ask users to enter operator
				System.out.println("Choose an operator: +, -, *, /");
				operator = sc.next().charAt(0);

				// ask users to enter numbers
				System.out.println("Enter first number");
				num1 = sc.nextDouble();

				System.out.println("Enter second number");
				num2 = sc.nextDouble();
			}

		    switch (operator) {

		      // performs addition between numbers
		      case '+':
		        result = num1 + num2;
		        System.out.println(num1 + " + " + num2 + " = " + result);
		        break;

		      // performs subtraction between numbers
		      case '-':
		        result = num1 - num2;
		        System.out.println(num1 + " - " + num2 + " = " + result);
		        break;

		      // performs multiplication between numbers
		      case '*':
		        result = num1 * num2;
		        System.out.println(num1 + " * " + num2 + " = " + result);
		        break;

		      // performs division between numbers
		      case '/':
		        result = num1 / num2;
		        System.out.println(num1 + " / " + num2 + " = " + result);
		        break;

		      default:
		        System.out.println("Invalid operator!");
		        break;
		        
	    }
		    
	}

}
