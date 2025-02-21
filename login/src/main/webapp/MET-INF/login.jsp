<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="static/styles.css">
    <script>
       /* function validateForm() {
            var username = document.forms["loginForm"]["username"].value;
            var password = document.forms["loginForm"]["password"].value;
            if (username == "" || password == "") {
                alert("Both fields are required!");
                return false;
            }
        }*/
    </script>
</head>
<body>
    <div class="login-container">
        <h2>Login</h2>
		<c:if  test="${not empty errormsg}">
						<h4 style="color:red">${errormsg}  </h4>
						
					</c:if>
        <form name="loginForm" action="LoginServlet" method="post" >
            <label for="username">Username:</label>
            <input type="text" id="username" name="name" required><br>
            
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br>
            
          
			<button type="submit">Sign Up</button>
        </form>
		if not registered.........<a href="regpage"><b> CLiCK HERE </b></a>
    </div>
</body>
</html>
