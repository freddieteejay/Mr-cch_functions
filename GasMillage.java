import java.util.Scanner;

public class GasMillage {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int miles = 1;
    int gallons = 1;					
    int miles = 0;
    int gallons = 0;
    float mpg = 0;



System.out.println("Enter miles or -1 to quit");
miles = scanner.nextInt();
 
   
System.out.println("Enter gallons");   
gallons = scanner.nextInt();

while (miles != -1){
  System.out.println("Enter miles or -1 to quit");
  miles = scanner.nextInt();

  System.out.println("Enter gallons or -1 to quit");
  gallons = scanner.nextInt();

  totalMiles = totalMiles + miles;
  totalGallons = totalGallons + gallons;

}
if (miles == -1) {
System.out.print("Terminate");
}
else{
     mpg = (float) totalMiles / totalGallons;
     System.out.println(mpg);
     }
} 
}