<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<c:url var="actionSearch" value="/log/search"></c:url>
<h1>Search for log</h1>
<br>
<form:form action="${actionSearch}" method="post" modelAttribute="log">
	<label>Produto</label>
	<form:input path="product"/>
	<form:errors></form:errors>
	<br>
<!-- 	<label>Cliente</label> -->
<%-- 	<form:input path="client"/> --%>
<%-- 	<form:errors></form:errors> --%>
<!-- 	<br> -->
<!-- 	<label>A partir da data</label> -->
<%-- 	<form:input path=dateStart/> --%>
<%-- 	<form:errors></form:errors> --%>
<!-- 	<label>At� a data</label> -->
<%-- 	<form:input path=dateEnd/> --%>
<%-- 	<form:errors></form:errors> --%>
<!-- 	<label>Categoria</label> -->
<%-- 	<form:input path="category"/> --%>
<%-- 	<form:errors></form:errors> --%>
<!-- 	<br> -->
</form:form>
<input type="submit" value="Buscar">
<br>
