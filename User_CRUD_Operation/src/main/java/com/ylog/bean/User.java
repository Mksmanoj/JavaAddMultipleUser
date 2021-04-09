package com.ylog.bean;

public class User {
	private int id;
	private String firstname;
	private String lastName;
	private String address;
	private int age;
	private String Gender;

	public User(int id, String firstname, String lastName, String address, int age, String gender) {
		System.out.println("User class Object Created");
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.address = address;
		this.age = age;
		Gender = gender;
	}

	public User() {
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastName=" + lastName + ", address=" + address
				+ ", age=" + age + ", Gender=" + Gender + "]";
	}

}
