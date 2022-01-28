<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>

<tr>
                <th>Hotel Name: </th>
                <td>
                 <input type="text" name="name" size="45"
                   value="${h.nom_hotel}"
                  />
                </td>
            </tr>
            <tr>
                <th>Hotel Address: </th>
                <td>
                 <input type="text" name="email" size="45"
                   value="${h.adresse_hotel}"
                 />
                </td>
            </tr>
            <tr>
                <th>Ville: </th>
                <td>
                 <input type="text" name="country" size="15"
                   value="${h.ville_hotel}"
                 />
                </td>
            </tr>
             <tr>
                <th>Description: </th>
                <td>
                 <input type="text" name="country" size="15"
                   value="${h.description}"
                 />
                </td>
            </tr>
            

</table>

</body>
</html>