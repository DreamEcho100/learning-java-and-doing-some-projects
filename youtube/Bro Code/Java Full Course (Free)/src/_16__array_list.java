import java.util.ArrayList;

public class _16__array_list {
	
	public static void main(String[] args) {
		// ArrayList:
		// A resizable array.
		// Elements can be added and removed after compilation phase
		// Stores reference data types
		//
		
		ArrayList<String> food = new ArrayList<String>();

		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		System.out.println(food);
		
		food.set(0, "koshary");
		
		System.out.println(food);
		
		food.remove(2);
		
		System.out.println(food);
		
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		food.clear();
		
		System.out.println(food);
		
		
	}

}