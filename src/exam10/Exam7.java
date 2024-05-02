package exam10;

import java.util.ArrayList;
import java.util.List;

public class Exam7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		List<Employee> human = new ArrayList<>();
		//Employee[] List = new Employee[3]; 配列ではなく、Listを使う

		human.add(new Employee("田中太郎", 20));
		human.add(new Engineer("鈴木一郎", 25, "Java"));
		human.add(new Employee("佐藤花子", 30));

		for (Employee e : human) {
			e.introduce();
		}
	}
}
