package by.htp.classes;

public class Student {

	private String name;
	private String surname;
	private int age;
	private int year;

	public Student(String name, String surname, int age, int year) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.year = year;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return this.year;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
}
