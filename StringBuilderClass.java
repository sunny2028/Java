public class StringBuilderClass {

	public static void main(String[] args) {
	
		StringBuilder str = new StringBuilder("");
		//StringBuilder str2 = new StringBuilder();
		
		/*System.out.println(str.capacity()+" "+str.length());
		
		System.out.println(str2.capacity()+" "+str2.length());
		str2.append(" hello java");
		System.out.println(str2.capacity()+" "+str2.length());
		str2.append(" hello java");
		System.out.println(str2.capacity()+" "+str2.length());
		str2.append(" hello java.. once again...");
		System.out.println(str2.capacity()+" "+str2.length());
		str2.insert(2, " kaise ho ..??");
		System.out.println(str2+" "+str2.capacity()+" "+str2.length());
		//str2.delete(2, 55);
		System.out.println(str2+" "+str2.capacity()+" "+str2.length());
		
		str2.reverse();
		System.out.println(str2+" "+str2.capacity()+" "+str2.length());
		
		String newStr = str2.toString();
		System.out.println(newStr);*/
		System.out.println("Capacity\tLength");
		System.out.println(str.capacity()+"\t\t"+str.length());
		str.append("hellllo");
		while(str.length() < 75) {
		
			str.append("h");
			System.out.println(str.capacity()+"\t\t"+str.length());
		}
	}
}
