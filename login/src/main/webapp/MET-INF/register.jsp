<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
		<!DOCTYPE html>
		<html>
		<head>	
		    <title>Signup Form</title>
		    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/resources/static/styles.css">
		</head>
		<body>
		    <h2>Signup Form</h2>
			<c:if  test="${not empty succesmsg}">
				<h4 style="color:green">${succesmsg}  </h4>
				
			</c:if>
			
		    <form action="regform" method="post">
		        <label for="name">Username :</label>
		        <input type="text" id="name" name="name" required><br><br>

		        <label for="email">Email:</label>
		        <input type="email" id="email" name="email" required><br><br>

		        <label for="password">Password:</label>
		        <input type="password" id="password" name="password" required><br><br>

		        <button type="submit">Sign Up</button>
		    </form>
		</body>
		</html>

		
		
		
