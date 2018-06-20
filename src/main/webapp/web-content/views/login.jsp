<jsp:include page="header.jsp"></jsp:include>
		<div class="container jumbotron" style="margin-top:100px;" >
			<div class="row">
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<h2>Login</h2>
					<form action="/login.jsp" method="post">
						<div class="form-group">
							<label for="email">Email:</label>
							<input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
						</div>
						<div class="form-group">
							<label for="pwd">Password:</label>
							<input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password">
						</div>
						<button type="submit" class="btn btn-primary btn-block">Login</button>
						<p><font color="red">${errorMessage}</font></p>
					</form>
				</div>	
			</div>
		</div>
<jsp:include page="footer.jsp"></jsp:include>	