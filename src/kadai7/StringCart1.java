package kadai7;

import java.util.ArrayList;
import java.util.List;

public class StringCart1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> item = new ArrayList<>();

		item.add("ロボット掃除機");
		item.add("ドラム式洗濯機");
		item.add("液晶テレビ");

		for (String i : item) {
			System.out.println(i);
		}
	}

}