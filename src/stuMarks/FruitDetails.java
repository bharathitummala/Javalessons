package stuMarks;

import java.util.ArrayList;

public class FruitDetails {

	public static void main(String[] args) {

		ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
		fruitList.add(new Fruit("Apple"));
		fruitList.add(new Fruit("Mango"));
		fruitList.add(new Fruit("Strawberry"));
		fruitList.add(new Fruit("Kiwi"));
		fruitList.add(new Fruit("Mango"));

		fruitList.add(0, new Fruit("Grapes"));

		for (Fruit fruit : fruitList) {
			System.out.println("Fruits are:" + fruit.fruitsname);
		}

		for (int index = 0; index < fruitList.size(); index++) {
			System.out.println(fruitList.get(index).fruitsname);
		}

	}

}
