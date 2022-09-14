package evaluation;

public class Demo {

	public static void main(String[] args) {
		int a = 64;
		int b = 70;
		byte c = (byte)(a+b);  //typecast (a+b) to byte
		System.out.println(c);
		

	}
}

// Because the byte range is from -128 to 127 So the total is 64+70 is 138 which doesn't comes in the given range
// go to the circular motion.