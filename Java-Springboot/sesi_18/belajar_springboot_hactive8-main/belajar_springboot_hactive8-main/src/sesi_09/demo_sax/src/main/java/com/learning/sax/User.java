package com.learning.sax;

public class User {
	
	int Id;
	private String Name;
	private String Gender;
	private String Role;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public User() {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User{").append("Id=").append(Id)
		.append(", Name=").append(Name)
		.append(", gender=").append(Gender)
		.append(", Role=").append(Role).append("}");
		
		return builder.toString();
	}
}
