import java.util.Scanner;
public class Determinants{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter name: ");
String name = scanner.nextLine();

System.out.println("Enter first score");
int first = scanner.nextInt();

System.out.println("Enter second score");
int second = scanner.nextInt();

System.out.println("Enter third score");
int third = scanner.nextInt();

int total = first + second + third;

if (total > 100) {
System.out.println("invalid score cannot calculate");
}

 else if (total > 50) {
System.out.print(name+ " passed by " +total);
}

 else  {
System.out.print(name+ " failed by " +total);
}


}
}