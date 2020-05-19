<%-- 
    Document   : ksiegaRaportowLekarskich
    Created on : 2019-12-10, 15:26:55
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
        <title>Ksiega raportow lekarskich</title>
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
            <a class="active" href="ksiegaRaportowLekarskich">Księga raportów lekarskich</a>
            <a href="ksiegaRaportowPielegniarskich">Księga raportów pielęgniarskich</a>
            <a href="ksiegaZabiegow">Księga zabiegów</a>
            <a href="pacjenci">Pacjent i jego dokumenty</a>
            <a href="<c:url value="logout" />" >Wyloguj sie</a>
        </div>
        <h2>
            Ksiega Raportów Lekarskich
        </h2>
        <div class="errormessage">
            <c:if test="${not empty errMsg}">
                <h4 class="text-danger">${errMsg}</h4>
            </c:if>
        </div>
        <br>
        <div class="panel" id="panel1" style="widht: 100%; height: 350px;">
            <form:form action="ksiegaRaportowLekarskich" method="POST" commandName="ksiegaRaportowLekarskich">
                <table class="formula">



                    <tr>
                        <td>
                            <form:label path="nrKomOrg">
                                <spring:message text="Nr komorki organizacyjnej: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:select name="nazwa" path="nrKomOrg">
                        <option>001</option>
                        <option>002</option>
                    </form:select>
                    </td> 
                    </tr>


                    <tr>
                        <td>
                            <form:label path="data">
                                <spring:message text="Data wpisu: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="data" type="text" id="datepicker" autocomplete="off"/>
                        </td> 
                    </tr>

                    <tr>
                        <td>
                            <form:label path="pacjent">
                                <spring:message text="Nr PESEL pacjenta: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="pacjent" />
                        </td> 
                    </tr>

                    <tr>
                        <td>
                            <form:label path="sprawozdanie">
                                <spring:message text="Sprawozdanie: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:textarea style="height: 150px"  path="sprawozdanie" />
                        </td> 
                    </tr>

                    <tr>
                        <td>
                            <form:label path="lekarz.nrPWZ">
                                <spring:message text="Nr PWZ lekarza: "/>
                            </form:label>
                        </td>
                        <td><input value="${pracownik.nrPWZ}" readonly="true" disabled="true"/>
                            <form:input path="lekarz.nrPWZ" type="hidden" value="${pracownik.nrPWZ}"  readonly="true"/>

                        </td> 
                    </tr>

                    <tr>
                        <td></td>

                        <td colspan="2">
                            <br>
                            <input type="submit"
                                   value="<spring:message text="Dodaj"/>" />
                        </td>
                    </tr>
                </table>	
            </form:form>
        </div>
        <br>
        <p class="flip" id="flip1">Kliknij tutaj aby dodać nowy wpis do księgi raportów lekarskich</p>

        <br>
        <br>


        <h3>Lista raportow lekarskich</h3>
        <c:if test="${!empty listKsiegaRaportowLekarskich}">
            <table class="tg" style="width: 100%">
                <tr>
                    <th width=5%>Nr w księdze</th>
                    <th width=15%>Nazwa odddziału</th>
                    <th width=10%>Data wpisu</th>
                    <th width=15%>Nr PESEL pacjenta</th>
                    <th width=35%>Sprawozdanie</th>
                    <th width=20%>Imię, nazwisko oraz nr PWZ lekarza</th>


                </tr>
                <c:forEach items="${listKsiegaRaportowLekarskich}" var="ksiegaRaportowLekarskich">
                    <tr>
                        <td>${ksiegaRaportowLekarskich.nrWKsiedze}</td>
                        <td>${ksiegaRaportowLekarskich.nrKomOrg}</td>
                        <td>${ksiegaRaportowLekarskich.data}</td>
                        <td>${ksiegaRaportowLekarskich.pacjent}</td>
                        <td>${ksiegaRaportowLekarskich.sprawozdanie}</td>
                        <td>${ksiegaRaportowLekarskich.lekarz.tytulZawodowy} ${ksiegaRaportowLekarskich.lekarz.imie} ${ksiegaRaportowLekarskich.lekarz.nazwisko} ${ksiegaRaportowLekarskich.lekarz.nrPWZ}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>
