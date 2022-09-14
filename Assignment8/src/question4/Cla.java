package question4;

public class Cla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        int fact = 1;
      
        if(args.length==1) {
        	String str = args[0];
           int number = Integer.parseInt(str);
            for(int i=1;i<=number;i++) {
                fact = fact*i;
            }
            System.out.println(fact);
        }
        else if(args.length==2) {
        	String str1 = args[0];
        	String str2 = args[1];
        	int number  = Integer.parseInt(str1);
        	int number1 = Integer.parseInt(str2);
        	
        	int number2 = Math.abs(number- number1);
        	 
        	for(int i=1; i<=number2; i++)
        	{
        		fact = fact*i;
        	}
            System.out.println(fact);
        }
        else {
            System.out.println("Error");
        }
	}

}
