package com.pradip.myapp.web.util;

import java.io.Serializable;
import java.util.Locale;

import com.pradip.web.core.domain.User;

/**
 * Bean holding session data.
 * 
 * @author Pradip
 *
 */
public class SessionData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * The logged user
     */
	private User user;
	
	/**
     * The session Locale
     */
	private Locale locale;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	
	
}
