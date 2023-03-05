package stuMarks;

import java.util.ArrayList;
import java.util.Collections;

public class Person_data {

	public static <Fruits> void main(String[] args) {

		// Person newPerson = new Person(34, "Human");
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person(29, "Satish"));
		persons.add(new Person(24, "Roopa"));
		persons.add(new Person(12, "Jay"));
		persons.add(new Person(29, "Tej"));

		persons.get(1).age = 35;
		persons.get(1).name = "SAds";

		Person ro = persons.get(1);
		ro.name = "Roopa";
		ro.age = 29;
		Person ja = persons.get(2);
		ja.age = 5;

		for (int i = 0; i < persons.size(); i++) {
			if (persons.get(i).name == "Jay") {
				persons.get(i).age = 5;
				break;

			}

		}

		/*
		 * persons.set(1, new Person(23, "Roo"));
		 * 
		 * Collections.sort(persons, (a, b) -> a.age - b.age);
		 * 
		 * Collections.sort(persons, (a, b) -> { if (a.age == b.age) { return
		 * a.name.compareTo(b.name); } return a.age - b.age; });
		 * 
		 * Collections.sort(persons, new Comparator<Person>() {
		 * 
		 * @Override public int compare(Person o1, Person o2) { if (o1.age == o2.age) {
		 * return o1.name.compareTo(o2.name); } return o1.age - o2.age; } });
		 */

		// persons.add(newPerson);

		for (Person person : persons) {
			System.out.println("family1:" + person.name + " " + person.age);

		}
		/*
		 * for (int i = 0; i < persons.size(); i++) { System.out.println("family2:" +
		 * persons.get(i).name + " " + persons.get(i).age);
		 * 
		 * }
		 */
		int sumAge = 0;
		for (int i = 0; i < persons.size(); i++) {

			if (persons.get(i).age % 2 == 0) {
				sumAge = sumAge + persons.get(i).age;

			}

		}
		System.out.println("sum:" + " " + sumAge);

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		Collections.sort(cars);
		for (String car : cars) {
			System.out.println(car);
		}

	}

}
