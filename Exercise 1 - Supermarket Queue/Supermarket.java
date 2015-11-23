public class Supermarket {
	
	private PersonQueue till;
	
	public Supermarket() {
		this.till = new PersonQueueImpl();
	}
	
	public void addPerson(Person person) {
		till.insert(person);
	}
	
	public Person servePerson() {
		return till.retrieve();
	}
}