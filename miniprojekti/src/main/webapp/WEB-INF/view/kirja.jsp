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
        <h1>New/Edit entry (Book):</h1>
        <c:url value="/kirja" var="action"/>
        <form:form commandName="viite" action="${action}" method="POST">
            <label>*Author: </label><form:input path="author" /> <form:errors path="author" /><br/>
            <label>*Title: </label><form:input path="title" /> <form:errors path="title" /><br/>
            <label>*Publisher: </label><form:input path="publisher" /> <form:errors path="publisher" /><br/>
            <label>*Year: </label><form:input path="publicationYear" /> <form:errors path="publicationYear" /><br/>
            <label>Identifier: </label><form:input path="refId" /> <form:errors path="refId" /><br/>
            <label>Address: </label><form:input path="address" /> <form:errors path="address" /><br/>
            <label>Volume: </label><form:input path="volume" /> <form:errors path="volume" /><br/>
            <label>Series: </label><form:input path="series" /> <form:errors path="series" /><br/>
            <label>Edition: </label><form:input path="edition" /> <form:errors path="edition" /><br/>
            <label>Pages: </label><form:input path="pages" /> <form:errors path="pages" /><br/>
            <form:hidden path="id"/>
            <span><input type="submit" value="Send" /></span>
        </form:form>   
        <br/>
        <span><h4>(*) required field</h4></span>
        
    </body>
</html>
