package p30;

import java.util.Set;
import java.util.TreeSet;

public class Sample04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Setクラスの参照変数
		Set<String> wgmk = new TreeSet<>();

		wgmk.add("さくら");
		wgmk.add("ねごと");
		wgmk.add("さとり");
		wgmk.add("しらせ");
		wgmk.add("もゆる");
		wgmk.add("みくも");
		wgmk.add("こむぎ"); //重複するデータは無視される

		//拡張for文(番号で管理しないので、拡張for文でしか取り出せない)
		for (String c : wgmk) {
			System.out.println(c);
		}
	}

}
