import java.util.*;
public class ForEachLoop {
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,9,12,15};
		for(int i:arr)
		{
			System.out.println(i);
		}
		List<String> prolang = new ArrayList<>();
		prolang.add("Java");
		prolang.add("Javascript");
		prolang.add("HTML");
		prolang.add("Kotlin");

		for(String x:prolang) {
			System.out.println(" Programming Language: " +x);
		}

		String arr2[] = {"Chandan","Kumar","Bashak"};
		for(String st:arr2) {
			System.out.println(st);
		}
	}
}