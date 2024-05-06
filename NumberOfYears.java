import java.util.Scanner;


public class NumberOfYears{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of minutes ");
    int minutes= input.nextInt();


    int numberOfMinutesInAYear = 525600;
    int year = minutes / numberOfMinutesInAYear;

    
    int numberOfMinutesInADay = 60 * 24;
    int day = minutes % numberOfMinutesInAYear;
    int totalDays = day / numberOfMinutesInADay;

  System.out.printf("%d minutes is approximately %d years and %d days", minutes, year, totalDays );


}











}

    

