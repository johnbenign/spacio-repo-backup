package com.spacio.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spacio.conn.bo.ConnBO;
import com.spacio.conn.dto.ResponseDTO;
import com.spacio.rest.dto.LoginCredential;

import jdk.internal.util.Preconditions;

@RestController
public class SpacioConnController
{
	@Autowired
	private ConnBO connService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/setDefaults")
	//@ResponseStatus(HttpStatus.CREATED)
	public ResponseDTO setOpencrxFactoryData(@RequestBody LoginCredential credential)
	{		
		String username = credential.getUsername();
		
		String password = credential.getPassword();
		
		ResponseDTO response = connService.setOpencrxFactoryData(username, password);
		
		return response;
	}
}
