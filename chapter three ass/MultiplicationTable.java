import java.util.Scanner;
public class MultiplicationTable{
public static void main(String... args){
Scanner input = new Scanner(System.in);

System.out.print("Enter sample: ");
int sample = input.nextInt();

for(int i = 1; i <= 12; i++){
System.out.printf("\n%d  x  %d  = %d", sample, i, sample * i);



}











}
}