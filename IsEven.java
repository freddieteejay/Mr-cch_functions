import java.util.Scanner;

public class IsEven{
public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int userInput = scanner.nextInt();
		boolean result = Kata.IsEven(userInput);
		System.out.println(result);



}
}

