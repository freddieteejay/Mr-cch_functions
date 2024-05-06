import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int miles = 1;
    int gallons = 1;   
    int totalMiles = 0;
    int totalGallons = 0;
    float mpg = 0;

System.out.println("Enter miles");
miles = scanner.nextInt();
 
   
System.out.println("Enter gallons");   
gallons = scanner.nextInt();

while (miles != -1){
  System.out.println("Enter miles");
  miles = scanner.nextInt();

  System.out.println("Enter gallons");
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