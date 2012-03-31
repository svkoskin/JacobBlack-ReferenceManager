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
            *Tekijät: <form:input path="author" /> <form:errors path="author" /><br/>
            *Otsikko: <form:input path="title" /> <form:errors path="title" /><br/>
            *Journal: <form:input path="journal" /> <form:errors path="journal" /><br/>
            *Vuosi: <form:input path="year" /> <form:errors path="year" /><br/>
            Vuosikerta: <form:input path="volume" /> <form:errors path="volume" /><br/>
            Numero: <form:input path="number" /> <form:errors path="number" /><br/>
            Sivut: <form:input path="pages" /> <form:errors path="pages" /><br/>
            <input type="submit" value="Lähetä" />
        </form:form>   
        <br/>
        <h4>(*) pakollinen kenttä</h4>
        
    </body>
</html>
