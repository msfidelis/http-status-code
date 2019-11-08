package com.httpstatuscode.httpstatuscode.models;

/**
 * 
 * @author Matheus Fidelis
 */
public class Response {
	
	private Integer code;
	private String 	message;
	
	/**
	 * 
	 * @param code
	 */
	public Response(Integer code) {
		
		this.code = code;
		
		if (code == 200) {
			this.message = "Success";
		}
		
		if (code == 201) {
			this.message = "Created";
		}
		
		if (code == 202) {
			this.message = "Accepted";
		}
		
		if (code == 500) {
			this.message = "Internal Server Error";
		}
		
		if (code == 400) {
			this.message = "Bad Request";
		}
		
	}
	
	/**
	 * 
	 * @return
	 */
	public Integer getCode() {
		return this.code;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getMessage() {
		return this.message;
	}

}
