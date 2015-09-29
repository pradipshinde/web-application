package com.pradip.web.core.service.api;

import java.util.List;

import com.pradip.web.core.domain.Todo;

/**
 * TodoService api
 * 
 * @author Pradip
 *
 */
public interface TodoService {

	/**
     * Get todo by id.
     *
     * @param id the todo's id
     * @return the todo having the given id or null if no todo found with the given id
     */
    Todo getTodoById(final long id);

    /**
     * Get todo list for the given user.
     *
     * @param userId the user's id
     * @return the todo list for the given user
     */
    List<Todo> getTodoListByUser(final long userId);

    /**
     * Search todo list by title for the given user.
     *
     * @param title  the todo's title
     * @param userId the user's id
     * @return the todo list containing the 'title' parameter in their title for the given user
     */
    List<Todo> searchTodoListByTitle(final long userId, final String title);

    /**
     * Update a todo.
     *
     * @param todo the todo to update
     * @return the updated todo
     */
    Todo update(Todo todo);

    /**
     * Create a new todo.
     *
     * @param todo the todo to create
     * @return the created todo
     */
    Todo create(final Todo todo);

    /**
     * Remove a todo.
     *
     * @param todo the todo to remove
     */
    void remove(final Todo todo);
	
	
}
