package com.idat.AbrilServicio1.dto;

public class UsuarioResponseDTO {

	private String token;
	
	public UsuarioResponseDTO() {
		super();
	}

	public UsuarioResponseDTO(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	
	
}

