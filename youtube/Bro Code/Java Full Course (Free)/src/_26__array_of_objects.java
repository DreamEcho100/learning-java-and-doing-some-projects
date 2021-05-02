
public class _26__array_of_objects {

	public static void main(String[] args) {

//		int[] numbers = new int[3];
//		char[] characters= new char[3];
//		String[] Strings = new String[3];
		
//		_26__food[] refrigerator = new _26__food[3];

		_26__food food1 = new _26__food("pizza");
		_26__food food2 = new _26__food("hamburger");
		_26__food food3 = new _26__food("hotdog");

		_26__food[] refrigerator = {food1, food2, food3};

//		refrigerator[0] = food1;
//		refrigerator[1] = food2;
//		refrigerator[2] = food3;

		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);

	}

}
