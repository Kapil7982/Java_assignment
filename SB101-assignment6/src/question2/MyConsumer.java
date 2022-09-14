package question2;

import java.util.function.Consumer;

public class MyConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> c = (x) -> System.out.println(x.toUpperCase());
	    c.accept("Delhi");
	}

}

//A Consumer is a functional interface that accepts a single input and returns no output. In layman’s language, as the name suggests the 
//implementation of this interface consumes the input supplied to it.
