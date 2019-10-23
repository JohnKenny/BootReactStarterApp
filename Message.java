package com.example.model;

public class Message {

	private String name;
	
	public Message(String name) {
		this.name = name + ", thanks for clicking the button. ";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
