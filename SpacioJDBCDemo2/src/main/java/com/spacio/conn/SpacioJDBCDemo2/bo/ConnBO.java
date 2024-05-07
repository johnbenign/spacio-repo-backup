package com.spacio.conn.SpacioJDBCDemo2.bo;

import com.spacio.conn.SpacioJDBCDemo2.dao.ConnDAO;

public class ConnBO
{
	public boolean createUser(String username, String password)
	{
		ConnDAO dao = new ConnDAO();
		
		return dao.createUser(username, password);
	}
}
