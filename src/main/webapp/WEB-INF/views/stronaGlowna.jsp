<%-- 
    Document   : stronaGlowna
    Created on : 2019-12-14, 15:55:16
    Author     : stecu
--%>

<%@ page language="java" session="true" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="pl">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Strona główna</title>
        <script type="text/javascript"
        src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>


        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script type="text/javascript" src="<c:url value="/resources/functions.js" />"></script>

        <link href="<c:url value="/resources/styleStronaGlowna.css" />" rel="stylesheet">



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

            <a class="active" href="stronaGlowna">Kalendarz</a>
            <a href="ksiegaChorychOddzialu">Ksiega chorych oddziałów</a>
            <a href="ksiegaPrzyjecWypisow">Księga przyjęć i wypisów</a>
            <a href="ksiegaRaportowLekarskich">Księga raportów lekarskich</a>
            <a href="ksiegaRaportowPielegniarskich">Księga raportów pielęgniarskich</a>
            <a href="ksiegaZabiegow">Księga zabiegów</a>
            <a href="pacjenci">Pacjent i jego dokumenty</a>
            <a href="<c:url value="logout" />" >Wyloguj sie</a>
        </div>
        <div class="errormessage">
            <c:if test="${not empty errMsg}">
                <h4 class="text-danger">${errMsg}</h4>
            </c:if>
        </div>
        <h3>Dodaj zadanie: </h3>
        <form:form method="POST" action="stronaGlowna" commandName="dzialanie">
            <table class="formula">

                <tr>
                    <td>
                        <form:label path="data" >
                            <spring:message text="Data i godzina zaplanowanego zadania: "/>
                        </form:label>
                    </td>
                    <td>

                        <input type="text" id="datepicker" autocomplete="off"/>
                        <input type="time" id="timepicker" />
                        <form:input path="data" type="hidden" id="dg"  readonly="true"/>


                    </td>
                </tr>


                <tr>
                    <td>
                        <form:label path="opis">
                            <spring:message text="Opis: "/>
                        </form:label>
                    </td>
                    <td>

                        <form:textarea path="opis" id="op"  autocomplete="off"/>
                    </td> 
                </tr>



                <tr><td></td>
                    <td colspan="2">

                        <input style="text-align: left" type="submit" id="button"
                               value="<spring:message text="Dodaj"/>" />
                    </td>
                </tr>
            </table>	
        </form:form>
        <form:form method="POST" action="stronaGlowna/dataDzialanie" commandName="dataForm">
            <div class="dateHolder">
                <h3>Zadania na dzień: </h3>
                <input id="datepicker2" type="text" autocomplete="off"/>
                <form:input path="data" type="hidden" id="d"  readonly="true"  />
                <input type="submit" id="button2"
                       value="<spring:message text="Szukaj"/>"
                       />
            </div>

        </form:form>


        <c:if test="${!empty listDzialanie}">
            <h3>Lista działań <fmt:formatDate value="${dataForm.data}" pattern="yyyy-MM-dd" />:</h3>
            <table class="tg">
                <tr>

                    <th width=25%>Data i godzina</th>
                    <th width=65%>Opis</th>
                </tr>
                <c:forEach items="${listDzialanie}" var="dzialanie">
                    <form:form action='stronaGlowna/removeDzialanie' method="POST" commandName="dzialanie">
                        <tr>
                            <form:input path="data" type="hidden" value="${dzialanie.data}" />
                            <td><fmt:formatDate value="${dzialanie.data}" pattern="yyyy-MM-dd HH:mm" /></td>
                            <form:input path="opis" type="hidden" value="${dzialanie.opis}" />
                            <td>${dzialanie.opis}</td>
                            <td style="background-color: #f2f2f2"><input type=submit value=<spring:message text="Usuń"/> />" ></td>
                        </tr>
                    </form:form>
                </c:forEach>

            </table>
        </c:if>





    </body>



</html>
