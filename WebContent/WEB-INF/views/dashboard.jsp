<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div style="width: 100%; text-align: center">
	<h1>Dashboard</h1>
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
						<td>${log.DateTime}</td>
						<td>${log.Client}</td>
<%-- 					<td>${log.Register}</td> --%>
						<td>
							<a href="/sysjuri/dashboard/edit/${log.id}">Edit the bitch</a>
							<a href="/TreinaWebSpringMVC/logs/delete/${log.id}">Delete the bitch</a>
						</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	<br>
	<a href="/TreinaWebSpringMVC/logs/add" class="btn btn-default">Knows a lady that want's to become mabitch?</a>
</div>