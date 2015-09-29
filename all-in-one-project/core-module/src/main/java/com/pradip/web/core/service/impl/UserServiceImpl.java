package com.pradip.web.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pradip.web.core.domain.User;
import com.pradip.web.core.repository.api.UserRepository;
import com.pradip.web.core.service.api.UserService;



/**
 * Implementation of {@link UserService} api
 * 
 * @author Pradip
 *
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {

	 @Autowired
	    private UserRepository userRepository;

	    /**
	     * {@inheritDoc}
	     */
	    public User create(final User user) {
	        return userRepository.create(user);
	    }

	    /**
	     * {@inheritDoc}
	     */
	    public User update(User user) {
	        return userRepository.update(user);
	    }

	    /**
	     * {@inheritDoc}
	     */
	    public void remove(final User user) {
	        userRepository.remove(user);
	    }

	    /**
	     * {@inheritDoc}
	     */
	    @Transactional(readOnly = true)
	    public User getUserByEmail(final String email) {
	        return userRepository.getUserByEmail(email);
	    }

	    /**
	     * {@inheritDoc}
	     */
	    @Transactional(readOnly = true)
	    public boolean login(final String email, final String password) {
	        return userRepository.login(email, password);
	    }
	
	
	
	
}
