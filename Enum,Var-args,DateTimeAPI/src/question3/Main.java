package question3;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today =  LocalDate.now();            
		LocalDate week = today.plusWeeks(1);     
		
		 
	
		 
		LocalDate now =  LocalDate.now();     
		LocalDate sameDayNextMonth = now.plusMonths(1);       
		    

		 
		LocalDate sameDayNextYear = now.plusYears(1);    
		
		LocalDate now1 =  LocalDate.now();
		LocalDate sameDayNext10Year = now1.plusYears(10);    
		
		
		
		System.out.println("Today's date:- "+ today);
		System.out.println("Date after one week:- "+ week);
		
		
		System.out.println("=================================================");
		System.out.println("Today's date:- "+ now);
		System.out.println("Date after one months :- "+ sameDayNextMonth);
		
		System.out.println("=================================================");
		
		System.out.println("Today's date:- "+ today);
		System.out.println("Date after 1 years:- "+ sameDayNextYear);
		
		System.out.println("=================================================");
		
		System.out.println("Today's date:- "+ today);
		System.out.println("Date after 10 years:- "+ sameDayNext10Year);
	}

}
