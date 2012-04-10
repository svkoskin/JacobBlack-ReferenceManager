<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Miniprojekti</title>
    </head>
    <body>
        <h1>Luukkaisen viitteet</h1>
        <br/>
        
        <h2>Lisää uusi viite:</h2>
        <ul>
            <li><a href="artikkeli">Lisaa artikkeli</a></li>
        </ul>
        
        <br/>
        <h2>Viitteitä tietokannassa: ${viitecount}</h2>
    </body>
</html>
