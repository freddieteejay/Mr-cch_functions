import java.util.Scanner;
     public class DrivingCost {

     public static void main(String[] args){

     Scanner input = new Scanner(System.in);
     
     System.out.println("Enter the driving distance");
      float distance = input.nextFloat();

     System.out.println("Enter miles per gallon");
      float miles = input.nextFloat();

     System.out.println("Enter price per gallon");
      float price = input.nextFloat();
     
     double cost = price * (distance / miles);
     

    System.out.printf("the cost of driving is $%.2f%n", cost);





}






}