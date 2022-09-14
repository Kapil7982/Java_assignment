package question5;


import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class WordProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student's Article");
		String str=sc.nextLine();
		String str1="";
		
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)==',' ||str.charAt(i)==';' ||str.charAt(i)==':' ||str.charAt(i)=='.' ||str.charAt(i)=='?' ||str.charAt(i)=='!' );
			else {
				str1+=str.charAt(i);
			}
		}
		String[] strarray=str1.split(" ");
		SortedSet strnew=new TreeSet();
		for(int i=0;i<strarray.length;i++) {
			strnew.add(strarray[i].toLowerCase());
		}
		System.out.println("Number of words"+(strarray.length+1));
		System.out.println("Number of unique words"+(strnew.size()+1));
		System.out.println("The words are");
		int count=1;
		for(Object i:strnew) {
			System.out.print((count)+". "+i);
			count++;
		}
	}
}

