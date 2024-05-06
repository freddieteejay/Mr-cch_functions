import java.util.Scanner;



public class Bmi {

     public static void main(String[] args) {     


        Scanner input = new Scanner(System.in);


        System.out.print("Enter weight in pounds: ");
         float number1 = input.nextFloat();

        System.out.print("Enter height in inches: ");
        int number2 = input.nextInt();


        int Square2 = number2 * number2;

        int bmi = number1 / square2; 

         System.out.printf("bmi is %d%n", bmi);

        




}







}