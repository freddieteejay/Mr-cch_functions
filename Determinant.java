import java.util.Scanner;
public class Determinant{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter first score");
int first = scanner.nextInt();

System.out.println("Enter second score");
int second = scanner.nextInt();

System.out.println("Enter third score");
 int third = scanner.nextInt();

int total = first + second + third;
 
if (total >  50) {
System.out.printf("student passed by %d", total);
}
if (total < 49) {
System.out.printf("student failed by %d", total);

}

}
}