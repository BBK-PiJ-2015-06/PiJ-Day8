public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		String output = "Name: " + this.name + '\n' + "Age: " + this.age + '\n';
		return output;
	}
}