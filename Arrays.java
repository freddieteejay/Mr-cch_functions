public class Arrays{
public static void main(String... args){

	int[] input = {2, 4, 5, 1, 6};
	int total = 0;
	

	for(int count = 0; count < input.length; count++){

		total += input[count];
}


int toot = 0;
for (int counter = 0; counter < input.length; counter++){
	toot = total - input[counter];

System.out.print(toot + ", ");
	
}

}


}