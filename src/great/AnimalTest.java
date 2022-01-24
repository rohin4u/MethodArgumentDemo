package great;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(544);
		list.add(233);
		list.add(211);
		list.add(766);
		
		Dog<Integer> dog = new Dog<>(list);
		
		
		List<String> stringList = new ArrayList<>();
		stringList.add("manali");
		stringList.add("delhi");
		stringList.add("kolkata");
		
		Dog<String> dog1 = new Dog<>(stringList);
		
		Animal a = new Animal();
		a.process(dog);
		a.process(dog1);

	}

}
