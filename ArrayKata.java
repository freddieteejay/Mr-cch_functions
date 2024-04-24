import java.util.Arrays;
public class ArrayKata{

public static int maximumIn(int [] array){
int maximum = 0;
for(int index = 0; index < array.length; index++){
maximum = array[0];
if (array[index] > maximum){

maximum = array[index];
        }

    }
return maximum;

}

public static int minimumIn(int [] array){
int minimum = 0;
for (int i = 0; i < array.length; i++){
minimum = array[0];
if (array[i] < minimum){
minimum = array[i];
}



}
return minimum;
}

public static int sumOf(int [] array){
int sum = 0;
for(int i = 0; i < array.length; i++){
sum += array[i];
}
return sum;

}

public static int sumOfEven(int[] array){
int sum = 0;
for (int i = 0; i < array.length; i++){
if (array[i] % 2 == 0){
sum += array[i]; 
}

}
return sum;
}


public static int sumOfOddNumbers(int[] array){
		int sum = 0;
	for(int i = 0; i < array.length; i++){
		if(array[i] % 2 != 0){
		sum += array[i];
}
	}
return sum;
}


public static String maximumAndMinimumIn(int[] array){
        int maximum = 0;
        int minimum = Integer.MAX_VALUE;
        int[] value = new int[2];
        for(int index = 0; index < array.length; index++){
            if(array[index] > maximum){
                 maximum = array[index];
                 value[0] = maximum;
            }
            if (array[index] < minimum){
                minimum = array[index];
                value[1] = minimum;
            }

		}

        return (Arrays.toString(value));
}

public static int[ ] firedrillin(int[] array){
	
	int[] number = new int[array.length * 2];
		for (int i = 0; i < array.length; i++){
			number[i * 2] = array[i];
			number[i * 2 + 1] = array[i] * 2;

		} 
	return number;
}

public static int[ ] chiassignment(int[] array){
       
	int [] arr = new int[array.length];
	for(int i = 0; i < array.length; i++){
		if(array[i] % 2 == 0){
                    arr[i] = 0;
                }
		else {
			arr[i] = 1;
		}
		}

return arr;




} 







}