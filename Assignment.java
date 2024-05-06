import java.util.Scanner;


public class Assignment {

   public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter weight in pounds: ");
   	float weight = input.nextfloat();

  	System.out.print("Enter height in inches: ");
    	float height = input.nextfloat();

   	float newWeight = weight * 0.4536;
        float newHeight = height * 0.0254;

        float heightSquare = newHeight ** 2;
        float bmi = newWeight/heightSquare;
        


     	System.out.printf("bmi equals to %d%n", bmi);



}





}
   












