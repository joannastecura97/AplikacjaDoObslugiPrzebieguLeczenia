<%-- 
    Document   : ksiegaChorychOddzialu
    Created on : 2019-12-10, 01:03:19
    Author     : stecu
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="pl">
    <head>
        <title>Ksiega chorych oddzialu</title>
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
            <a class="active" href="ksiegaChorychOddzialu">Ksiega chorych oddziałów</a>
            <a href="ksiegaPrzyjecWypisow">Księga przyjęć i wypisów</a>
            <a href="ksiegaRaportowLekarskich">Księga raportów lekarskich</a>
            <a href="ksiegaRaportowPielegniarskich">Księga raportów pielęgniarskich</a>
            <a href="ksiegaZabiegow">Księga zabiegów</a>
            <a href="pacjenci">Pacjent i jego dokumenty</a>
            <a href="<c:url value="logout" />" >Wyloguj sie</a>
        </div>

        <h2>
            Księga Chorych Oddziału
        </h2>


        <div class="errormessage">
            <c:if test="${not empty errMsg}">
                <h4 class="text-danger">${errMsg}</h4>
            </c:if>
        </div>
        <br>
        <div class="panel" id="panel1">



            <form:form action="${addAction}" commandName="ksiegaChorychOddzialu">


                <table class="formula">

                    <tr>
                        <td>
                            <form:label path="nrKomOrg">
                                <spring:message text="Numer komórki organizacyjnej: "/>
                            </form:label>
                        </td>
                        <td>

                            <form:select name="nazwa" path="nrKomOrg">
                        <option>001</option>
                        <option>002</option>
                        </td>

                    </form:select>
                    </form>
                    </td> 
                    </tr>


                    <tr>
                        <td>
                            <form:label path="pesel">
                                <spring:message text="PESEL pacjenta: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="pesel" />
                        </td> 
                    </tr>

                    <tr>
                        <td>
                            <form:label path="nrKsiegaPrzyjec">
                                <spring:message text="Nr w księdze przyjęć i wypisów: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="nrKsiegaPrzyjec" type="number"/>
                        </td> 
                    </tr>

                    <tr>
                        <td>
                            <form:label path="lekarzProw.nrPWZ">
                                <spring:message text="Nr PWZ lekarza prowadzącego: "/>
                            </form:label>
                        </td>
                        <td>
                            <input value="${pracownik.nrPWZ}" readonly="true" disabled="true"/>
                            <form:input path="lekarzProw.nrPWZ" type="hidden" value="${pracownik.nrPWZ}"  readonly="true"/>
                        </td> 
                    </tr>

                    <tr><td></td>
                        <td colspan="2" style="text-align: left">
                            <br>
                            <input type="submit"
                                   value="<spring:message text="Dodaj"/>" />
                        </td>
                    </tr>
                </table>	
            </form:form>
        </div>

        <br>
        <p class="flip" id="flip1">Kliknij tutaj aby dodać nowy wpis do księgi chorych oddziału</p>
        <br>
        <br>

        <br>

        <h3>Lista wpisów w księdze chorych oddziału</h3>
        <c:if test="${!empty listKsiegaChorychOddzialu}">
            <table class="tg">
                <tr>
                    <th width=10% >Nr w księdze</th>
                    <th width=25% >Nazwa oddziału</th>
                    <th width=25% >PESEL pacjenta</th>
                    <th width=10% >Nr w księdze przyjęć</th>
                    <th width=25% >Imię, nazwisko oraz nr PWZ lekarza prowadzącego</th>


                </tr>
                <c:forEach items="${listKsiegaChorychOddzialu}" var="ksiegaChorychOddzialu">
                    <tr>
                        <td>${ksiegaChorychOddzialu.nrWKsiedze}</td>
                        <td>${ksiegaChorychOddzialu.nrKomOrg}</td>
                        <td>${ksiegaChorychOddzialu.pesel}</td>
                        <td>${ksiegaChorychOddzialu.nrKsiegaPrzyjec}</td>
                        <td>${ksiegaChorychOddzialu.lekarzProw.tytulZawodowy} ${ksiegaChorychOddzialu.lekarzProw.imie} ${ksiegaChorychOddzialu.lekarzProw.nazwisko} ${ksiegaChorychOddzialu.lekarzProw.nrPWZ}</td>

                    </tr>
                </c:forEach>
            </table>
        </c:if>


    </body>
</html>
