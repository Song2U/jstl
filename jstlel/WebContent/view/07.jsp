<%@page import="vo.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
MemberVo vo = new MemberVo();
vo.setName("희동이");
pageContext.setAttribute("memberVo", vo);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>범위 우선순위</h3>
<h4>request scope</h4>
${requestScope.memberVo.name }<br>
${requestScope.memberVo.email }<br>
${requestScope.memberVo.no }<br>
${requestScope.memberVo.gender }<br>

------------------------------------ <br>
<h4>page scope</h4>
${pageScope.memberVo.name }<br>
${pageScope.memberVo.email }<br>
${pageScope.memberVo.no }<br>
${pageScope.memberVo.gender }<br>
------------------------------------ <br>
<h4>session scope</h4>
${sessionScope.memberVo.name }<br>
${memberVo2.email }<br>
${memberVo2.no }<br>
${memberVo2.gender }<br>
------------------------------------ <br>
<h4>application scope</h4>
${applicationScope.memberVo3.name }<br>
${memberVo3.email }<br>
${memberVo3.no }<br>
${memberVo3.gender }<br>
</body>
</html>