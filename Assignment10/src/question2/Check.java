package question2;

public class Check {

	 int a = 10;
	    static int b = 20;

			void checkMethod()
			{
			
			this.a = 100;
			System.out.println(a);
			this.b = 600;
			
			System.out.println(b);
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Check().checkMethod();
	}

}
