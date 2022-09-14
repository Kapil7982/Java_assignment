package question2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Age{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your Date of Birth in dd-MM-yyyy");
    String age=sc.next();
  try {
      LocalDate d = LocalDate.parse(age, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
      LocalDate n = LocalDate.now();
      Period p = Period.between(d, n);
      
      if(d.getYear()<n.getYear())
      {
        System.out.println("You are "+ p.getYears() +" year old.");
      }
     
      else if (d.isAfter(n)) {
          System.out.println("Date should not be in Future");
      } 

  }
  catch (DateTimeParseException dtp){
      System.out.println("Please enter the date in correct format");
  }
}

}
