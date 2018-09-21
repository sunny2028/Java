import java.util.Scanner;

public class HelloWorld {


	public static void main(String[] args) {

		System.out.println("Hello World !!\n Thanos Aa Raha Hai...!!!");
		String name = new String();
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		System.out.println("Hello "+name+" !! \nThanos Aa chuka Hai.. Ja Mil A.. XDXDXDXDXD");
		if(false) {
			System.out.println("Hello");
		}
		int temp = 0b111;
		System.out.println("Hello "+temp);
		char temp2 = '\123';
		char temp3 = '\u0061';
		System.out.println(temp2+"  "+temp3);	
	}
}
