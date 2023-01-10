<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST">
		<div>
			<label for="Id">user name</label>
			<input name="username" id="Id"/>
		</div>
		<div>
			<label for="pw">password</label>
			<input name="password" id="pw" type="password"/>
		</div>
		<div>
			<button>로그인</button>
		</div>
	</form>
	<p>${USERNAME},${PASSWORD}
</body>
</html>