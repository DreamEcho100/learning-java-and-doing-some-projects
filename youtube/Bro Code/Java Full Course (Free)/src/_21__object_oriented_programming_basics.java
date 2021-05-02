
public class _21__object_oriented_programming_basics {

	public static void main(String[] args) {
		// Object oriented programming basics
		// Object:
		// - an instance of a class that may contain attributes and methods.
		// - Example: (phone, desk, computer, coffee, cup).
		//

		_21_1_Car myCar1 = new _21_1_Car();
		_21_1_Car myCar2 = new _21_1_Car();

		System.out.println(myCar1.color);
		System.out.println(myCar1.make);

		System.out.println(myCar2.model);
		System.out.println(myCar2.price);
		
		myCar1.drive();
		myCar2.brake();

	}

}