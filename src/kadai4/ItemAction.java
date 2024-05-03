package kadai4;

public class ItemAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Itemクラスのオブジェクトを生成し変数item1に代入する
		Item i1 = new Item();
		
		//item1のフィールドに商品名「絵本」、価格「1000」を設定する
		i1.name = "絵本";
		i1.price = 1000;
		
		//item1を利用して商品名と価格の情報を出力する
		System.out.println("名前：" + i1.name);
		System.out.println("価格：" + i1.price + "円");
		
		System.out.println("---");
		
		Item i2 = new Item();
		
		i2.name = "シャンプー";
		i2.price = 222;
		
		i2.showInfo();
	}
}
