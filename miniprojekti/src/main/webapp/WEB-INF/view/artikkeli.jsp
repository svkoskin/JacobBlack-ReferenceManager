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
            span { float:left; position:relative; }
        </style>

    </head>
    <body>
        <h1>Uusi viite (artikkeli):</h1>
        <form:form commandName="viite" action="artikkeli" method="POST">
            <label>*Tekijät: </label><form:input path="author" /> <form:errors path="author" /><br/>
            <label>*Otsikko: </label><form:input path="title" /> <form:errors path="title" /><br/>
            <label>*Journal: </label><form:input path="journal" /> <form:errors path="journal" /><br/>
            <label>*Vuosi: </label><form:input path="publicationYear" /> <form:errors path="publicationYear" /><br/>
            <label>Vuosikerta: </label><form:input path="volume" /> <form:errors path="volume" /><br/>
            <label>Numero: </label><form:input path="number" /> <form:errors path="number" /><br/>
            <label>Sivut: </label><form:input path="pages" /> <form:errors path="pages" /><br/>
            <input type="submit" value="Lähetä" />
        </form:form>   
        <br/>
        <h4>(*) pakollinen kenttä</h4>
        
    </body>
</html>
