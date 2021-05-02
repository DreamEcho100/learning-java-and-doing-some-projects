
public class _29__oop_inheritance {

	public static void main(String[] args) {
		// Inheritance:
		// The process where one class acquires the attributes and methods of another class.
		// 
		
		_29_2_car car = new _29_2_car();
		_29_3_bicycle bicycle = new _29_3_bicycle();

		bicycle.go();
		car.stop();

		System.out.println(car.doors);
		System.out.println(bicycle.pedals);

	}

}
