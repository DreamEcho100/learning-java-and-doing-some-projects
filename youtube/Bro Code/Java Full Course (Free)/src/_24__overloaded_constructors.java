
public class _24__overloaded_constructors {
	public static void main(String[] main) {
		// Overloaded Constructors:
		// - Multiple constructors within a class with the same name, but have different parameters.
		// - Signature = name + parameters
		// 
		
		_24_1_pizza pizza1 = new _24_1_pizza("thicc crust");
		System.out.println("Here is the ingredients of your pizza:");
		System.out.println(pizza1.bread);
		System.out.println(pizza1.cheese);
		System.out.println(pizza1.sauce);
		System.out.println(pizza1.topping);
		
		System.out.println();
		
		_24_1_pizza pizza2 = new _24_1_pizza("thicc crust", "tomato");
		System.out.println("Here is the ingredients of your pizza:");
		System.out.println(pizza2.bread);
		System.out.println(pizza2.cheese);
		System.out.println(pizza2.sauce);
		System.out.println(pizza2.topping);
		
		System.out.println();
		
		_24_1_pizza pizza3 = new _24_1_pizza("thicc crust", "tomato", "mozzerella");
		System.out.println("Here is the ingredients of your pizza:");
		System.out.println(pizza3.bread);
		System.out.println(pizza3.cheese);
		System.out.println(pizza3.sauce);
		System.out.println(pizza3.topping);
		
		System.out.println();
		
		_24_1_pizza pizza4 = new _24_1_pizza("thicc crust", "tomato", "mozzerella", "pepperoni");
		System.out.println("Here is the ingredients of your pizza:");
		System.out.println(pizza4.bread);
		System.out.println(pizza4.cheese);
		System.out.println(pizza4.sauce);
		System.out.println(pizza4.topping);
		
	}
}
