package question6;

public class Child extends Parent{
	
	public Child() throws Exception{
		super();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Child c = new Child();
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
