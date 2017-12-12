<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<h1>Logs</h1>
	<br>
	<a href="/sysjuriapi/log/search">Busque por um log</a>
	<br>
	<table class="table">
		<thead>
			<th>Produto</th>
			<th>Cliente</th>
			<th>DataHora</th>
			<th>Categoria</th>
<!-- 		<th>Registro</th> -->
		</thead>
		<tbody>
			<c:if test="${!empty logList}">
				<c:forEach items="${logList}" var="log">
					<tr>
						<td>${log.product}</td>
						<td>${log.client}</td>
						<td>${log.dateTime}</td>
						<td>${log.client}</td>
<%-- 					<td>${log.Register}</td> --%>						
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	<br>
	<a href="/sysjuriapi/log/create" class="btn btn-default">Criar novo log</a>
	<br>
