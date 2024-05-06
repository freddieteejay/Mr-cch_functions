import java.util.Scanner;
public class Frd{
public static void main(String[] args){
Scanner freddie = new Scanner(System.in);


System.out.print("Enter number");
int num = freddie.nextInt();



while(num < 1 || num > 10) {

     System.out.print(num + "is not between 1 and 10. try again: ");
      num = freddie.nextInt(); 

}

System.out.println(num + "is between 1 and 10.");

                                      







}






}