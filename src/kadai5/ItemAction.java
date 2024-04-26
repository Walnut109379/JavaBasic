package kadai5;

public class ItemAction {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//商品オブジェクトを作成
		Item i1 = new Item();

		//セッターを利用して情報をセットする
		i1.setName("絵本");
		i1.setPrice(1000);

		//ゲッターを利用して商品の情報を出力する
		System.out.println("商品名：" + i1.getName());
		System.out.println("価格：" + i1.getPrice() + "円");

		System.out.println("---");

		//コンストラクタを利用し初期化（シャンプー/222円）
		//同時に商品オブジェクトを生成する
		Item i2 = new Item("シャンプー", 222);

		//商品情報出力用のメソッドを利用して出力する
		i2.showInfo();
	}

}
