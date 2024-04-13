import java.util.Scanner;
public class PrimeNumberDetector{
public static void main(String... args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number ");
	int userInput = scanner.nextInt();



boolean result = Kata.primeNumberDetect(userInput);
System.out.print(result);


}

}