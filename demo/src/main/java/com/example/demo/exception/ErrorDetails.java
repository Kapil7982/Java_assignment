package com.example.demo.exception;

import java.time.LocalDateTime;

public class ErrorDetails {

	private LocalDateTime time;
	private String msg;
	private String desc;
	
	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ErrorDetails(LocalDateTime time, String msg, String desc) {
		super();
		this.time = time;
		this.msg = msg;
		this.desc = desc;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
