<%-- 
    Document   : pacjent
    Created on : 2019-12-02, 23:29:20
    Author     : stecu
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html lang="pl">
<head>
	<title>Pacjenci</title>
        <meta charset="utf-8">
        <script type="text/javascript"
        src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script type="text/javascript" src="<c:url value="/resources/functions.js" />"></script>
        <link href="<c:url value="/resources/style.css" />" rel="stylesheet">
</head>
<body>
    <div class="header">
            <header>

                <h1>${pracownik.tytulZawodowy} ${pracownik.imie} ${pracownik.nazwisko}, nr PWZ: ${pracownik.nrPWZ}</h1>


            </header>
                <br>
                <br>
        </div>
                <div class="navigation">
            
            <a href="stronaGlowna">Kalendarz</a>
            <a href="ksiegaChorychOddzialu">Ksiega chorych oddziałów</a>
            <a href="ksiegaPrzyjecWypisow">Księga przyjęć i wypisów</a>
            <a href="ksiegaRaportowLekarskich">Księga raportów lekarskich</a>
            <a href="ksiegaRaportowPielegniarskich">Księga raportów pielęgniarskich</a>
            <a href="ksiegaZabiegow">Księga zabiegów</a>
            <a class="active" href="pacjenci">Pacjent i jego dokumenty</a>
            <a href="<c:url value="logout" />" >Wyloguj sie</a>
        </div>
<h2> Pacjenci </h2>

        
        <form:form method="POST" action="pacjenci"  commandName="pacjentForm">
	<table style="margin-left: auto; margin-right: auto">
		<tr>
			<td>Szukaj pacjenta - podaj nr PESEL lub znak identyfikacyjny:</td>
                        <td><form:input path="pesel"/></td>
                        <td><input type="submit" value="Znajdź" /></td>
		</tr>
        </table>
                </form:form>


<br>
<h3>Lista pacjentów szpitala</h3>
<c:if test="${!empty listPacjents}">
	<table class="tg" style="width: 100%">
	<tr>
		<th width=8%>Pesel</th>
		<th width=8%>Imie</th>
		<th width=8%>Drugie imie</th>
                <th width=8%>Nazwisko</th>
		<th width=10%>Znak Identyfikacyjny</th>
                <th width=10%>Data urodzenia</th>
		<th width=20%>Adres</th>
                <th width=10%>Plec</th>
		<th width=18%>Dane przedstawiciela ustawowego</th>
	</tr>
	<c:forEach items="${listPacjents}" var="pacjent">
		<tr>
			<td>${pacjent.pesel}</td>
			<td>${pacjent.imie}</td>
			<td>${pacjent.drugieImie}</td>
                        <td>${pacjent.nazwisko}</td>
                        <td>${pacjent.znakIdentyfikacyjny}</td>
                        <td>${pacjent.dataUrodzenia}</td>
                        <td>${pacjent.adres}</td>
                        <td>${pacjent.plec}</td>
                        <td>${pacjent.danePrzedstawicielaUst}</td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>