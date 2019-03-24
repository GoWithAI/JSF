package com.deep.jsf;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
// @ApplicationScoped
// @SessionScoped
@RequestScoped
public class CounterTwo {

	private int value = 0;

	public String increament() {
		value++;
		return "counter_two";
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
