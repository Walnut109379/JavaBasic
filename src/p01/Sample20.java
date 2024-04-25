package p01;

public class Sample20 {

	public static void main(String[] args) {
		//二次元配列の宣言と領域の確保
		//データ型[] [] 配列名 = new データ型[階の数][部屋の数];
		String[][] canon = {
				{ "田中", "遠藤", "椿" },
				{ "薄井", "菊水", "木村", "深沢", "本間" }
		};

		System.out.println(canon[0][0]);
		System.out.println(canon[0][1]);
		System.out.println(canon[0][2]);
		System.out.println(canon[1][0]);
		System.out.println(canon[1][1]);
		System.out.println(canon[1][2]);
		System.out.println(canon[1][3]);
		System.out.println(canon[1][4]);

		System.out.println(canon.length); //フロア数
		System.out.println(canon[0].length); //0階の部屋数
		System.out.println(canon[1].length); //1階の部屋数
	}
}