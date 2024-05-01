package p30;

import java.util.ArrayList;
import java.util.List;

public class Sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//ArrayListクラスのインスタンスの生成
		//ArrayList<Integer> canon = new ArrayList<Integer>();

		//後半のデータ型は省略できる
		//ArrayList<Integer> canon = new ArrayList<>();

		//Listクラスの参照変数
		List<Integer> canon = new ArrayList<>();

		canon.add(10);
		canon.add(20);
		canon.add(30);

		//部屋番号を指定して割り込ませる
		canon.add(2, 40);

		//部屋番号を指定して要素を削除する。空いたところは詰められる
		canon.remove(1);

		//配列の長さはsize、取り出すときは配列名.get()
		for (int i = 0; i < canon.size(); i++) {
			System.out.println(canon.get(i));
		}

		//拡張for文
		for (Integer c : canon) {
			System.out.println(c);
		}
	}

}
