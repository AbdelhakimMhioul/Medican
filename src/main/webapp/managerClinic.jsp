<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello, These is your clinic</h1>
	<table>
		<tr>
			<th>Nom clinic :</th>
			<td>${hm.nom_clinic}</td>
		</tr>

		<tr>
			<th>Ville clinic :</th>
			<td>${hm.ville_clinic}</td>
		</tr>

		<tr>
			<th>Description clinic :</th>
			<td>${hm.description}</td>
		</tr>

		<tr>
			<th>Nbr etoiles clinic :</th>
			<td>${hm.nbr_etoiles}</td>
		</tr>
		<tr>
			<th>Update data</th>
			<td><a href="EditClinic?id=${hm.getId_clinic()}">Edit</a></td>
		</tr>
		<tr>
			<th>Delete data</th>
			<td><a href="DeleteClinic?id=${hm.getId_clinic()}">delete</a></td>
		</tr>
	</table>
</body>
</html>