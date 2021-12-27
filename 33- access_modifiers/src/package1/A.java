package package1;

import package2.*;

public class A extends C {
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.publicMessage);
	}

}
