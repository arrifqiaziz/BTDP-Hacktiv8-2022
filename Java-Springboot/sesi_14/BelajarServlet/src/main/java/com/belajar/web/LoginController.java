package com.belajar.web;

import java.io.IOException;

import com.belajar.model.Member;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginController extends HttpServlet{
	private static final long serialVersionUID = 1l;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String err="";
		int q=0;
		if(username.equals("") || username==null)
		{
			err="Username harus diisi";
		}
		else if(password.equals("") || password==null)
		{
			err="Passwprd harus diisi";
		}
		else {
			HttpSession session = req.getSession();
			RequestDispatcher rd = req.getRequestDispatcher("member.jsp");
			Member member = new Member();
			member.setUsername(username);
			member.setPassword(password);
			session.setAttribute("member", member);
			rd.forward(req, resp);
			return;
		}
		
		if(q==0) {
			req.setAttribute("err",err);
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
			return;
		}
		
	}

	
}
