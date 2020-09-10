package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginCon")
public class LoginCon extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter(); //받은 id,pw 정보를 찍어보기 위함
		
		String mId = request.getParameter("mID");
		String mPw = request.getParameter("mPW");
		
		out.print("mId : " + mId);
		out.print("mPw : " + mPw);
		
		Cookie[] cookies = request.getCookies(); //쿠키 받아옴
		Cookie cookie = null; //일단 쿠키는 null로 저장
		
		for (Cookie c : cookies) { //for문으로 배열 안에 있는 쿠키들 검색
			
			System.out.println("c.getName() : " + c.getName() + ", c.getValue() : " + c.getValue());
			
			if(c.getName().equals("memberId")) { //memberId의 이름을 갖는 쿠키의 정보를 담음
				cookie = c;
			}
		}
		
		if(cookie == null) { //만약 쿠키가 없다면
			System.out.println("cookie is null");
			cookie = new Cookie("memberId", mId); //쿠키 생성
		}
		
		response.addCookie(cookie); //쿠키 저장
		cookie.setMaxAge(60*60);	//쿠키 유효시간 60초 * 60초 = 1시간
		
		response.sendRedirect("loginOk.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
