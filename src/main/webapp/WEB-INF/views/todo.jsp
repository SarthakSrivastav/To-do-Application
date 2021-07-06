<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>
	<div class="container">
		<h3  style=" font-family: Cursive;">Welcome ${name}</h3>
<div>
<h1  style=" font-family: Cursive; text-align: center; color: green"> <u>Your Today's Task Is </u></h1>
	<table style=" font-family: Cursive; font-size: large;" class="table table-striped">
		<thead>
			<th><u>Description</u></th>
			<th><u>Category</u></th>
			<th><u>Added On</u></th>
			<th><u>Action</u></th>
		</thead>
		<tbody>
		<c:forEach items="${todos}" var="todo">
			<tr>
				<td>${todo.name}</td>
				<td>${todo.category}</td>
				<td>${todo.date}</td>
				<td><a class="btn btn-danger" href="/delete-todo.do?name=${todo.name}">Delete</a></td>
			</tr>
		</c:forEach>
		</tbody>		 
	</table>
	<a style="margin-bottom: 50px;" class="btn btn-success" href="/add-todo.do">Add New Todo</a>
</div>
	</div>
	<%@ include file="../common/footer.jspf" %> 
</html>
