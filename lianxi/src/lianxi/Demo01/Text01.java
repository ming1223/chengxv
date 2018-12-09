package lianxi.Demo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Text01 {
	public static void main(String[] args) {
//		Map<User, Integer> map = new HashMap<User,Integer>();
//		map.put(new User(1,"name",19),11);
//		map.put(new User(2, "name2", 20),15);
//		Set<Entry<User, Integer>> s = map.entrySet();
//		for (Entry<User, Integer> entry : s) {
//			System.out.println(entry.getKey()+"====="+entry.getValue());
//		}
		Map<User, Integer> map = new TreeMap<User,Integer>();
		map.put(new User(1,"name1",19),11);
		map.put(new User(2,"name2",19),11);
		Set<Entry<User, Integer>> s = map.entrySet();
		for (Entry<User, Integer> entry : s) {
			System.out.println(entry.getKey()+"==="+entry.getValue());
		}
		
	}

}
