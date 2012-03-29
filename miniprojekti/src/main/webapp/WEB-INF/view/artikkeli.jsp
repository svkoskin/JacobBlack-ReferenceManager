<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Miniprojekti</title>
    </head>
    <body>
        <h1>Uusi viite (artikkeli):</h1>
        <form:form commandName="viite" action="artikkeli" method="POST">
            Title: <form:input path="title" /> <form:errors path="title" /><br/>
            <input type="submit" value="Lähetä" />
        </form:form>   
        
    </body>
</html>
