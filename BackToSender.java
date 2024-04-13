import java.util.Scanner;
public class BackToSender{
public static void main(String... args){
Scanner scanner = new Scanner(System.in);
String decision;
do{
System.out.print("Enter the rider's sucessful deliveries :  ");
		int sucessfullDeliveries = scanner.nextInt();
int result = Kata.deliveries(sucessfullDeliveries);
System.out.print("Expected Result :  " + result);
System.out.print("\nDo you want to perform this operation again(yes / no) ? : ");
		decision = scanner.next();
if (decision.equalsIgnoreCase("no")){
break;}
}while(decision.equalsIgnoreCase("Yes"));

System.out.print("~~ Operation Sucessfull ~~");


















}

}