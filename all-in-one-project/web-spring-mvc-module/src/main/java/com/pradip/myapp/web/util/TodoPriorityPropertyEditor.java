package com.pradip.myapp.web.util;

import java.beans.PropertyEditorSupport;

import com.pradip.web.core.domain.Priority;

/**
 * A custom property editor to map {@link Priority} values.
 * 
 * @author Pradip
 *
 */
public class TodoPriorityPropertyEditor extends PropertyEditorSupport{

	

    @Override
    public String getAsText() {
        Priority value = (Priority) getValue();
        return value.toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(Priority.valueOf(text));
    }
	
	
}
