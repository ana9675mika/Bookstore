package com.capgemini.bookstore.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="AdminDetails")
public class AdminDetails {

	@Id
	@Column(name="admindetailsid")
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int adminDetailsId;
	
	@Column(name="email")
	@NotNull
	@Size(min=10)
	@Size(max=64)
	private String email;
	
	@Column(name="fullname")
	@NotNull
	@Size(min=8)
	@Size(max=30)
	private String fullName;
	
	@Column(name="password")
	@NotNull
	@Size(min=8)
	@Size(max=16)
	private String password;

	public int getAdminDetailsId() {
		return adminDetailsId;
	}

	public void setAdminDetailsId(int adminDetailsId) {
		this.adminDetailsId = adminDetailsId;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminDetails [adminDetailsId=" + adminDetailsId + ", email=" + email + ", fullName=" + fullName
				+ ", password=" + password + "]";
	}

	
	
	
}
