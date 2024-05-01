package p30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample05 {

	public static void main(String[] args) {
		//Mapクラスの参照変数
		Map<String, Integer> canon = new HashMap<>();

		canon.put("田中", 10);
		canon.put("鈴木", 20);
		canon.put("佐藤", 30);

		System.out.println(canon.get("田中"));

		Set<String> list = canon.keySet();

		for (String key : list) {
			System.out.println(key + ":" + canon.get(key));
		}

	}

}
