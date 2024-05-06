import java.util.Scanner;

public class Natural{
public static void main(String[]  args){
Scanner freddie = new Scanner(System.in);

int sum = 0;
int i = 1;

while(i <= 10){
i++;
System.out.print("Enter natural number: ");
int num = freddie.nextInt();
sum = num + num;

}
System.out.println("The sum is = " + sum);


}


}