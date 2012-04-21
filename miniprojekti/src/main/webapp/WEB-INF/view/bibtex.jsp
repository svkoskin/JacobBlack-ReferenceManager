<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Miniprojekti</title>
        <style>
            label { clear:both; display:block; float:left; position:relative; width: 200px; }
        </style>
    </head>
    <body>
        <h1>There's your BIBTEX:</h1>
        <br/>
        <textarea rows="40" cols="100"><c:forEach var="viite" items="${viitteet}">${viite.bibtex}</c:forEach></textarea>



        <span><a href="home">Return to main page</a></span>

    </body>
</html>
