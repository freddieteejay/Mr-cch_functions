import java.util.Scanner;



public class FinancialApplication {

      public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      

      System.out.print("Enter balance");
      int balance = input.nextInt();

      System.out.println("Enter and intrest rate");
       double intrestRate = input.nextFloat();

      double result = balance * (intrestRate / 1200);

      System.out.println("the interest is", + result);




}






}