<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<div style="width: 100%; text-align: center">
	<h1>Search for log</h1>
	<br>
	<form:form>
		<label>Produto</label>
		<form:input path="Product"/>
		<form:errors></form:errors>
		<label>Cliente</label>
		<form:input path="Client"/>
		<form:errors></form:errors>
		<label>A partir da data</label>
		<form:input path=DateTimeStart/>
		<form:errors></form:errors>
		<label>Até a data</label>
		<form:input path=DateTimeEnd/>
		<form:errors></form:errors>
		<label>Categoria</label>
		<form:input path="Category"/>
		<form:errors></form:errors>
	</form:form>
	
</div>