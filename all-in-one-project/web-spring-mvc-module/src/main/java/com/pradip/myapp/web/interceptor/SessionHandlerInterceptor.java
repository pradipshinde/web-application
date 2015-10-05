package com.pradip.myapp.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.pradip.myapp.web.util.SessionData;

/**
 * Interceptor to ensure that access to user data is allowed only for logged users.
 * 
 * @author Pradip
 *
 */
public class SessionHandlerInterceptor extends HandlerInterceptorAdapter{
	
	@Autowired
	private SessionData sessionData;
	
	 @Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
	    
	 if(sessionData.getUser()==null)
	 {
		 response.sendRedirect("/login");
		 return false;
		 
	 }
	 else{
		 
		 return true;
	 }
	 
	 }

}
