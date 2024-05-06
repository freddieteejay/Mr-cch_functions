import java.util.Scanner;
public class Shege{
public static void main(String[] args){
Scanner freddie = new Scanner(System.in);
System.out.print("How many number una wan enter: ");
int una = freddie.nextInt();

  int sum = 1;
int i = 1;
while (i <= una ){
i++;
System.out.print("Enter number between 1  and 1000: ");
 int num = freddie.nextInt();
sum = num + num;

}

System.out.println("The sum is = " + sum);


}
}