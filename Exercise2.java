import java.util.Scanner;
public class Exercise2{
        public static void main(String[] args){
            //uncomment next line if program requires input
            	Scanner input = new Scanner(System.in);
            	int number1 = 0;
            	int number2 = 0;
            	int result 	= 0;

            	System.out.println("Enter first number: ");
            	number1 = input.nextInt();

            	System.out.println("Enter second number: ");
				number2 = input.nextInt();

				result = number1 + number2;
				System.out.println(number1+" + " +number2 + " = " + result);


				result = number1 - number2;
				System.out.println(number1+" - " +number2 + " = " + result);

				result = number1 * number2;
				System.out.println(number1+" * " +number2 + " = " + result);

        }
}