<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 테스트</title>
<style>

</style>
</head>
<body>
<h1>강아지 고르기</h1>
<section id="loginFormArea">
	<form action="choiceDog" method="post">
		<input type="checkbox" name="dog" value="a"/>푸들
		<input type="checkbox" name="dog" value="b"/>진돗개
		<input type="checkbox" name="dog" value="c"/>삽살개
		<input type="checkbox" name="dog" value="d"/>풍산개
		<input type="submit" value="로그인"/>
	</form>
</section>
</body>
</html>