<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Miniprojekti</title>
    </head>
    <body>
        <h1>Vihavaisen viitteet</h1>
        <br/>
        
        <h2>Lisää uusi viite:</h2>
        <ul>
            <li><a href="artikkeli">Lisää artikkeli</a></li>
            <li><a href="artikkeli" id="add_article">Lisää artikkeli</a></li>
            <li><a href="kirja" id="add_book">Lisää kirja</a></li>
        </ul>
        
        <h2>Tallennetut viitteet:</h2>
        <ul>
            <li><a href="listaus">Näytä kaikki</a></li>
        </ul>
        
        <br/>
        <h2>Viitteitä tietokannassa: ${viitecount}</h2>
    </body>
</html>
