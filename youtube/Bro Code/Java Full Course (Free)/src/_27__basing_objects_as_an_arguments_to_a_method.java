import java.util.ArrayList;

public class _27__basing_objects_as_an_arguments_to_a_method {

	public static void main(String[] args) {
		
		_27_1_garage garage = new _27_1_garage();

		_27_2_car car1 = new _27_2_car("BMW");
		_27_2_car car2 = new _27_2_car("Tesla");

		garage.park(car1);
		garage.park(car2);

	}

}
