public class Multiplication {
public static void main(String...args){

	int result = 0;

	for (int counter = 1; counter <= 12; counter++) {
	for (int i = 1; i <= 12; i++) {
		result = counter * i;

	System.out.printf("%s x %s = %d\t", i, counter, result);
	}
	System.out.print( "\n");
	}

}


}