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
        <h1>References:</h1>
        <br/>

        <c:forEach var="viite" items="${viitteet}">
            <label>Reference ${viite.id}</label> <a href="edit/${viite.id}">edit</a><br/>
            <c:if test="${ not empty viite.refId}"><label>Identifier:</label> ${viite.refId} <br/></c:if>
            <c:if test="${ not empty viite.authors}"><label>Authors:</label> ${viite.authorsString} <br/></c:if>
            <c:if test="${ not empty viite.title}"><label>Title:</label> ${viite.title} <br/></c:if>
            <c:if test="${ not empty viite.booktitle}"><label>Booktitle:</label> ${viite.booktitle} <br/></c:if>
            <c:if test="${ not empty viite.publicationYear}"><label>Year:</label> ${viite.publicationYear} <br/></c:if>
            <c:if test="${ not empty viite.publisher}"><label>Publisher:</label> ${viite.publisher} <br/></c:if>
            <c:if test="${ not empty viite.journal}"><label>Journal:</label> ${viite.journal} <br/></c:if>
            <c:if test="${ not empty viite.volume}"><label>Volume:</label> ${viite.volume} <br/></c:if>
            <c:if test="${ not empty viite.number}"><label>Number:</label> ${viite.number} <br/></c:if>
            <c:if test="${ not empty viite.pages}"><label>Pages:</label> ${viite.pages} <br/></c:if>
            <c:if test="${ not empty viite.series}"><label>Series:</label> ${viite.series} <br/></c:if>
            <c:if test="${ not empty viite.edition}"><label>Edition:</label> ${viite.edition} <br/></c:if>
            <c:if test="${ not empty viite.editor}"><label>Editor:</label> ${viite.editor} <br/></c:if>
            <c:if test="${ not empty viite.organization}"><label>Organization:</label> ${viite.organization} <br/></c:if>
            <c:if test="${ not empty viite.address}"><label>Address:</label> ${viite.address} <br/></c:if>
                <br/>
        </c:forEach>

        <span><a href="home">Return to main page</a></span>        


    </body>
</html>
