import java.util.Scanner;
   public class InvestmentValue{
   
   public static  void main(String[] args){
   Scanner scanner = new Scanner(System.in);

   System.out.print("Enter investment amount: ");
   float investmentAmount = scanner.nextFloat();

   System.out.print("Enter annual intrest rate: ");
   float annualIntrestRate = scanner.nextFloat();

   System.out.print("Enter number of years: ");
   int numberOfYears = scanner.nextInt();

    double  futureInvestmentValue = investmentAmount * Math.pow((1 + (annualIntrestRate / 12)), (numberOfYears * 12));


    System.out.printf("future value is %.2f%n", futureInvestmentValue); 
    
}




}