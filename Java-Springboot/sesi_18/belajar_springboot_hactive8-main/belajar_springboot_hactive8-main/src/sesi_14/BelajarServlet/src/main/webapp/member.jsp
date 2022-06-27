<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Member JSP</title>
	
	<style type="text/css">
		table,tr,td{
			background-color: #FFF ;
			font-family: century gothic;
			color: green;
			border: 1px solid orange;
			padding: 5px;
			border-collapse: collapse;
		}
		
		.container {
		  padding: 16px;
		}
		
		button {
		  background-color: #04AA6D;
		  color: white;
		  padding: 14px 20px;		  
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
		
	</style>
</head>

<jsp:useBean id="member" scope="session" class="com.belajar.model.Member" />
<body>
	<div class="container">
		<table style="margin: auto; width: 50%;">
			<tr>
				<td colspan="3" align="center">
					<b>Form Welcome</b>					
				</td>
			</tr>
			<tr>
				<td><b>Hai, Selamat Datang</b></td>
				<td>:</td>
				<td><%=member.getUsername()%></td>
			</tr>
			<tr>
				<td colspan="3" align="center">
					<Button class="hellobtn"onclick="javascript:history.go(-1)"> Kembali</Button>
				</td>
			</tr>	
		</table>
	</div>	
</body>
</html>