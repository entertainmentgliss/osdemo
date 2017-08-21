package com.gliss;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Connector extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3783129554452957328L;

	public Connector() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Connection con = Provider.getConnection();
			response.getWriter().append("Connected to: ").append(con.toString());
		} catch (SQLException e) {
			response.getWriter().append("Not connected: ").append(e.getMessage());
			e.printStackTrace();
		}
	}

}
