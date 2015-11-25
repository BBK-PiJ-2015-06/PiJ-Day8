public class SimpleMapImpl implements SimpleMap {
	
	private String[] map;
	
	public SimpleMapImpl() {
		map = new String[1000];
	}
	
	public void put(int key, String name) {
		if(map[key] == null) {
			map[key] = name;
		}
	}
	
	public String get(int key) {
		return map[key];
	}
	
	public void remove(int key) {
		map[key] = null;
	}
	
	public boolean isEmpty() {
		boolean output = true;
		for(int i = 0; i < 1000; i++) {
			if(map[i] != null) {
				output = false;
			}
		}
		return output;
	}
}