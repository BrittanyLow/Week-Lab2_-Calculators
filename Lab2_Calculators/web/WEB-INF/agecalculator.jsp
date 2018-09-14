<%-- 
    Document   : agecalculator
    Created on : Sep 13, 2018, 12:13:41 PM
    Author     : 707114
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculators</title>
    </head>
    <body>
        <h1>Age Calculators</h1>
        <form method="post" action="Age">
            Enter your age: <input type="text" name="age" value="${nAge}"><br>
            <div>
            ${message}
            </div>
            <input type="submit" value="Submit">
      </form>
            <div>
            <a href="Arithmetic">Arithmetic Calculator</a>
            </div>
       
        
    </body>
</html>
