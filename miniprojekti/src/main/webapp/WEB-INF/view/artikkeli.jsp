<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Miniprojekti</title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/res/jacob.css" />" />
    </head>
    <body>
        <h1>New/Edit entry (Article):</h1>
        <c:url value="/artikkeli" var="action"/>
        <form:form commandName="viite" action="${action}" method="POST" class="form">
            <p><form:input path="author0" /><label for="author0">*Author</label><form:errors path="author0" cssClass="error" /></p>
            <p><form:input path="author1" /><label for="author1">Author</label><form:errors path="author1" cssClass="error" /></p>
            <p><form:input path="author2" /><label for="author2">Author</label><form:errors path="author2" cssClass="error" /></p>
            <p><form:input path="author3" /><label for="author3">Author</label><form:errors path="author3" cssClass="error" /></p>
            <p><form:input path="author4" /><label for="author4">Author</label><form:errors path="author4" cssClass="error" /></p>
            <p><form:input path="author5" /><label for="author5">Author</label><form:errors path="author5" cssClass="error" /></p>
            <p><form:input path="author6" /><label for="author6">Author</label><form:errors path="author6" cssClass="error" /></p>
            <p><form:input path="author7" /><label for="author7">Author</label><form:errors path="author7" cssClass="error" /></p>
            <p><form:input path="author8" /><label for="author8">Author</label><form:errors path="author8" cssClass="error" /></p>
            <p><form:input path="author9" /><label for="author9">Author</label><form:errors path="author9" cssClass="error" /></p>

            <p><form:input path="title" /><label for="title">*Title</label><form:errors path="title" cssClass="error" /></p>
            <p><form:input path="journal" /><label for="journal">*Journal</label><form:errors path="journal" cssClass="error" /></p>
            <p><form:input path="publicationYear" /><label for="publicationYear">*Year: </label><form:errors path="publicationYear" cssClass="error" /></p>
            <p><form:input path="refId" /><label for="refID">Identifier</label><form:errors path="refId" cssClass="error" /></p>
            <p><form:input path="volume" /><label for="volume">Volume</label><form:errors path="volume" cssClass="error" /></p>
            <p><form:input path="number" /><label for="number">Number</label><form:errors path="number" cssClass="error" /></p>
            <p><form:input path="pages" /><label for="pages">Pages</label><form:errors path="pages" cssClass="error" /></p>
            <form:hidden path="id"/>
            <span><input type="submit" id="submit" value="Send" /></span>
            </form:form>   
        <br/>

        <span><h4>(*) required field</h4></span>

        <span><a href="home">Return to main page</a></span>
    </body>
</html>
