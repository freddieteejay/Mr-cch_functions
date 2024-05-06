import java.util.Scanner;
public class DiscountPercentage{
public static void main(String[]  args){
Scanner freddie = new Scanner(System.in);

System.out.print("Enter original price: ");
       int price = freddie.nextInt();

System.out.print("Enter discount: \n   %\r");
       int discount = freddie.nextInt();

double New = (double)discount / 100;
double X =price * New;
 double News = price - X;

 System.out.printf("sample output is: %.2f%n", News);


 




}




}