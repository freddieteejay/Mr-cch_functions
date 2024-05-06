import java.util.Scanner;
public class Tryagain{
public static void main(String[] args){
Scanner freddie = new Scanner(System.in);



int luck = 50;
System.out.print("Guess the number");
int Num = freddie.nextInt();
do {

System.out.print("Guess the number");
 Num = freddie.nextInt();
}

while(Num > luck ||Num < luck);
 System.out.print("you are correct");









}





}