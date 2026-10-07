package Collections;

import java.util.HashMap;
import java.util.Map;

public class Egmap {
	public static void main(String[] args) {
		Map<Integer, String> values = new HashMap<>();
		values.put(101, "joshi");
		values.put(102, "yash");
		values.put(103, "shreya");
		values.put(104, "lishaan");
		values.put(105, null);
		values.put(103, "gayu");// name modified

		System.out.println("Id and Names :" + values);

		System.out.println("name changed : " + values.get(103));
		System.out.println("contains 101 :" + values.containsKey(101));
		System.out.println("contains lishaan :" + values.containsValue("lishaan"));
		System.out.println("replace 102 :" + values.replace(102, "karthick"));
		System.out.println("remove :" + values.remove(105));
		System.out.println("key :" + values.keySet());
		System.out.println("values :" + values.values());
		System.out.println("Both Key and values :" + values.entrySet());
	}

}
