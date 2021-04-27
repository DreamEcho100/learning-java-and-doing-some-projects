
public class _14__some_useful_string_mrthods {

	public static void main(String[] args) {
		// String:
		// A reference data type that can store on or more characters
		// Reference data type have access to useful method
		// 
		
		String name = "Bro ";

		boolean matchesWhenFirstUpperCase = name.equals("Bro");
		boolean matchesWhenAllLowerCase = name.equals("bro");
		int lengthOfString = name.length();
		char charAt0 = name.charAt(0);
		int indexOf_r_ = name.indexOf("r");
		String stringToUpperCase = name.toUpperCase();
		String stringToLowerCase = name.toLowerCase();
		String stringTrimed = name.trim();
		String stringAll_o_replacedWith_uh_ = name.replace("o", "uh");
		
		System.out.println(name + " = Bro:\n" + matchesWhenFirstUpperCase);
		System.out.println(name + " = bro:\n" + matchesWhenAllLowerCase);
		System.out.println(name + " length:\n" + lengthOfString);
		System.out.println("In " + name + " char at 0:\n" + charAt0);
		System.out.println("In " + name + " index of (r):\n" + indexOf_r_);
		System.out.println(name + " to upper case:\n" + stringToUpperCase);
		System.out.println(name + " to lower case:\n" + stringToLowerCase);
		System.out.println(name + " trimed:\n" + stringTrimed);
		System.out.println(name + " string all \"o\" replaced with \"uh\":\n" + stringAll_o_replacedWith_uh_);
	}

}
