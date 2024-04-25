package p08;

public class Start {

	public static void main(String[] args) {

		Human h1 = new Human();
		Human h2; //新しいリモコン

		h1.setName("鈴木美月");
		h1.setAge(23);

		h2 = h1; //h2でもHumanに対して操作ができる
		h2.setAge(30);

		System.out.println("名前：" + h1.getName());
		System.out.println("年齢：" + h1.getAge());

		//h1.introduce();

	}

}
