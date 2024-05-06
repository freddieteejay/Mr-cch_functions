import java.util.Scanner;
public class Betnaija {
public static void main(String[] args){
Scanner freddie = new Scanner(System.in);

int counter = 0;

System.out.println("Welcome to betnaija");
System.out.println("How many times would you like to play");
int  game = freddie.nextInt();

while (counter < game) {

System.out.print("Enter either 0 or 1: ");
int number = freddie.nextInt();

if  (number == 0) {
System.out.println("1");
}

else if (number == 1){
System.out.println("0");
}
counter++;
}

}
}