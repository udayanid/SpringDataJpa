package com.localdeveloper.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")
public class UserEntity {
	@Id
	@Column(name = "user_id")
	private Integer userId;
	@Column(name = "user_name")
	private String uname;
	@Column(name = "use_email")
	private String email;
	@Column(name = "user_age")
	private Integer age;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserEntity [userId=");
		builder.append(userId);
		builder.append(", uname=");
		builder.append(uname);
		builder.append(", email=");
		builder.append(email);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

}
