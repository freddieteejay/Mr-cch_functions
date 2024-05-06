
import java.util.Scanner;
public class Chiworks{
public static void main(String... args){
Scanner freddie = new Scanner(System.in);
System.out.println("Enter number");
int input = freddie.nextInt();

int factor = 0;
int counter = 1;
while (counter <= input){
   if (input % counter == 0){
factor = factor +1;
}
counter = counter + 1;

} 
System.out.println(factor);


}
}