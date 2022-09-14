package question2;

public class Demo {

	Demo(){
		
		System.out.println("Without parameter constructor");
	}
	
    Demo(String s){
		
		System.out.println("Parameter with the String constructor");
		System.out.println(s);
	}

	Demo(int i){
		
		System.out.println("Parameter with the Integer constructor");
		System.out.println(i);
		
	}
	
	Demo(float f)
	{
		System.out.println("Parameter with the float constructor");
		System.out.println(f);
	}
	
	public static void main(String[] args) {
		
		Demo d1=new Demo();
		
		
	}
	
}
