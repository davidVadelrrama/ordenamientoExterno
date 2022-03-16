package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonData {

	private ArrayList<Person> people;

	public PersonData() {
		super();

		people = new ArrayList();

		Person A = new Person();
		A.name = "Sebastian";
		A.age = 25;
		A.city = "Palmira";

		Person B = new Person();
		B.name = "Barraza";
		B.age = 10;
		B.city = "Catatumbo";

		Person C = new Person();
		C.name = "Yuluka";
		C.age = 25;
		C.city = "Bogotá";

		Person D = new Person();
		D.name = "George";
		D.age = 15;
		D.city = "Medellin";

		Person E = new Person();
		E.name = "Diana";
		E.age = 27;
		E.city = "Medellin";

		Person F = new Person();
		F.name = "David";
		F.age = 20;
		F.city = "Cali";

		people.add(A);
		people.add(B);
		people.add(C);
		people.add(D);
		people.add(E);
		people.add(F);
	};

	public void print() {
		for (Person p : people) {
			System.out.println(p.name + ", " + p.age + ", " + p.city);
		}
	}

	public void ordenarPorNombre() {
		
		Collections.sort(people,new Comparator<Person>(){
			@Override
			public int compare(Person A, Person B) {
				return A.name.compareTo(B.name);
			}
		});

	}

	public void ordenarPorEdad() {
		
		Collections.sort(people,new Comparator<Person>(){
			@Override
			public int compare(Person A, Person B) {
				return A.age - B.age;
			}
		});

	}

	public void ordenarPorCiudad() {
		
		Collections.sort(people,new Comparator<Person>(){
			@Override
			public int compare(Person A, Person B) {
				return A.city.compareTo(B.city);
			}
		});

	}

}
