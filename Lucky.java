import java.util.Scanner;
public class Lucky {
public static void main(String[] args){
Scanner freddie = new Scanner(System.in);



int  num = 35;
int counter = 0;

System.out.println("Welcome to guess game");
System.out.println("How many times will you love to play the game");
int  games = freddie.nextInt();


while (counter < games) {



System.out.println("Enter your number: ");
int  numbe = freddie.nextInt();

if  (num == numbe) {
System.out.print("The number is correct   ");
}
else if ( numbe < num) {
System.out.print("The number is too low  ");
}
else {
System.out.print("The number is too high  ");

}
counter++;
}
}
}