import java.util.*;

public class CommandLineArguments {

	public static void main(String[] args) {

		try{
			int i;
			double sum=0;
			for(i=0; i < args.length; i++) {

				sum += Float.parseFloat(args[i]);
			}
			System.out.println(sum);
		} 
		catch(Exception e) {

			e.printStackTrace();
		}
	}
}
