public class CheckLength {

	public static void main(String[] args ) {

		String str = "this is a java String";
		String[] arr = str.split(" ");
		int len = arr.length;
		int length = arr[len-1].length();
		System.out.println(length);
	}

}
