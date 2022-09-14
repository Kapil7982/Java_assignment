package question3;

public class Ximpl implements X{
	
	@Override
	public int convetStringToNumber(String s) {
		
		int num = Integer.parseInt(s);
		return num;
	}

	public static void main(String[] args) {
		
		X x = new Ximpl();
		System.out.println(x.convetStringToNumber("123"+456));
	}

	

}
