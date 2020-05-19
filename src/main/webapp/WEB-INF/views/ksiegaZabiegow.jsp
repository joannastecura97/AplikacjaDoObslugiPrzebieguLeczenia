<%-- 
    Document   : ksiegaZabiegow
    Created on : 2019-12-11, 00:42:21
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
        <title>Ksiega zabiegow</title>
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
            <a class="active "href="ksiegaZabiegow">Księga zabiegów</a>
            <a href="pacjenci">Pacjent i jego dokumenty</a>
            <a href="<c:url value="logout" />" >Wyloguj sie</a>
        </div>
        <h2>
            Księga Zabiegów
        </h2>
        <div class="errormessage">
            <c:if test="${not empty errMsg}">
                <h4 class="text-danger">${errMsg}</h4>
            </c:if>
        </div>
        <br>

        <div class="panel" id="panel1" style="width: 70%; height: 450px;">
            <form:form action="${addAction}" commandName="ksiegaZabiegow">
                <table class="formula">



                    <tr>
                        <td>
                            <form:label path="nrKomOrg">
                                <spring:message text="Nr resortowy komórki organizacyjnej: "/>
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
                            <form:label path="pacjentPESEL">
                                <spring:message text="Nr PESEL pacjenta: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="pacjentPESEL" />
                        </td> 
                    </tr>
                    <tr>
                        <td>
                            <form:label path="nrPWZlekarzZlec.nrPWZ">
                                <spring:message text="Nr PWZ lekarza zlecającego zabieg: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="nrPWZlekarzZlec.nrPWZ" />
                        </td> 
                    </tr>

                    <tr>
                        <td>
                            <form:label path="rodzajZabiegu">
                                <spring:message text="Rodzaj zabiegu: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:textarea style="height: 60px" path="rodzajZabiegu" />
                        </td> 
                    </tr>
                    <tr>
                        <td>
                            <form:label path="przebiegZabiegu">
                                <spring:message text="Przebieg zabiegu: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:textarea style="height: 180px" path="przebiegZabiegu" />
                        </td> 
                    </tr>
                    <tr>
                        <td>
                            <form:label path="nrPWZpracownikWyk.nrPWZ">
                                <spring:message text="Nr PWZ pracownika, który wykonał zabieg: "/>
                            </form:label>
                        </td>
                        <td>

                            <input value="${pracownik.nrPWZ}" readonly="true" disabled="true"/>
                            <form:input path="nrPWZpracownikWyk.nrPWZ" type="hidden" value="${pracownik.nrPWZ}"  readonly="true"/>

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
        <p class="flip" id="flip1" >Kliknij tutaj aby dodać nowy wpis do księgi zabiegów</p>
        <br>
        <br>
        <h3>Lista wpisów w księdze zabiegów</h3>
        <c:if test="${!empty listKsiegaZabiegow}">
            <table class="tg" style="width:100%">
                <tr>
                    <th width=5%>ID wpisu</th>
                    <th width=10%>Nazwa oddziału</th>
                    <th width=10%>Data</th>
                    <th width=10%>Nr PESEL pacjenta</th>
                    <th width=10%>Nr PWZ lekarza zlecającego zabieg</th>
                    <th width=15%>Rodzaj zabiegu</th>
                    <th width=30%>Przebieg zabiegu</th>
                    <th width=10%>Nr PWZ pracownika wykonującego zabieg</th>


                </tr>
                <c:forEach items="${listKsiegaZabiegow}" var="ksiegaZabiegow">
                    <tr>
                        <td>${ksiegaZabiegow.nrWKsiedze}</td>
                        <td>${ksiegaZabiegow.nrKomOrg}</td>
                        <td>${ksiegaZabiegow.data}</td>
                        <td>${ksiegaZabiegow.pacjentPESEL}</td>
                        <td>${ksiegaZabiegow.nrPWZlekarzZlec.tytulZawodowy} ${ksiegaZabiegow.nrPWZlekarzZlec.imie} ${ksiegaZabiegow.nrPWZlekarzZlec.nazwisko} ${ksiegaZabiegow.nrPWZlekarzZlec.tytulZawodowy}</td>
                        <td>${ksiegaZabiegow.rodzajZabiegu}</td>
                        <td>${ksiegaZabiegow.przebiegZabiegu}</td>
                        <td>${ksiegaZabiegow.nrPWZpracownikWyk.tytulZawodowy} ${ksiegaZabiegow.nrPWZpracownikWyk.imie} ${ksiegaZabiegow.nrPWZpracownikWyk.nazwisko} ${ksiegaZabiegow.nrPWZpracownikWyk.tytulZawodowy}</td>  
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>