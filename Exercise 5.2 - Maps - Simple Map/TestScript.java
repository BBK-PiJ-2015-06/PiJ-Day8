public class TestScript {
	public static void main(String[] args) {
		SimpleMap myMap = new SimpleMapImpl();
		myMap.put(0, "Anne");
		myMap.put(1, "Brian");
		System.out.println(myMap.get(1));
		System.out.println(myMap.get(2));
		myMap.remove(0);
		myMap.remove(1);
		if(myMap.isEmpty()) {
			System.out.println("This map is empty");
		}
	}
}