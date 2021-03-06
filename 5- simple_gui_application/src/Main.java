import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String firstName, lastName, food;
		int age;
		float heightInCM;

		firstName = JOptionPane.showInputDialog("What is your first Name?");
		if (firstName.length() > 1) {
			firstName = firstName.trim();
			firstName = firstName.substring(0, 1).toUpperCase()
					+ firstName.substring(1, firstName.length()).toLowerCase();
		} else {
			firstName = "none";
		}

		lastName = JOptionPane.showInputDialog("What is your last Name?");
		if (lastName.length() > 1) {
			lastName = lastName.trim();
			lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1, lastName.length()).toLowerCase();
		} else {
			lastName = "none";
		}

		age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));

		food = JOptionPane.showInputDialog("What is your favourite food?");
		if (lastName.length() > 1) {
			food = food.toLowerCase().trim();
		} else {
			food = "none";
		}

		heightInCM = Integer.parseInt(JOptionPane.showInputDialog("What is your height in cm?"));
		heightInCM /= 100;

		System.out.print("Hello " + firstName + " " + lastName);
		System.out.print(", Your age is " + age + " years old");
		System.out.print(", favourite food is " + food);
		System.out.print(" and your height in meter is " + heightInCM + "m.");

		JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + lastName + ", Your age is " + age
				+ " years old" + ", favourite food is " + food + " and your height in meter is " + heightInCM + "m.");

	}

}