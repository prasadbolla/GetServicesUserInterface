/**
 * 
 */
package com.ui.getservices.domain;

import java.util.List;

import com.ui.getservices.service.Category;

/**
 * @author PRASADBolla
 *
 */
public class ServiceInfoUIResponse {
public List<Category> categories;

public ServiceInfoUIResponse(List<Category> categories) {
	this.categories=categories;
}

/**
 * @return the categories
 */
public List<Category> getCategories() {
	return categories;
}

/**
 * 
 */
public ServiceInfoUIResponse() {
	super();
	// TODO Auto-generated constructor stub
}

/**
 * @param categories the categories to set
 */
public void setCategories(List<Category> categories) {
	this.categories = categories;
}

}
