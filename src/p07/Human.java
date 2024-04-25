package p07;

public class Human {
	//フィールドの定義
	private String name; //名前
	private int age; //年齢

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (0 <= age && age <= 130) //範囲外を設定しようとすると、初期値（0）になる
			this.age = age;
	}

	/*public void setAge(int age) {
		if (!(0 <= age && age <= 130)){
			return;
		}
		this.age = age;
	}*/

	//アクセッサ・メソッドの定義

	//メソッドの定義
	/*void introduce() {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
	}*/
}
