package com.pradip.web.core.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Todo entity class
 * 
 * @author Pradip
 *
 */
public class Todo implements Serializable {
	

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
    private long id;

    private long userId;

    @Column(length = 512)
    private String title;

    private boolean done;

    @Enumerated(value = EnumType.ORDINAL)
    private Priority priority;

    @Temporal(TemporalType.DATE)
    private Date dueDate;

    public Todo() {
        priority = Priority.LOW;
    }

    public Todo(long userId, String title, boolean done, Priority priority, Date dueDate) {
        this.userId = userId;
        this.title = title;
        this.done = done;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Todo{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", title='").append(title).append('\'');
        sb.append(", done=").append(done);
        sb.append(", priority=").append(priority);
        sb.append(", dueDate=").append(dueDate);
        sb.append('}');
        return sb.toString();
    }

}
