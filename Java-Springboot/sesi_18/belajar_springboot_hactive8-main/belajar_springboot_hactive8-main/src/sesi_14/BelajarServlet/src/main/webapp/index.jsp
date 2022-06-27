<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>JSP Form Login</title>
	
	<style>
		body {font-family: Arial, Helvetica, sans-serif;}
		form {border: 3px solid #f1f1f1;}
		
		input[type=text], input[type=password] {
		  width: 100%;
		  padding: 12px 20px;
		  margin: 8px 0;
		  display: inline-block;
		  border: 1px solid #ccc;
		  box-sizing: border-box;
		}
		
		button {
		  background-color: #04AA6D;
		  color: white;
		  padding: 14px 20px;
		  margin: 8px 0;
		  border: none;
		  cursor: pointer;
		  width: 100%;
		}
		
		button:hover {
		  opacity: 0.8;
		}
		
		.hellobtn {
		  width: auto;
		  padding: 10px 18px;
		  background-color: #f44336;
		  color: #FFF;
		}		
		
		.container {
		  padding: 16px;
		}
		
		span.psw {
		  float: right;
		  padding-top: 16px;
		}
		
		/* Change styles for span and cancel button on extra small screens */
		@media screen and (max-width: 300px) {
		  span.psw {
		     display: block;
		     float: none;
		  }
		  .cancelbtn {
		     width: 100%;
		  }
		}
	</style>
</head>
<body>
	<h2 align="center">Form Login</h2>
	<form action="doLogin" method="post" style="margin: auto; width: 50%;">			
		<div class="container">			
	    	<label for="uname"><b>Username</b></label>
		    <input type="text" placeholder="Enter Username" id="username" name="username" required>
		
		    <label for="psw"><b>Password</b></label>
		    <input type="password" placeholder="Enter Password" id="password" name="password" required>
		        
		    <button type="submit">Login</button>
	  	</div>		
		<div class="container" style="background-color:#f1f1f1">
		  	<a href="HelloServlet" >Goto > Hello</a>		  	
		</div>		
	</form>
	
	<!-- Untuk menggunakan Alert Error silahkan hapus kode berikut : required di input username dan password -->
	<%
		String err = (String) request.getAttribute("err");
		if (err!=null){
	%>
	<script type="text/javascript">
		alert('<%=err%>')
	</script>
	<% } %>
		
</body>
</html>