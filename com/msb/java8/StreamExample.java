package com.msb.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class StreamExample {
	
	public static void main(String[] args) {
		List<Person> arrayList = new ArrayList<Person>();
		
		arrayList.add(new Person(100, "First Name1", "LastName1"));
		arrayList.add(new Person(200, "First Name2", "LastName2"));
		arrayList.add(new Person(300, "First Name3", "LastName3"));
		
		arrayList.stream().limit(2).forEach(System.out::println);
		
		StreamExample streamExample = new StreamExample();
		SampleClass sampleClass = new SampleClass();
		streamExample.SupplierMethod(()->sampleClass.getPerson());
		//streamExample.SupplierMethod(sampleClass::getPerson);
	}
	
	public Address SupplierMethod(Supplier<Person> person) {
		System.out.println("In SupplierMethod....");
		System.out.println(person.get());
		return new Address();
	}

}

class Address{
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}

class SampleClass{
	
	public Person getPerson() {
		return new Person(500, "XXXX", "ZZZZ");
	}
}