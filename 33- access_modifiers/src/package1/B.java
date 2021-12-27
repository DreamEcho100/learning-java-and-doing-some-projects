package package1;

import package2.C;

public class B {
	public static void main(String[] args) {
		C c = new C();
		// System.out.println(c.privateMessage); // The field C.privateMessage is not visible
	}

}
