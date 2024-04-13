import java.util.Scanner;

public class IsPrimeNumber{
public static void main(String... args){
	Scanner freddie = new Scanner(System.in);
	System.out.print("Enter number");
	  int userInput = freddie.nextInt();
	   boolean result = Kata.IsPrimeNumber(userInput);
	    System.out.print(result);
}

}