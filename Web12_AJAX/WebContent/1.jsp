<%@page
	import="java.util.Date"%>
<%@ page
	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta
	http-equiv="Content-Type"
	content="text/html; charset=UTF-8">
<title>Insert
	title
	here</title>
</head>

<body>
	当前时间为：
	<%
	Date date = new Date();
	out.write(date.toLocaleString());
%>
</body>
</html>