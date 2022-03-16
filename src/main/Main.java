package main;

import model.Clickable;
import model.Person;
import model.PersonData;

public class Main {

	public static void main(String[] args) {

		Person p = new Person();
		PersonData data = new PersonData();
		//Lambda
		/*Clickable c = (a,b) -> {
				System.out.println("Este es un mensaje declarado desde MAIN: "+a+", "+b);
		};*/
		//p.setOnClick(c);
		data.print();
		System.out.println("--------------");
		data.ordenarPorNombre();
		data.print();
		System.out.println("--------------");
		data.ordenarPorEdad();
		data.print();
		System.out.println("--------------");
		data.ordenarPorCiudad();
		data.print();
	
	}

}
