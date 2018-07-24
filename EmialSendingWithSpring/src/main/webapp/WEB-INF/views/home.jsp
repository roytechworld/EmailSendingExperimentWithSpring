<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

<table width=100%>
<tr>

<td >
Sender Email Address :
<br/>
<input type="text" id="emid" />


</td>
</tr>

<tr>

<td colspan=2>
Compose Message:
<br/>
<textarea rows="13" cols="78"></textarea>


</td>
</tr>
<tr>
<td colspan=2>
<button id="btsend">Send email</button>
</td>
</tr>
<div id="status">

</div>
</table>





</body>
</html>
