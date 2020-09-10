package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginCon")
public class LoginCon extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String mId = request.getParameter("mID");
		String mPw = request.getParameter("mPw");

		out.print("mId : " + mId + "\n mPw : " + mPw);

		HttpSession session = request.getSession(); // request��ü�κ��� ������ ��� HttpSession �������̽��� ����
		session.setAttribute("memberId", mId);
		
		response.sendRedirect("loginOk.jsp"); //�α��� ���ȭ������ ������ 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}