<%-- 
    Document   : pacjentDodaj
    Created on : 2019-12-16, 00:09:53
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
            <a href="pacjenci">Pacjent i jego dokumenty</a>
            <a href="<c:url value="logout" />" >Wyloguj sie</a>
        </div>
        <h3>
            Nie znaleziono pacjenta.<br>
            Należy dodać nowego pacjenta.
        </h3>
        <div class="errormessage">
            <c:if test="${not empty errMsg}">
                <h4 class="text-danger">${errMsg}</h4>
            </c:if>
        </div>
        <br>
        <div class='panelDP' style="width: 70%; height: 450px;">

            <form:form action="${addAction}"  commandName="pacjent">
                <table class="formula" style="padding-top: 20px; table-layout: fixed">


                    <tr>
                        <td>
                            <form:label path="pesel">
                                <spring:message text="PESEL: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="pesel" type="number"/>

                        </td> 
                    </tr>
                    <tr>
                        <td>
                            <form:label path="imie">
                                <spring:message text="Imię: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="imie" />
                        </td> 
                    </tr>
                    <tr>
                        <td>
                            <form:label path="drugieImie">
                                <spring:message text="Drugie imię: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="drugieImie" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="nazwisko">
                                <spring:message text="Nazwisko: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="nazwisko" />
                        </td> 
                    </tr>
                    <tr>
                        <td>
                            <form:label path="znakIdentyfikacyjny">
                                <spring:message text="Znak identyfikacyjny: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="znakIdentyfikacyjny" />
                        </td> 
                    </tr>
                    <tr>
                        <td>
                            <form:label path="dataUrodzenia">
                                <spring:message text="Data urodzenia: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="dataUrodzenia" id="datepicker7" type="text" autocomplete="off"/>
                        </td> 
                    </tr>
                    <tr>
                        <td>
                            <form:label path="adres">
                                <spring:message text="Adres"/>
                            </form:label>
                        </td>
                        <td>
                            <form:textarea style="height: 80px" path="adres" />
                        </td> 
                    </tr>
                    <tr>
                        <td>
                            <form:label path="plec">
                                <spring:message text="Płeć: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="plec" />
                        </td> 
                    </tr>

                    <tr>
                        <td>
                            <form:label path="danePrzedstawicielaUst">
                                <spring:message text="Dane przedstawiciela ustawowego: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:textarea style="height: 100px" path="danePrzedstawicielaUst" />
                        </td> 
                    </tr>
                    <tr>
                        <td></td>
                        <td>

                            <input type="submit"
                                   value="<spring:message text="Dodaj"/>" />
                        </td>
                    </tr>
                </table>
            </form:form>
        </div>
    </body>
