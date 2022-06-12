<html>
<head>
<title>Sample Application JSP Page</title>
</head>
<body bgcolor=white>

<table border="0">
<tr>
<td align=center>
<img src="images/wildfly.gif">
</td>
<td>
<h1>Sample Application JSP Page</h1>
This is the output of a JSP page that is part of the Hello, World
application.
</td>
</tr>
</table>
<%
java.time.format.DateTimeFormatter dtf = java.time.format.DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
java.time.LocalDateTime now = java.time.LocalDateTime.now();
%>

Today is <%= dtf.format(now) %>

</body>
</html>
