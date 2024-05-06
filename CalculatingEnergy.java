import java.util.Scanner;
      public class CalculatingEnergy {

      public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the amount of water in kilograms");
      float waterInKilograms = input.nextFloat();


      System.out.println("Enter the initial temperature");
      float initialTemperature = input.nextFloat();


      System.out.println("Enter the final temperature");
      float finalTemperature = input.nextFloat();



      double energyNeeded = waterInKilograms * (finalTemperature - initialTemperature) * 4184;

      System.out.println("the energy needed is" + energyNeeded);


      

}



}