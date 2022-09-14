package question4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start Date in dd-MM-yyyy format");
        String startDate = sc.next();
        System.out.println("Enter End Date in dd-MM-yyyy format");
        String endDate = sc.next();
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate start = LocalDate.parse(startDate,dtf);
            LocalDate end = LocalDate.parse(endDate,dtf);
            if(ChronoUnit.DAYS.between(start, end)<0){
                System.out.println("Start date should be smaller than End date");
            }else {
                System.out.println("Total Wages : "+ChronoUnit.DAYS.between(start, end)*1200);
            }
        } catch (Exception e) {
            System.out.println("Please enter date in dd-MM-yyyy format");
        }
	}
}
