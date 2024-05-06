import java.util.Scanner;
public class ShegePro{
public static void main(String[] args){
Scanner freddie = new Scanner(System.in);

System.out.println("Enter a number between 0 and 1000: ");
int number1 = freddie.nextInt();
int num1 = number1 % 10;
 int number2 = number1 / 10;
int num2 = number2 % 10;
int number3 = number2 / 10;
int num3 = number3 % 10;

int sum = num1 + num2 + num3;
System.out.println("");
System.out.printf("The sum of digits in %d is %d", number1, sum);





}
}  