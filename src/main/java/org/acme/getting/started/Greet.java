package org.acme.getting.started;

public class Greet {
	private String msg;
	public Greet(String msg) {
	    this.msg = msg;
	}
	public Greet() {
	    this(null);
	}
	public String getMsg() {
            return msg;
	}
	public void setMsg(String msg) {
	     this.msg = msg;
	}
}
