package p06;

public class Start {

	public static void main(String[] args) {

		Human h1 = new Human("田中久瑠美", 22);
		h1.introduce();

		Human h2 = new Human();

		h2.name = "鈴木美月";
		h2.age = 23;

		h2.introduce();

	}

}
