import java.util.Scanner;
public class Guessc{
public static void main(String[] args){
Scanner freddie = new Scanner(System.in);


int Luck = 35;
System.out.print("Enter yur lucky number");
int num = freddie.nextInt();

do {


System.out.print("Guess the number: ");
 num = freddie.nextInt();
if (num > 35){
System.out.print("too high ");
}
else if (num < 35){
System.out.print("too low ");

}


}
while (num != 35);

System.out.print("You are correct");




}
}