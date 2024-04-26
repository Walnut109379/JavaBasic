package kadai6;

public class BookAction1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Book b1 = new Book();

		b1.setName("走れメロス");
		b1.setPrice(450);
		b1.setAuthor("太宰治");

		b1.showInfo();

		System.out.println("---");

		Item i1 = new Book();

		i1.setName("シャーロックホームズ");
		i1.setPrice(600);
		((Book) i1).setAuthor("コナン・ドイル");

		i1.showInfo();
	}
}
