package kadai6;

public class Item {
	//フィールド
	private String name;
	private int price;

	//コンストラクタ
	public Item() {
	}

	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	//ゲッターセッター
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//情報出力
	public void showInfo() {
		System.out.println("商品名：" + name);
		System.out.println("価格：" + price + "円");
	}

}
