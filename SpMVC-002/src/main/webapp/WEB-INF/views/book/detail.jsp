<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>도서정보</h1>
	<div>ISBN : ${Book.isbn}</div>
	<div>도서명 : ${Book.title}</div>
	<div>출판사 : ${Book.comp}</div>
	<div>저자 : ${Book.author}</div>
	<div>가격 : ${Book.price}</div>
</body>
</html>