<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 thansitional//EN" "http://www.w3.org/th/html4/loose.dtd">
<html>
<head>
<title>SpringJunit01jsp</title>
</head>
<body>
	<table width="50%" border="1" cellpadding="2" cellspacing="0" style="color:red">
	  <tr>
		<th>empno</th>
		<th>ename</th>
		<th>job</th>
		<th>mgr</th>
		<th>hiredate</th>
		<th>sal</th>
		<th>comm</th>
		<th>deptno</th>
     </tr>
		<c:forEach items="${emps}" var="emp">
		  <tr>
		  	<td>${emp.empno}</td>
		  	<td>${emp.ename}<</td>
		  	<td>${emp.job}<</td>
		  	<td>${emp.mgr}<</td>
		  	<td>${emp.hiredate}<</td>
		  	<td>${emp.sal}<</td>
		  	<td>${emp.comm}<</td>
		  	<td>${emp.deptno}<</td>
		  </tr>
		</c:forEach>
	</table>
</body>
</html>