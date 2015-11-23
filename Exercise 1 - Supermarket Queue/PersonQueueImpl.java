public class PersonQueueImpl implements PersonQueue {
	
	private PersonNode head;
	
	public PersonQueueImpl() {
		this.head = null;
	}
	
	public void insert(Person person) {
		PersonNode newPersonNode = new PersonNode(person);
		if(this.head == null) {
			this.head = newPersonNode;
		} else {
			PersonNode current = this.head;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newPersonNode);
		}
	}
	
	public Person retrieve() {
		if(this.head != null) {
			Person output = this.head.getPerson();
			this.head = this.head.getNext();
			return output;
		} else {
			System.out.println("Queue is empty.");
			return null;
		}
	}
}