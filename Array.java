import java.util.*;
public class Array{
public static void main(String... args){

ArrayList<Integer>number1 = new ArrayList<Integer>();
int total = 0;
int toto = 0;
ArrayList<Integer>number2 = new ArrayList<Integer>();
number1.add(2);
number1.add(4);
number1.add(5);
number1.add(1);
number1.add(6);


for(int count = 0; count < number1.size(); count++){

		total += number1.get(count);
}

for(int counter = 0; counter < number1.size(); counter++){
		toto = total - number1.get(counter);
		number2.add(toto);
}

System.out.print(number2);


}


}





/*function factorial(n) {
if (n == 0) {
return 1;
} else {
return factorial(n - 1) * n;
}
}
Sometimes, to show the output that a program produces, the expected output is written after it, with two slashes and an arrow in front.
console.log(factorial(8));
// → 40320*/