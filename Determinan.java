import java.util.Scanner;
public class Determinan{
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

if (total >= 100) {
System.out.print("invalid score can not print");
}

else if (total >= 80) {
System.out.printf("%s passed by A and score is %d", name, total);
}
else if (total >= 70) {
System.out.printf("%s passed by B and  score is %d", name, total);
}
else if (total >= 50) {
System.out.printf("%s passed by C and score is %d", name, total);
}
else if (total >= 40) {
System.out.printf("%s passed by D and score is %d", name, total);
}
else if (total <= 40) {
System.out.printf("%s failed by F and score is %d", name, total);
}

}
}