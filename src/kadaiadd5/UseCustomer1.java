package kadaiadd5;

import java.util.Scanner;

public class UseCustomer1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Customer[] customerList = new Customer[3];
		Scanner scan = new Scanner(System.in);

		//顧客データの読み込み
		for (int index = 0; index < customerList.length; index++) {
			System.out.println((index + 1) + "人目の顧客情報を入力してください");
			System.out.print("ID：");
			int id = scan.nextInt();
			System.out.print("名前：");
			String name = scan.next();

			Customer customer;
			if (id == -1) {
				customer = new Customer(name);
			} else {
				customer = new Customer(id, name);
			}
			customerList[index] = customer;
		}

		//顧客データ表示
		System.out.println();
		System.out.println("===顧客データ一覧===");
		for (Customer customer : customerList) {
			customer.showData();
		}

		scan.close();
	}

}
