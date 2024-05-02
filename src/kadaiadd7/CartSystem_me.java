package kadaiadd7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kadai7add.Book;
import kadai7add.Item;

public class CartSystem_me {

	//商品情報保存リスト
	private static List<Item> cart = new ArrayList<Item>();

	//スキャナークラス
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int select;
		int num;
		int no;

		System.out.println("1.商品追加");
		System.out.println("2.書籍追加");
		System.out.println("3.情報更新");
		System.out.println("9.終了");

		do {
			System.out.print("メニューを選択してください：");
			select = scan.nextInt();
			num = 1;

			switch (select) {
			case 1:
				System.out.println("商品をカートに追加します");
				System.out.print("商品名を入力してください：");
				String name = scan.next();
				System.out.print("価格を入力してください：");
				int price = scan.nextInt();
				cart.add(new Item(name, price));
				System.out.println("No.  商品情報");
				System.out.println("------------------------");
				for (Item i : cart) {
					System.out.println(num++ + "　　　" + i.getInfo());
				}
				System.out.println("------------------------");
				break;

			case 2:
				System.out.println("書籍をカートに追加します");
				System.out.print("書籍名を入力してください：");
				name = scan.next();
				System.out.print("著者を入力してください：");
				String author = scan.next();
				System.out.print("価格を入力してください：");
				price = scan.nextInt();
				cart.add(new Book(name, price, author));
				System.out.println("No.  商品情報");
				System.out.println("------------------------");
				for (Item i : cart) {
					System.out.println(num++ + "　　　" + i.getInfo());
				}
				System.out.println("------------------------");
				break;
				
			case 3:
				System.out.println("情報を更新します");
				Item hit;
				System.out.print("No.を入力してください");
				no = scan.nextInt();
				try {
					hit = cart.get(no - 1);
				} catch (IndexOutOfBoundsException e) {
					System.out.println("選択されたNo.はありません");
					System.out.println("No.  商品情報");
					System.out.println("------------------------");
					for (Item i : cart) {
						System.out.println(num++ + "　　　" + i.getInfo());
					}
					System.out.println("------------------------");
					return;
				}
				
			case 4:
				System.out.println("情報を削除します");
				hit = null;
				System.out.println("No.を入力してください");
				no = scan.nextInt();
				try {
					hit = cart.get(no - 1);
				} catch (IndexOutOfBoundsException e) {
					System.out.println("選択されたNo.はありません");
					System.out.println("No.  商品情報");
					System.out.println("------------------------");
					for (Item i : cart) {
						System.out.println(num++ + "　　　" + i.getInfo());
					}
					System.out.println("------------------------");
					return;
				}
				if (hit != null) {
					cart.remove(no - 1);
				}
				System.out.println("No.  商品情報");
				System.out.println("------------------------");
				for (Item i : cart) {
					System.out.println(num++ + "　　　" + i.getInfo());
				}
				System.out.println("------------------------");
			
			case 5:
				System.out.println("カートを検索します");
				System.out.print("検索キーワードを入力してください");
				String keyword = scan.next();
				System.out.println("商品情報");
				System.out.println("----------------------------------");

				for (Item i : cart) {
					name = i.getName();
					author = null;

					if (i instanceof Book) {  //iがBookクラスの変
						数のとき＝商品が書籍のとき
						Book b = (Book) i;  //iをBookでキャストして、Bookリモコンで扱えるようにする

						author = b.getAuthor();  //著者情報を取得
					}

					if (name.indexOf(keyword) != -1) {
						//商品名にkeywordが含まれるとき
						System.out.println(i.getInfo());
					} else if (author != null && author.indexOf(keyword) != -1) { 
						//著者がnullでないとき（＝商品が書籍のとき）かつ、著者にkeywordが含まれるとき
						System.out.println(i.getInfo());  //書籍情報を出力
						
					}
				}

				System.out.println("----------------------------------");
				System.out.println();
			}

		} while (select != 9);
	}
}
