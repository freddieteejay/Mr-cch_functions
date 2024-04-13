
public class Kata{
	public static boolean IsEven(int userInput){
		if(userInput % 2 == 0){
	   	 	return true;
		} 
			return false;
	}
	

public static boolean IsPrimeNumber(int userInput){
		if(userInput % 2 == 0){
			return true;
	}
			return false;
}


public static int Subtract(int a, int b){
 int sub = Math.abs(a -b);

return sub;
		
}

public static float Isdivide(int a, int b){
float div = a / b;

return div;

}

public static int factorOf(int userInput){
int count = 0;
for(int index = 1; index <= userInput; index++ ){
if (userInput % index == 0){
  count += 1;
}

}
return count;

}
public static boolean primeNumberDetect(int userInput){
int count = 0;
for(int i = 1; i <= userInput; i++){
if (userInput % i == 0){
count += 1;
}
}

if (count <= 2){
return true;
}
return false;

}

public static boolean palindrome(int number){
	String value = String.valueOf(number);
	String newValue = " ";
     for(int index = value.length() - 1; index >= 0; index-- ){
char element = value.charAt(index);
String newElement = String.valueOf(element);
	newValue += newElement;
}

return value. equals(newValue);



}

public static int factorial(int number){

 int num = 1;
 for (int counter = 1; counter <= number; counter++) {
    num = num * counter;
       
}
return num;

}

public static boolean isSquare(int number){
if  (number % 2 != 0){
	return true;
}
	return false;

}

public static int deliveries(int sucessfullDeliveries){
int expectedResult = 0;

if (sucessfullDeliveries >= 70){
	expectedResult = sucessfullDeliveries *  500 + 5000;		
} 
else if(sucessfullDeliveries >59 && sucessfullDeliveries < 70){
	expectedResult = sucessfullDeliveries *  250 + 5000;
}
else if (sucessfullDeliveries > 49 && sucessfullDeliveries < 60){
	expectedResult = sucessfullDeliveries * 200 + 5000;
}
else if(sucessfullDeliveries < 50){
	expectedResult = sucessfullDeliveries * 160 + 5000;
}
return expectedResult;





}












}