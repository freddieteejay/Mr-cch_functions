import java.util.Scanner;
public class NumCount{
public static void main(String[] args){
Scanner freddie = new Scanner(System.in);

System.out.print("How  many number u wan enter ");
int num = freddie.nextInt();
int i = 1;
int positive = 0;
int negative = 1;
int zero = 0;

while (i <= num){
i++;
System.out.print("Enter number: ");
int x = freddie.nextInt();

if(x > 0){
positive += 1;
}
else if (x < 0){
negative += 1;
}
else if(x == 0){
zero += 1;
}

}
System.out.printf("\nThe number of positive is: %d",  positive);
System.out.printf("\nThe number of negative is: %d",  negative);
System.out.printf("\nThe total zeros entered is: %d",  zero);


} 



}