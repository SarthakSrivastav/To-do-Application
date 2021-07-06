<%@ include file="../common/header.jspf" %>
<nav class="navbar navbar-inverse" style="font-size: large;">
  <div class="container-fluid">
    <ul class="nav navbar-nav">
      <li class="active"><a href="/login.do">Home</a></li>
      <li><a href="/list-todo.do">Todos</a></li>
      <li><a href="/add-todo.do">Add Todos</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="/login.do"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
    <form class="navbar-form navbar-right" action="#">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search">
      </div>&nbsp;&nbsp;
      <button type="submit" class="btn btn-success">Submit</button>
    </form>
  </div>
</nav>

	<div class="container">	
		<h2 style=" font-family: Cursive; text-align: center;">Welcome To to-do Application!</h2>
		<p style="color: red">${errorMessage}</p>
		<form action="/login.do" method="post">
			<fieldset class="form-group">
			<label style=" font-family: Cursive; font-size: large;">Enter Your Name:</label>
			<input style=" font-family: Cursive; font-size: large;" type="text" name="name" required="required" class="form-control"><br><br>
			</fieldset>
			<fieldset class="form-group">
			<label style=" font-family: Cursive; font-size: large;">Enter Your Pass:</label>
			<input style=" font-family: Cursive; font-size: large;"  type="password" name="pass" required="required" class="form-control"><br><br>
			</fieldset>
			<fieldset class="form-group">
			<input style=" font-family: Cursive; font-size: large;" type="submit" value="Login" class="btn btn-success">
			</fieldset>
		</form>
	</div>
<%@ include file="../common/footer.jspf" %>
</html>