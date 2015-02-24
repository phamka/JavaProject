import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Vaio {

	private static final String filePath = "D:\\My Documents\\JavaEclipse\\Java\\src\\input.txt";

	public static void main(String args[]) throws FileNotFoundException
	{
//		char c = 70;
//		System.out.println(c);
//		System.out.format("%02x", (int)c);
		
		//Scanner in = new Scanner(System.in);
		//System.out.println(System.getProperty("user.dir"));
		Scanner scanner = new Scanner(new File(filePath));
		String[] strArr = new String[10];
		int pos = 0;
		while(scanner.hasNextLine()) {
			strArr[pos] = scanner.nextLine();
			++pos;
		}
		//String nextNum = scanner.nextLine();
		//String[] next = nextNum.split(" ");
		//ArrayList<Integer> arr = new ArrayList<Integer>();
		for(String s: strArr)
			System.out.println(s);
		scanner.close();
		
		
	}

}
