package com.kh.pattern.mvc.Model;

public class UserModel {
		/* 1. ���� ���� ǥ��
		 * private �̸� ����
		 * getter setter �����
		 */
	private String name;
	private int age;
	
	public UserModel(String name, int age) {
		this.name = name;
		this.age = age;
		
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
