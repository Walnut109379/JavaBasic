package exam10;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		String name;
		int age;

		System.out.print("名前：");
		name = scan.next();

		System.out.print("年齢：");
		age = scan.nextInt();

		System.out.println(name + "さんの10年後の年齢は" + (age + 10) + "歳です！");
	}

}
