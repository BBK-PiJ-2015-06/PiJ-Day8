public class TestScript {
	public static void main(String[] args) {
		Supermarket mySupermarket = new Supermarket();
		Person p1 = new Person("Anne", 20);
		Person p2 = new Person("Brian", 60);
		Person p3 = new Person("Claire", 33);
		Person p4 = new Person("Dave", 25);
		Person p5 = new Person("Emily", 31);
		Person p6 = new Person("Fred", 40);
		Person p7 = new Person("George", 26);
		
		mySupermarket.addPerson(p7);
		mySupermarket.addPerson(p6);
		mySupermarket.addPerson(p5);
		mySupermarket.addPerson(p4);
		mySupermarket.addPerson(p3);
		mySupermarket.addPerson(p2);
		mySupermarket.addPerson(p1);
		
		System.out.println(mySupermarket.servePerson());
		System.out.println(mySupermarket.servePerson());
		System.out.println(mySupermarket.servePerson());
		System.out.println(mySupermarket.servePerson());
		System.out.println(mySupermarket.servePerson());
		System.out.println(mySupermarket.servePerson());
		System.out.println(mySupermarket.servePerson());
		System.out.println(mySupermarket.servePerson());
	}
}