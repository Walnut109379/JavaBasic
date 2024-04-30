package kadai7;

public class Book extends Item {
	private String author;

	public Book() {
	}

	public Book(String name, int price, String author) {
		super(name, price);
		// TODO 自動生成されたコンストラクター・スタブ
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void showInfo() {
		System.out.println("商品名：" + getName());
		System.out.println("価格：" + getPrice() + "円");
		System.out.println("著者：" + author);
	}
}
