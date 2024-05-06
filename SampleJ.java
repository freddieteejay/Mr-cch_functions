import java.util.Scanner;
public class SampleJ{
public static void main(String[] args){
Scanner freddie = new Scanner(System.in);
int C = 50;
int H = 30;


System.out.print("Sample input: ");
int D = freddie.nextInt();

int S = 2 * C * D / H;
System.out.print(Math.sqrt(S));
}

}