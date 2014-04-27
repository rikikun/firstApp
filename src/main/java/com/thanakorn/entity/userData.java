package com.thanakorn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DATA")
public class userData {

	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Integer userId;

	@Column(name = "USER_NAME", nullable = false, unique = true)
	private String userName;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "PASSWORD", nullable = false)
	private String passWord;

	public userData() {
		// TODO Auto-generated constructor stub
	}

	public userData(String userName, String firstName,
			String passWord) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.passWord = passWord;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "userData [id=" + userId + ", userName=" + userName
				+ ", fristName=" + firstName + ", passWord=" + passWord + "]";
	}

}
