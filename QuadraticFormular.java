import java.util.Scanner;
 public class QuadraticFormular {
public static void main(String[] args){
Scanner freddie = new Scanner(System.in);


System.out.print("Enter value for a");
double a = freddie.nextDouble();

System.out.print("Enter value for b");
double b = freddie.nextDouble();

System.out.print("Enter value for c");
double c = freddie.nextDouble(); 

double num = b * b  - 4.0 * a * c; 
double x = (-b + Math.sqrt(num)) / (2.0 * a);   
double y = (-b - Math.sqrt(num))/ (2.0 * a);

System.out.println("answer is" + x + "or" + y);


}


}