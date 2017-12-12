<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<c:url var="actionCreate" value="/log/create"></c:url>
<h1>Create log</h1>
<form:form action="${actionCreate}" method="post" modelAttribute="log">
	<label>Nome do produto</label>
	<form:input path="product"/>
	<form:errors path="product"></form:errors>
	<br>
	<label>Nome do cliente</label>
	<form:input path="client"/>
	<form:errors path="client"></form:errors>
	<br>
	<label>Data de criação</label>
	<form:input path="dateTime"/>
	<form:errors path="dateTime"></form:errors>
	<br>
	<label>Categoria</label>
	<form:input path="category"/>
	<input type="submit" value="Salvar">
</form:form>


