import java.util.Scanner;
public class ChiAss{
public static void main(String[] args){
Scanner freddie = new Scanner(System.in);
System.out.print("Enter your first number: ");
int num1 = freddie.nextInt();

  System.out.print("Enter second number: ");
int num2 = freddie.nextInt();

int x = 1;
int i = 1;
while (i <= num2){
i++;
x*= num1;  
}


System.out.printf("%d raise to power %d is %d", num1, num2, x);







}
}