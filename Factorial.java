import java.util.Scanner;
public class Factorial{
public static void main(String[] args){
Scanner freddie = new Scanner(System.in);

System.out.print("Enter number: ");
       int Num = freddie.nextInt();

       int counter = 1;
       int New = 1;
           while (counter < Num) {
           counter++;
           New = New * counter;
       }
System.out.printf("the answer is %d", New);











}









}