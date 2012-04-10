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
        <h1>Uusi viite</h1>
        <form:form commandName="viite" action="artikkeli" method="POST">
            <label>Nimi:</label>
            <form:input path="title" /> <form:errors path="title" />

            <label>Tekijät:</label>
            <form:input path="author" /> <form:errors path="author" />

            <label>Julkaisuvuosi:</label>
            <form:input path="publicationYear" /> <form:errors path="publicationYear" />

            <label>Julkaisija:</label>
            <form:input path="publisher" /> <form:errors path="publisher" />

            <label>Julkaisu:</label>
            <form:input path="journal" /> <form:errors path="journal" />

            <label>Valinnaiset tiedot</label>

            <label>Numero (volume):</label>
            <form:input path="volume" /> <form:errors path="volume" />

            <label>Kuukausi:</label>
            <form:input path="publicationMonth" /> <form:errors path="publicationMonth" />

            <label>Lisätiedot:</label>
            <form:input path="note" /> <form:errors path="note" />

            <label>Järjestys:</label>
            <form:input path="referenceKey" /> <form:errors path="referenceKey" />

            <label>Numero (number):</label>
            <form:input path="number" /> <form:errors path="number" />

            <label>Sivut:</label>
            <form:input path="pages" /> <form:errors path="pages" />

            <label>Julkaisusarja:</label>
            <form:input path="series" /> <form:errors path="series" />

            <label>Julkaisijan osoite tai paikkakunta:</label>
            <form:input path="address" /> <form:errors path="address" />

            <label>Painos:</label>
            <form:input path="edition" /> <form:errors path="edition" />

            <input type="submit" value="Tallenna viite" />
        </form:form>   

    </body>
</html>
