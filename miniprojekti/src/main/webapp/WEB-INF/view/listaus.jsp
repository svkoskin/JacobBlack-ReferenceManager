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
        <h1>Viitteet:</h1>
        <br/>
        
        <c:forEach var="viite" items="${viitteet}">
            <c:if test="${ not empty viite.author}"><label>Tekijät:</label> ${viite.author} <br/></c:if>
            <c:if test="${ not empty viite.title}"><label>Nimi:</label> ${viite.title} <br/></c:if>
            <c:if test="${ not empty viite.publicationYear}"><label>Julkaisuvuosi:</label> ${viite.publicationYear} <br/></c:if>
            <c:if test="${ not empty viite.publisher}"><label>Julkaisija:</label> ${viite.publisher} <br/></c:if>
            <c:if test="${ not empty viite.journal}"><label>Julkaisu:</label> ${viite.journal} <br/></c:if>
            <c:if test="${ not empty viite.volume}"><label>Numero (volume):</label> ${viite.volume} <br/></c:if>
            <c:if test="${ not empty viite.number}"><label>Numero (number):</label> ${viite.number} <br/></c:if>
            <c:if test="${ not empty viite.pages}"><label>Sivut:</label> ${viite.pages} <br/></c:if>
            <c:if test="${ not empty viite.series}"><label>Julkaisusarja:</label> ${viite.series} <br/></c:if>
            <c:if test="${ not empty viite.edition}"><label>Painos:</label> ${viite.edition} <br/></c:if>
            <br/><br/>
        </c:forEach>
        
        
        
    </body>
</html>
