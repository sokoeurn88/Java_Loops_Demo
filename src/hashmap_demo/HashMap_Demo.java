package hashmap_demo;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashMap = new HashMap<Integer,String>();
		hashMap.put(100, "sokoeurn");
		hashMap.put(200, "kosal");
		hashMap.put(300, "nitha");
		System.out.println(hashMap);
		for(Map.Entry m: hashMap.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
