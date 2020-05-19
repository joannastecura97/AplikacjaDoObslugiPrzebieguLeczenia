<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Strona logowania</title>
        <link  href="<c:url value="resources/styleStart.css" />" rel="stylesheet"  >
    </head>
    <body>
        <header>
<h1>System do obsługi przebiegu leczenia pacjenta</h1>

</header>

<div class="center">
    <form name="loginform" action="<c:url value='/login'/>" method="POST" commandName="pracownik">
        
        <h3>Zaloguj się</h3>
        
        <!-- invalid credentials error msg -->
        <c:if test="${not empty error}">
            <div class="errormessage">${error}</div>
        </c:if>
         
        <!-- logged out msg -->
        <c:if test="${not empty msg}">
            <div class="message">${msg}</div>
        </c:if>
         
        <!-- custom login form -->
            <table>
                <tr>
                    <td>Nazwa użytkownika:</td>
                </tr>
                <tr>
                    <td><input type='text' name='username'></td>
                </tr>
                <tr>
                    <td><br>Hasło:</td>
                </tr>
                <tr>
                    <td><input type='password' name='password'/></td>
                </tr>
                  <tr>
                    
                    <td><br><div class="holder"><input name="submit" type="submit" value="Potwierdź" /></div></td>
                </tr>
            </table>
        </form>
            </div>
    </body>
</html>