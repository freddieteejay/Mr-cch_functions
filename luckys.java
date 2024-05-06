import java.util.Scanner;
public class Luckys {
public static void main(String[] args){
Scanner freddie = new Scanner(System.in);



int  num = 35;
System.out.println("Welcome to guess game");

for ( num = 0;   num <= 100; num++) {
if (num == 35) {
break; 
}
System.out.printf("%d ", num);
}
System.out.print("Enter your number:");
int  number = freddie.nextInt();

if  (num == number) {
System.out.print("The number is correct");
}
else if ( number < num) {
System.out.print("The number is too low");
}
else {
System.out.print("The number is too high");
}
}
}
