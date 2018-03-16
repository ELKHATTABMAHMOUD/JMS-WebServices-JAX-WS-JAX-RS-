<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>



<html>
<body>
	<h3> Q5:Web service - veulliez saisir un message </h3>
	<form method="post" action="emetteur" > 
		<input type="text" name="message"/> 
		<input type="submit" name="envoyer" value="Envoyer" />
	</form>
	<% if(request.getAttribute("name") != null){ %>
	<%= request.getAttribute("name") %>
	<%}%>
</body>
</html>
