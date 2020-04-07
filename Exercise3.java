import java.util.Scanner;

class Exercise3
{
  public static void main (String[] args )
  {
    Scanner scan = new Scanner( System.in );
    int x;
    System.out.print("Enter a number: ");
    x = scan.nextInt();
    if(x==19){
        System.out.print("Input matches my age. ");
       }else if(x < 19){
         System.out.println("Input is less than my age. ");

        }else if(x >19){
         System.out.println("Input is greater than my age.");
        }

  }
}