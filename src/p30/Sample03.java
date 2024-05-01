package p30;

import java.util.HashSet;
import java.util.Set;

public class Sample03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Setクラスの参照変数
		Set<Integer> canon = new HashSet<>();

		canon.add(10);
		canon.add(20);
		canon.add(30);
		canon.add(10); //重複するデータは無視される

		//拡張for文(番号で管理しないので、拡張for文でしか取り出せない)
		for (Integer c : canon) {
			System.out.println(c);
		}
	}

}
