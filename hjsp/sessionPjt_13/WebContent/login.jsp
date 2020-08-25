<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
		<!-- 기존에 세션이 있었는지 없었는지 판단하는 코드 -->
			<% 
				if(session.getAttribute("memberId") != null) 
					response.sendRedirect("loginOk.jsp");
			%>
		<!-- 세션이 없을때  -->
		<form action="loginCon" method="post">
			ID : <input type="text" name="mID"><br>
			PW : <input type="password" name="mPW"><br>
			<input type="submit" value="login">
		</form>
	</body>
</html>