<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 13, 2018, 12:54:28 PM
    Author     : 707114
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="Arithmetic">
            First: <input type="text" name="nOne" value="${nOne}"><br>
            Second: <input type="text" name="nTwo" value="${nTwo}"><br>
            <br>
            <input type="submit" name="submit" value="+">
            <input type="submit" name="submit" value="-">
            <input type="submit" name="submit" value="*">
            <input type="submit" name="submit" value="%">
            <br>
        </form>
            <div>
                Result: ${result}<br>
            <a href="Age">Age Calculator</a>
            </div>
    </body>
</html>
