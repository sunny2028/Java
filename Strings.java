public class Strings {

	public static void main(String[] args) {

		String str1 = "   Hello World 1";
		String str2 = new String("Hello World 1");
		System.out.println(str1);
		System.out.println(str2);
		String str3 = "Hello World 1";
		String str4 = new String("Hello World 1");
		System.out.println(str1==str3);
		System.out.println(str2==str4);
		System.out.println(str1==str2);
		str1 += " Heeeeyo      ";
		System.out.println(str1.toUpperCase().trim().toCharArray()[1]);
	}
}
