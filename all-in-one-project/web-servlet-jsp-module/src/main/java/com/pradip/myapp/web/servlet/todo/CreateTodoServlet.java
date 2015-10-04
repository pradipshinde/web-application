package com.pradip.myapp.web.servlet.todo;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.pradip.myapp.web.common.util.TodoListUtils;
import com.pradip.web.core.domain.Priority;
import com.pradip.web.core.domain.Todo;
import com.pradip.web.core.domain.User;
import com.pradip.web.core.service.api.TodoService;

import static com.pradip.myapp.web.util.Views.CREATE_TODO_PAGE;;

/**
 * CreateTodoServlet creates new todo
 * 
 * @author Pradip
 *
 */

@WebServlet(name = "CreateTodoServlet", urlPatterns = {"/todos/new", "/todos/new.do"})
public class CreateTodoServlet extends HttpServlet {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TodoService todoService;

	    @Override
	    public void init(ServletConfig servletConfig) throws ServletException {
	        ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletConfig.getServletContext());
	        todoService = applicationContext.getBean(TodoService.class);
	    }

	    @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        request.setAttribute("today", new SimpleDateFormat(TodoListUtils.DATE_FORMAT).format(new Date()));
	        request.getRequestDispatcher(CREATE_TODO_PAGE).forward(request, response);
	    }

	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	        HttpSession session = request.getSession();
	        User user = (User) session.getAttribute(TodoListUtils.SESSION_USER);

	        String title = request.getParameter("title");
	        String dueDate = request.getParameter("dueDate");
	        String priority = request.getParameter("priority");

	        @SuppressWarnings("deprecation")
			Todo todo = new Todo(user.getId(), title, false, Priority.valueOf(priority), new Date(dueDate));
	        todoService.create(todo);
	        request.getRequestDispatcher("/todos").forward(request, response);

	    }

}
