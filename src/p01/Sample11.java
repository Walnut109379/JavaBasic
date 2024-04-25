package p01;

import java.util.Scanner;

public class Sample11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("年齢を入力：");
		int age = scan.nextInt();

		if (20 <= age && age < 30) {
			System.out.println("20代");
		} else if (30 <= age && age < 40) {
			System.out.println("30代");
		} else if (40 <= age && age < 50) {
			System.out.println("40代");
		} else {
			System.out.println("該当なし");
		}
	}
}