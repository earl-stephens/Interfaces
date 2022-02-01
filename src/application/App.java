package application;

public class App {

	public static void main(String[] args) {
		// Interfaces are a fundamental building block in Java
		
		/* Now can have an array of different objects due
		 * to the interface
		 */
		
		Describable[] objs = {new Person(), new Computer()};
		
		for(Describable obj: objs) {
			System.out.println(obj.getDescription());
		}
	}

}
