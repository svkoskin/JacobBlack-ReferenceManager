<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Miniprojekti</title>
    </head>
    <body>
        <h1>Vihavainen's references</h1>
        <br/>
        
        <h2>Add new reference entry:</h2>
        <ul>
            <li><a href="artikkeli" id="add_article">Add article</a></li>
            <li><a href="kirja" id="add_book">Add book</a></li>
            <li><a href="inproceedings" id="add_inproceedings">Add inproceedings</a></li>
        </ul>
        
        <h2>Saved references:</h2>
        <ul>
            <li><a href="listaus">List all</a></li>
        </ul>
        
        <br/>
        <h2>Number of references in database: ${viitecount}</h2>
    </body>
</html>
