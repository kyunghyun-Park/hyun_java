<%@page import="com.kb.www.vo.ArticleVo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%
	ArrayList<ArticleVo> list = (ArrayList<ArticleVo>)request.getAttribute("list2");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table style="border:1px solid black; text-align:center">
<tr>
	<td>번호</td>
	<td>제목</td>
	<td>조회수</td>
	<td>작성일</td>
</tr>
<% if(list.size() > 0) { %>
<% for(int i=0;i<list.size();i++) { %>
	<tr>
		<td><%=list.get(i).getArticleNum() %></td>
		<td><%=list.get(i).getArticleTitle() %></td>
		<td><%=list.get(i).getHit() %></td>
		<td><%=list.get(i).getWriteDate() %></td>
	</tr>
<% 	} %>
<% } else { %>
<tr>
<td>게시글이 없습니다.</td>
</tr>
<% } %>
</table>
</body>
</html>