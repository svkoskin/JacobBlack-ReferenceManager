<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Miniprojekti</title>
        <style>
            label { clear:both; display:block; float:left; position:relative; width: 200px; }
            input { float:left; position:relative; }
            span {clear:both; display:block; float:left; position:relative; }
        </style>

    </head>
    <body>
        <h1>Uusi viite (Kirja):</h1>
        <form:form commandName="viite" action="kirja" method="POST">
            <label>*Tekijät: </label><form:input path="author" /> <form:errors path="author" /><br/>
            <label>*Nimi: </label><form:input path="title" /> <form:errors path="title" /><br/>
            <label>*Julkaisija: </label><form:input path="publisher" /> <form:errors path="publisher" /><br/>
            <label>*Vuosi: </label><form:input path="publicationYear" /> <form:errors path="publicationYear" /><br/>
            <label>Vuosikerta: </label><form:input path="volume" /> <form:errors path="volume" /><br/>
            <label>Julkaisusarja: </label><form:input path="series" /> <form:errors path="series" /><br/>
            <label>Painos: </label><form:input path="edition" /> <form:errors path="edition" /><br/>
            <label>Sivut: </label><form:input path="pages" /> <form:errors path="pages" /><br/>
            <span><input type="submit" value="Lähetä" /></span>
        </form:form>   
        <br/>
        <span><h4>(*) pakollinen kenttä</h4></span>
        
    </body>
</html>
