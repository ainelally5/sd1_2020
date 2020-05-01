import java.util.Random;
public class Exercise7{
     public static void main(final String[] args){
                final Random input = new Random();
     {
         }
            int value1 = 10;
            int value2 = 100;
            


                System.out.println("First Value: "+value1);
                value1 = input.nextInt();
                System.out.println("Second Value: "+value2);
                value2 = input.nextInt();
                System.out.println("Reorganized Array: ");
        }
        
public int[] reorganize (int [] numbers){

    int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

    Random rnd = new Random();
    for(int i = numbers.length - 1; i >= 0; i--){
        int index = rnd.nextInt(i + 1);
        int a = numbers[i];
        numbers[i] = a;
        }
        return numbers;
    }
}