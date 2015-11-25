public class HashUtilities {
	
	public static int shortHash(int input) {
		int output = Math.abs(input % 1000);
		return output;
	}
	
}