import java.util.Scanner;

public class Clc{
   public static void main(String[] args) {
    Scanner freddie = new Scanner(System.in);
    
    System.out.println("Enter account number");
    int accountNumber = freddie.nextInt();

    System.out.println("Enter begining balance");
    int beginingBalance = freddie.nextInt();

    System.out.println("Enter total items charged by customer this month");
     int  charges = freddie.nextInt();

    System.out.println("Enter total credits applied to the customers account this month");
     int credits = freddie.nextInt();


     int newBalance = (beginingBalance + charges - credits); 

   System.out.printf("Current balance is %d%n", newBalance);
   if (newBalance > credits) {
     System.out.println("Credit limit exceeded");
}   
}





}