public class Hero extends Person {
	String heroName;
	String power;
	
	Hero(String name, int age, String heroName, String power) {
		super(name, age);
		this.heroName = heroName;
		this.power = power;
	}
	
	public String toString() {
		return super.toString() + ", Power: " + this.power + ", Hero Name: " + this.heroName;
	}
}
