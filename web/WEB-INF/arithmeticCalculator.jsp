<%-- 
    Document   : arithmeticCalculator
    Created on : 24-Sep-2020, 10:57:14 AM
    Author     : Cashton
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
        <form action="arithmeticCalculator" method="POST">
            <table border="0" cellspacing="3" cellpadding="3">
                <tbody>
                    <tr>
                        <td><label>First: </label></td>
                        <td><input type="text" name="first" value="${first}"></td>
                    </tr>
                    <tr>
                        <td><label>Second: </label></td>
                        <td><input type="text" name="second" value="${second}"></td>
                    </tr>
                </tbody>
            </table>
            <table border="0" cellspacing="3" cellpadding="3">
                <tbody>
                    <tr>
                        <td><input type="submit" value="+"></td>
                        <td><input type="submit" value="-"></td>
                        <td><input type="submit" value="*"></td>
                        <td><input type="submit" value="/"></td>
                    </tr>
                </tbody>
            </table>
            <p>${errorMsg}</p>
            <br>
            <p>Result: </p><p value="${result}"></p>
            <br>
            ${result}
        </form>
            <a href="./ageCalculator">Age Calculator</a>
    </body>
</html>
