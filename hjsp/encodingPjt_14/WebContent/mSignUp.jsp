<% request.setCharacterEncoding("UTF-8"); %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<!-- 여기서 데이터를 받아서 처리해야 하기 때문에 변수 선언 -->
		<%!
			String mName;
			String mNickname;
		%>
		
		<%
			mName = request.getParameter("m_name");
			mNickname = request.getParameter("m_nickname");
		%>
		
		<!--  받아온 것 화면에 출력 -->
		이름 : <%= mName %><br>
		별명 : <%= mNickname %>
	</body>
</html>