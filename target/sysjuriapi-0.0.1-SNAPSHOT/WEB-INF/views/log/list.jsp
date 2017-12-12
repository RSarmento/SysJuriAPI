<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div style="width: 100%; text-align: center">
	<h1>Logs</h1>
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
						<td>${log.id}</td>
						<td>${log.Product}</td>
						<td>${log.Client}</td>
<%-- 					<td>${log.DateTime}</td> --%>
						<td>${log.Client}</td>
<%-- 					<td>${log.Register}</td> --%>
						<td>
							<a href="/sysjuriapi/log/search">Search for a Log</a>
						</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	<br>
	<a href="/sysjuriapi/log/create" class="btn btn-default">Insert new Log</a>
	<br>
</div>