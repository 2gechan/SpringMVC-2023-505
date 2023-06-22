package com.callor.hello.models;

/*
 * Spring Framework Project 에서 DTO(VO) 데이터 클래스는
 * 모든 변수(속성)을 private 으로 선언한다.
 * 또한 생성자와 getter, setter method 를 필수로 선언해야한다.
 */
public class AddressDto {
	
	// Attribute : 속성, data class의 변수들
	private String name;
	private String tel;
	private String address;
	private int age;
	
	public AddressDto(String name, String tel, String address, int age) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
		this.age = age;
	}
	
	public AddressDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
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

	@Override
	public String toString() {
		return "AddressDto [name=" + name + ", tel=" + tel + ", address=" + address + ", age=" + age + "]";
	}
	
}
