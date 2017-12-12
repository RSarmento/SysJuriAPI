<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<c:url var="actionCreate" value="/log/create"></c:url>
<h1>Create log</h1>
<form:form action="${actionCreate}" method="post" modelAttribute="log">
	<label>Product name </label>
	<form:input path="product"/>
	<form:errors path="product"></form:errors>
	<br>
	<label>Client's name </label>
	<form:input path="client"/>
	<br>
	<label>Which category </label>
	<form:input path="category"/>
	<input type="submit" value="Save">
</form:form>


