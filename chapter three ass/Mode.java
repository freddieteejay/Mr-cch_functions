public class Mode{
public static void main(String... args){

int input[] = {1, 1, 2, 3, 4};
int count = 0;

for (int number = 0; number < input.length; number++){
	
	for(int num = 0; num < input.length; num++){
		if (input[number] == input[num]){
		count++;
	
		}
	}
}
System.out.print(count);








}



}