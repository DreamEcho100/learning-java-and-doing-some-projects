import java.util.ArrayList;

public class _17__for_each_loop {

	public static void main(String[] args) {
		// For-each:
		// - Traversing technique to iterate through the elements in an array/collection.
		//
		// Less steps, more readable.
		//
		// Less flexible:
		// - For-each loops are not appropriate when you want to modify the array.
//		for (int num : marks) 
//		{
//		    // only changes num, not the array element
//		    num = num*2; 
//		}
		// - For-each loops do not keep track of index. So we can not obtain array index using For-Each loop
//		for (int num : numbers) 
//		{ 
//		    if (num == target) 
//		    {
//		        return ???;   // do not know the index of num
//		    }
//		}
		// - For-each only iterates forward over the array in single steps
		// cannot be converted to a for-each loop
//		for (int i=numbers.length-1; i>0; i--) 
//		{
//		      System.out.println(numbers[i]);
//		}
		// - For-each cannot process two decision making statements at once
//		for (int i=0; i<numbers.length; i++) 
//		{
//		    if (numbers[i] == arr[i]) 
//		    { ...
//		    } 
//		}
		//
		
//		String[] animals = {"cat", "dog", "bird"};
		
		ArrayList<String> animals = new ArrayList<String>();

		animals.add("cat");
		animals.add("dog");
		animals.add("bird");

		System.out.println("---------------------------------------");
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		
		System.out.println("---------------------------------------");
		
		animals.forEach(animal -> System.out.println(animal));
		
		System.out.println("---------------------------------------");

		ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> productList = new ArrayList<String>();
		productList.add("tomatoes");
		productList.add("zucchini");
		productList.add("peppers");
		
		ArrayList<String> drinkList = new ArrayList<String>();
		drinkList.add("soda");
		drinkList.add("coffee");
		drinkList.add("water");

		groceryList.add(bakeryList);
		groceryList.add(productList);
		groceryList.add(drinkList);
		
		System.out.println(groceryList);
		
		for(ArrayList<String> list: groceryList) {
			for(String item: list) {
				System.out.print(item + ", ");				
			}
		}
		
		System.out.println();

		System.out.println("---------------------------------------");
		
		groceryList.forEach(list -> {
			list.forEach(item -> System.out.print(item + ", "));
		});
		
		System.out.println();

		System.out.println("---------------------------------------");

	}

}