package great;

public class Animal {
	
	
	public <T extends Dog> T process(T dog) {
		
		System.out.println(dog.solve());
		
		
		return dog; 
	}

}
