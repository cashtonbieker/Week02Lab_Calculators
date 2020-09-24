<%-- 
    Document   : ageCalculator
    Created on : 24-Sep-2020, 10:56:28 AM
    Author     : Cashton
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="ageCalculator" method="post">
            <table border="0" cellpadding="0">
                <tbody>
                    <tr>
                        <td><label> Enter your current age: </label></td>
                        <td><input type="text" name="current_age" value="${currentAge}"></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Calculate"></td>
                    </tr>
                </tbody>
            </table>
            <p> ${errorMsg} ${result} </p> 
        </form>
        <br>
        <a href="./arithmeticCalculator">Arithmetic Calculator</a>
    </body>
</html>
