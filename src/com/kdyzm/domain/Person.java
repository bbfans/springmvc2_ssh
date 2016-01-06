package com.kdyzm.domain;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 6065526992146773943L;
	private Long id;
	private String name;
	private String address;
	private int age;
	private String phone;

	/************************ 华丽的分割线 *****************************/
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + ", phone=" + phone
				+ "]";
	}
}
