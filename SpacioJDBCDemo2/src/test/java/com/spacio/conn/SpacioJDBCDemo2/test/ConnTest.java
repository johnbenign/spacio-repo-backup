package com.spacio.conn.SpacioJDBCDemo2.test;

import org.junit.Test;

import com.spacio.conn.SpacioJDBCDemo2.bo.ConnBO;
import static org.junit.Assert.*;

public class ConnTest
{
	@Test
	public void createUser()
	{
		String username = "benign23";
		
		String password = "crmpass433";
		
		ConnBO bo = new ConnBO();
		
		boolean result = bo.createUser(username, password);
		
		assertTrue("result should be true", result);
		
	}
}
