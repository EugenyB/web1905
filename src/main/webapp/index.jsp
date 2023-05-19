<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Tabulation</title>
</head>
<body>
<h1>Tabulation</h1>
<br/>
<form action="tabulate" method="post">
    <table>
        <tr>
            <td><label for="start">Start</label></td>
            <td><input type="text" id="start" name="start"></td>
        </tr>
        <tr>
            <td><label for="finish">Finish</label></td>
            <td><input type="text" id="finish" name="finish"></td>
        </tr>
        <tr>
            <td><label for="step">Step</label></td>
            <td><input type="text" id="step" name="step"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Ok"></td>
        </tr>
    </table>
</form>
</body>
</html>