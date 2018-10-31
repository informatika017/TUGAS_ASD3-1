import java.util.ArrayList;

public class ArrayListString {
	
	public static void main(String[] args) {
		ArrayList<String>string = new ArrayList<String>();
		string.add("ISMAIL");
		string.add("UMAR");
		string.add("MAIL");
		
    System.out.println(string.toString());
		System.out.println("index of ismail : "+string.indexOf("ismail"));
		
    string.remove(1);
		System.out.println(string.toString());
		System.out.println("SIZE : "+string.size());	
	}
}
