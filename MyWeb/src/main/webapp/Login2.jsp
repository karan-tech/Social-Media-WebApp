<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<form action="karanhacker" method="get">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Button</title>
</head>
<body>
<div class="container">
  <h1>Registration Successfully Completed !!</h1>
  <p>Please click the "Login" button:</p>
  <a href="Login.jsp" class="btn-login">Login Here</a>
</div>
</body>
</html>

<style>
  body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f5f5f5;
  }

  .container {
    text-align: center;
    margin-top: 100px;
  }

  .btn-login {
    display: inline-block;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    font-size: 16px;
    cursor: pointer;
    color: white;
    background-color: #0074d9; /* Blue color */
  }

  .btn-login:hover {
    background-color: #0056b3; /* Darker blue color on hover */
  }
</style>
</form>
