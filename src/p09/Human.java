package p09;

public class Human {
	//フィールドの定義
	String name; //名前
	int age; //年齢

	//コンストラクタの定義

	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Human() {
		this("名前なし", -1);
	}

	//メソッドの定義
	void introduce() {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
	}
}
