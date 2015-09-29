package com.pradip.web.core.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * User entity class
 * 
 * @author Pradip
 *
 */
@Entity
@NamedQueries({ 
	    @NamedQuery(name = "findUserByEmail", query = "SELECT u FROM User u where u.email = :p_email"),
		@NamedQuery(name = "findUserByEmailAndPassword", query = "SELECT u FROM User u where u.email = :p_email and u.password = :p_password")
	    })
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String email;

	private String password;

	public User() {
	}

	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User[" + "id=" + id + ", name='" + name + '\'' + ", email='"
				+ email + '\'' + ", password='" + password + '\'' + ']';
	}
}
