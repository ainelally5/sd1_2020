public class Exercise5 {
public static void main(String[] args) {   
 
       int[] x = {20, 30, 40, 50};
       int sum = 0;
       double average = 0;

       
       for
        (int i=0; i < x.length ; i++)
        sum = sum + x[i];
        System.out.println("Sum value of the array is : " + sum); 

        for
        (int i=0; i < x.length; i++)
        average = sum / x.length;
        System.out.println("Average value of the array is : " + average); 
   }
}