<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@page import="com.kb.www.vo.ArticleVo"%>
<%
	ArticleVo vo = (ArticleVo)request.getAttribute("detail");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table style="border:1px solid black; text-align: center; margin: auto">
	<tr>
		<td>글번호</td>
		<td><%=vo.getArticleNum() %></td>
	</tr>
	<tr>
		<td>글제목</td>
		<td><%=vo.getArticleTitle() %></td>
	</tr>
	<tr>
		<td>작성일</td>
		<td><%=vo.getWriteDate() %></td>
	</tr>
	<tr>
		<td>글내용</td>
		<td><%=vo.getArticleContent() %></td>
	</tr>
</table>
</body>
</html>