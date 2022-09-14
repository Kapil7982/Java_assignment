package question2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal [] array = new Animal[3];
		 array[0] = new Dog();
	     array[1] = new Cat();
	     array[2] = new Tiger();
	     
	     System.out.println("===============================================");
	     
	     array[0].eat();
	     array[0].walk();
	     array[0].makeNoise();
	     
	     System.out.println("===============================================");
	     
	     array[1].eat();
	     array[1].walk();
	     array[1].makeNoise();
	     
	     System.out.println("===============================================");
	     
	     array[2].eat();
	     array[2].walk();
	     array[2].makeNoise();
	}

}
