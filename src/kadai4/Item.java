package kadai4;

public class Item {
	//フィールド（名前と価格を定義する）
	String name;
	int price;
	
	//情報出力用showInfo()メソッド
	void showInfo() {
		System.out.println("名前：" + name);
		System.out.println("価格（税抜き）" + price);
		System.out.println("価格（税込み）" + (int)(1.1*price));
		}
}
