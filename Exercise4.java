import java.util.Scanner;
public
 class Exercise4{
        public static void main(String[] args){
            	Scanner input = new Scanner(System.in);
            	int x = 0;
            	int count = 0;

            	System.out.println("Enter a number from 1-10: ");
                x = input.nextInt();

                if(x > 10){
                 System.out.print("Invalid number entered. Please try again. ");
                 System.out.println("Enter a number from 1-10: ");
                x = input.nextInt();
                  }
                else if(x < 1){
                 System.out.println("Invalid number entered. Please try again.");
                 System.out.println("Enter a number from 1-10: ");
                x = input.nextInt();
                    }
    while(x == 10){
        count = count +10;
        System.out.println(+count+". Aine");
        x++;
    }
     while(x == 9){
        count = count +9;
        System.out.println(+count+". Aine");
        x++;
    }
    while(x == 8){
        count = count +8;
        System.out.println(+count+". Aine");
        x++;
    }
    while(x == 7){
        count = count +7;
        System.out.println(+count+". Aine");
        x++;
    }
    while(x == 6){
        count = count +6;
        System.out.println(+count+". Aine");
        x++;
    }
    while(x == 5){
        count = count +5;
        System.out.println(+count+". Aine");
        x++;
    }
while(x == 4){
        count = count +4;
        System.out.println(+count+". Aine");
        x++;
    }
    while(x == 3){
        count = count +3;
        System.out.println(+count+". Aine");
        x++;
    }
    while(x == 2){
        count = count +2;
        System.out.println(+count+". Aine");
        x++;
    }
    while(x == 1){
        count = count +1;
        System.out.println(+count+". Aine");
        x++;
    }
}
 }
