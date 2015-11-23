public class PersonQueueImpl implements PersonQueue{
	
	private Person[] queue;
	
	public PersonQueueImpl() {
		this.queue = new Person[0];
	}
	
	public void insert(Person person) {
		Person[] largerQueue = new Person[this.queue.length + 1];
		for(int i = 0; i < this.queue.length; i++) {
			largerQueue[i] = this.queue[i];
		}
		largerQueue[largerQueue.length - 1] = person;
		this.queue = largerQueue;
	}
	
	public Person retrieve() {
		if( this.queue.length > 0) {
			Person[] smallerQueue = new Person[this.queue.length - 1];
			for(int i = 0; i < smallerQueue.length; i++) {
				smallerQueue[i] = this.queue[i + 1];
			}
			Person output = this.queue[0];
			this.queue = smallerQueue;
			return output;
		} else {
			System.out.println("Queue is empty.");
			return null;
		}
	}
}