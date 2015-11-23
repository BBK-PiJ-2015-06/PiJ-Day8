public class PersonNode {
	
	private Person person;
	private PersonNode nextPerson;
	
	public PersonNode(Person person) {
		this.person = person;
		this.nextPerson = null;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public PersonNode getNext() {
		return nextPerson;
	}
	
	public void setNext(PersonNode newPersonNode) {
		this.nextPerson = newPersonNode;
	}
}