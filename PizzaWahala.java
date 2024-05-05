import java.util.Scanner;
public class PizzaWahala{
	public static void main(String... args){
		Scanner scanner =new Scanner(System.in);
			
		int sapaSlices = 4;
		int smallMoneySlices = 6;
		int bigBoysSlices = 8;
		int odogwuSlices = 12;
		int price1 = 2200;
		int price2 = 2400;
		int price3 = 3000;
		int price4 = 4200; 

		System.out.println("Welcome to iya afeez pizza joint\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nWe sell the best pizza in the whole Ajejunle!!!");
		System.out.println("Here is a list of packages we have and their price");
		System.out.println("Sapa size => $2,200\n>>>>>>>>>>>>>>>>>>>>>>\nSmall Money => $2,400\n>>>>>>>>>>>>>>>>>>>>>>\nBig boys => $3000\n>>>>>>>>>>>>>>>>>>>>>>\nOdogwu size=> $4200\n>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(" ");
		System.out.println("for Sapa size enter => sapa\nfor Small Money enter => small\nfor Big Boys enter big\nfor ODOGWU enter => ODO");
		String pizzaType = scanner.next();
		System.out.println("How many number of people did u budget for ? ");
			int totalPeople = scanner.nextInt();
		int totalBox = 0; 
		int leftOver =0;
		int price =0;
		if (pizzaType.equalsIgnoreCase("sapa" )){
				if (totalPeople % sapaSlices != 0){
					totalBox = totalPeople / sapaSlices + 1;
				}
				else{
					totalBox = totalPeople / sapaSlices;
				}
				leftOver = sapaSlices * totalBox - totalPeople;
				price = totalBox * price1;
			
		}
		else if (pizzaType.equalsIgnoreCase("small")){
				if (totalPeople % smallMoneySlices != 0){
					totalBox = totalPeople / smallMoneySlices + 1;
				}
				else{
					totalBox = totalPeople / smallMoneySlices ;
				}
				leftOver = smallMoneySlices * totalBox - totalPeople;
				price = totalBox * price2;
		}
		else if (pizzaType.equalsIgnoreCase("big")){
				if (totalPeople % bigBoysSlices != 0){
					totalBox = totalPeople / bigBoysSlices + 1;
				}
				else{
					totalBox = totalPeople / bigBoysSlices;
				}
				leftOver = bigBoysSlices * totalBox - totalPeople;
				price = totalBox * price3;

		}
		else if (pizzaType.equalsIgnoreCase("ODO")){
				if (totalPeople % odogwuSlices != 0){
					totalBox = totalPeople / odogwuSlices + 1;
				}
				else{
					totalBox = totalPeople / odogwuSlices;
				}
			leftOver = odogwuSlices * totalBox - totalPeople;
			price = totalBox * price4;
		}
		else {
			System.out.print("WE NO GET THAT ONE COME BACK TOMMOROW\n");
		}
		

		System.out.printf("Number of boxes of pizza to buy = %d", totalBox);
		System.out.printf("%nNumber of left over slices after serving = %d slices", leftOver );
		System.out.printf("%nThe total price is : %d", price);
		System.out.printf("%nThanks for your patronage!!!");

		
	}
}