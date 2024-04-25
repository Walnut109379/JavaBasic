package p04;

public class Member {
	//フィールドの定義
	String myGoal; //個人の目標（インスタンスフィールド）
	static String teamGoal; //チームの目標（staticフィールド）

	//メソッドの定義
	void displayGoal() {
		System.out.println("個人の目標：" + myGoal);
		System.out.println("チームの目標：" + teamGoal);
		System.out.println("-------------------------");
	}

	static void test() {
		System.out.println("田中久瑠美");
	}
}
