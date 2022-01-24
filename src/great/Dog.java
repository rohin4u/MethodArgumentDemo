package great;

import java.util.List;

public class Dog<T> {
	
	List<T> l;
	public Dog(List<T> l ) {
		
		this.l=l;
	}
	public List<T> solve(){
		
		return l;
	}

}
