package com.cj.web;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginCommand {
	private String username;

	private String password;

	private boolean rememberMe;

}
