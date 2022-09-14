package question3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<AdditionalMembers> library = new TreeSet<AdditionalMembers>(new AdditionalMembers());
		int count = 1;
		while (library.size() < 5) {
			System.out.println("Enter Member " + count++ + " Details :");

			System.out.println("Enter Member Id");
			int id = sc.nextInt();
			System.out.println("Enter Member Name");
			String name = sc.next();
			System.out.println("Enter MemberShip Number");
			int num = sc.nextInt();
			boolean check = true;
			LocalDate date1 = null;
			while (check) {
				System.out.println("Member Enddate in formate dd-MM-yyyy");
				String endDate = sc.next();
				try {
					DateTimeFormatter fromdate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					date1 = LocalDate.parse(endDate, fromdate);
					check = false;
				} catch (Exception e) {
					System.out.println("Please enter valide date");
				}
			}
			AdditionalMembers l = new AdditionalMembers(id, name, num, date1);
			library.add(l);
			System.out.println("Total members => " + library.size());
		}
		for (AdditionalMembers i : library) {
			System.out.println(i);
		}

	}

}
