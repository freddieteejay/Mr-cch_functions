import java.util.Scanner;
public class ArithmeticCalculator {
public static void main(String[] args) {
Scanner freddie = new Scanner(System.in);

System.out.println("Enter first number: ");
int number1 = freddie.nextInt();

System.out.println("Enter second number: ");
 int number2 = freddie.nextInt();

int sum = number1 + number2;
double average = (double)sum / 2;
int product = number1 * number2;


 System.out.printf("the sum of number %d and %d is %d%n", number1, number2, sum);
System.out.printf("the average of number %d and %d is %.2f%n", number1, number2, average);
 System.out.printf("the product of number %d and %d is %d%n",number1, number2, product);

}


}