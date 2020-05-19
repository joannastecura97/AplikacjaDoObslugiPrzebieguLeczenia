<%-- 
    Document   : ksiegaRaportowPielegniarskich
    Created on : 2019-12-10, 03:29:05
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
        <title>Ksiega raportow pielegniarskich</title>
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
            <a class="active" href="ksiegaRaportowPielegniarskich">Księga raportów pielęgniarskich</a>
            <a href="ksiegaZabiegow">Księga zabiegów</a>
            <a href="pacjenci">Pacjent i jego dokumenty</a>
            <a href="<c:url value="logout" />" >Wyloguj sie</a>
        </div>
        <h2>
            Ksiega Raportów Pielęgniarskich
        </h2>
        <br>
        <br>
        <h3>Lista wpisów w księdze raportów pielęgniarskich</h3>
        <c:if test="${!empty listKsiegaRaportowPielegniarskich}">
            <table class="tg">
                <tr>
                    <th width="80">Nr wpisu</th>
                    <th width="80">Data</th>
                    <th width="120">Liczba osób przyjetych</th>
                    <th width="120">Liczba osób wypisanych</th>
                    <th width="120">Liczba osób zmarłych</th>
                    <th width="120">Imię, nazwisko oraz nr PWZ pielęgniarki</th>


                </tr>
                <c:forEach items="${listKsiegaRaportowPielegniarskich}" var="ksiegaRaportowPielegniarskich">
                    <tr>
                        <td>${ksiegaRaportowPielegniarskich.nrWpisu}</td>
                        <td>${ksiegaRaportowPielegniarskich.data}</td>
                        <td>${ksiegaRaportowPielegniarskich.osobyPrzyjete}</td>
                        <td>${ksiegaRaportowPielegniarskich.osobyWypisane}</td>
                        <td>${ksiegaRaportowPielegniarskich.osobyZmarle}</td>
                        <td>${ksiegaRaportowPielegniarskich.pielegniarka.tytulZawodowy} ${ksiegaRaportowPielegniarskich.pielegniarka.imie} ${ksiegaRaportowPielegniarskich.pielegniarka.nazwisko} ${ksiegaRaportowPielegniarskich.pielegniarka.nrPWZ}</td>

                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>
