<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>
	<div class="container">
	<h1 style=" font-family: Cursive; text-align: center; color: green"><u>${name} Add Your New Action Item</u></h1>
		<form style=" font-family: Cursive; font-size: large;" action="/add-todo.do" method="post">
			<fieldset class="form-group">
			<label>Description</label>
			<input type="text" name="newTodo" required="required" class="form-control"><br><br> 
			</fieldset>
			<fieldset class="form-group">
			<label>Category</label>
			<input type="text" name="category" required="required" class="form-control"><br><br>
			</fieldset>
			<input	type="submit" value="Submit" class="btn btn-success">
		</form>
	</div>
<%@ include file="../common/footer.jspf" %>
</html>
