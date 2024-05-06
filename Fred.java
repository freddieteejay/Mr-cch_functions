import java.util.Scanner;
public class Fred{
public static void main(String[] args){
Scanner freddie = new Scanner(System.in);



int num;
do {
     System.out.print("enter a number btwn 1 and 10:");
     num = freddie.nextInt();

  } while(num < 1 || num > 10);
        System.out.print(num + "is between 1 and 10");
        
}

} 




