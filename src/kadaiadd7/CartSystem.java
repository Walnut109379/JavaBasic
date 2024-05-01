package kadaiadd7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartSystem {

	//商品情報保存リスト
	private static List<Item> cart = new Arr
	
	//

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		Item i = new Item();
		Book b = new Book();
		List<Item> itemList = new ArrayList<>();
		List<Book> bookList = new ArrayList<>();

		int select;
		int num = 1;
		System.out.println("1.商品追加");
		System.out.println("2.書籍追加");
		System.out.println("9.終了");

		do {
			System.out.print("メニューを選択してください：");
			select = scan.nextInt();

			switch (select) {
			case 1:
				System.out.println("商品をカートに追加します");
				System.out.print("商品名を入力してください：");
				String name = scan.next();
				i.setName(name);
				System.out.print("価格を入力してください：");
				int price = scan.nextInt();
				i.setPrice(price);
				System.out.println("No.  商品情報");
				System.out.println("------------------------");
				for (Item item : itemList) {
					System.out.print(num);
					item.getInfo();
					num++;
				}
				System.out.println("------------------------");
				break;

			case 2:
				System.out.println("書籍をカートに追加します");
				System.out.print("書籍名を入力してください：");
				name = scan.next();
				b.setName(name);
				System.out.print("著者を入力してください：");
				String author = scan.next();
				b.setAuthor(author);
				System.out.print("価格を入力してください：");
				price = scan.nextInt();
				b.setPrice(price);
				System.out.println("No.  商品情報");
				System.out.println("------------------------");
				for (Book book : bookList) {
					System.out.print(num);
					book.getInfo();
					num++;
				}
				System.out.println("------------------------");
				break;
			}

		} while (select != 9);
	}
}
