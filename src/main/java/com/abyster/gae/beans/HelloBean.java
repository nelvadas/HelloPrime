package com.abyster.gae.beans;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named 
@SessionScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name = "James";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    

}
