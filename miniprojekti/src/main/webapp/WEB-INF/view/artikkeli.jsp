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
            input { float:left; position:relative; }
            span {clear:both; display:block; float:left; position:relative; }
        </style>

    </head>
    <body>
        <h1>New/Edit entry (Article):</h1>
        <c:url value="/artikkeli" var="action"/>
        <form:form commandName="viite" action="${action}" method="POST">
            <span id="author0"><label>*Author: </label><form:input path="author0" /> <form:errors path="author0" /></span>
            <span id="author1"><label>Author: </label><form:input path="author1" /> <form:errors path="author1" /></span>
            <span id="author2"><label>Author: </label><form:input path="author2" /> <form:errors path="author2" /></span>
            <span id="author3"><label>Author: </label><form:input path="author3" /> <form:errors path="author3" /></span>
            <span id="author4"><label>Author: </label><form:input path="author4" /> <form:errors path="author4" /></span>
            <span id="author5"><label>Author: </label><form:input path="author5" /> <form:errors path="author5" /></span>
            <span id="author6"><label>Author: </label><form:input path="author6" /> <form:errors path="author6" /></span>
            <span id="author7"><label>Author: </label><form:input path="author7" /> <form:errors path="author7" /></span>
            <span id="author8"><label>Author: </label><form:input path="author8" /> <form:errors path="author8" /></span>
            <span id="author9"><label>Author: </label><form:input path="author9" /> <form:errors path="author9" /></span>

            <label>*Title: </label><form:input path="title" /> <form:errors path="title" /><br/>
            <label>*Journal: </label><form:input path="journal" /> <form:errors path="journal" /><br/>
            <label>*Year: </label><form:input path="publicationYear" /> <form:errors path="publicationYear" /><br/>
            <label>Identifier: </label><form:input path="refId" /> <form:errors path="refId" /><br/>
            <label>Volume: </label><form:input path="volume" /> <form:errors path="volume" /><br/>
            <label>Number: </label><form:input path="number" /> <form:errors path="number" /><br/>
            <label>Pages: </label><form:input path="pages" /> <form:errors path="pages" /><br/>
            <form:hidden path="id"/>
            <span><input type="submit" value="Send" /></span>
            </form:form>   
        <br/>

        <span><h4>(*) required field</h4></span>

        <span><a href="home">Return to main page</a></span>

    </body>
</html>
