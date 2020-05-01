import java.util.Scanner;
public class Exercise6{
        public static void main(final String[] args){
            	final Scanner input = new Scanner(System.in);
                String symbol = "";
                int rows = 0;
                int columns = 0;

            	System.out.println("Enter a symbol: ");
                symbol = input.nextLine();
                System.out.println("Enter number of rows: ");
                rows = input.nextInt();
                System.out.println("Enter number of columns: ");
                columns = input.nextInt();
                
      for 
      (int i = 0; i < columns; i++) {
            for 
            (int j = 0; j < columns - i; j++) {
                System.out.print(""+symbol);
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(""+symbol);
            }
            System.out.println();
        }
    }
}
