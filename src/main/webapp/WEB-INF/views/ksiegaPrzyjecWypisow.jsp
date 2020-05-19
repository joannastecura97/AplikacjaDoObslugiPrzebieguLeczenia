<%-- 
    Document   : ksiegaPrzyjecWypisow
    Created on : 2019-12-09, 23:14:23
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
        <title>Ksiega przyjec i wypisow</title>
        <script type="text/javascript"
        src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <meta charset="utf-8">
        <script type="text/javascript"
        src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
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
            <a class="active" href="ksiegaPrzyjecWypisow">Księga przyjęć i wypisów</a>
            <a href="ksiegaRaportowLekarskich">Księga raportów lekarskich</a>
            <a href="ksiegaRaportowPielegniarskich">Księga raportów pielęgniarskich</a>
            <a href="ksiegaZabiegow">Księga zabiegów</a>
            <a href="pacjenci">Pacjent i jego dokumenty</a>
            <a href="<c:url value="logout" />" >Wyloguj sie</a>
        </div>
        <h2>
            Ksiega Przyjęć i Wypisów
        </h2>
        <div class="errormessage">
            <c:if test="${not empty errMsg}">
                <h4 class="text-danger">${errMsg}</h4>
            </c:if>
        </div>
        <br>
        <div class="panel" id="panel1" style="width: 50%">
            <form:form action="${addAction}" commandName="ksiegaPrzyjecWypisow">
                <table class="formula">

                    <tr>
                        <td>
                            <form:label path="pesel">
                                <spring:message text="Nr PESEL pacjenta: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="pesel" />
                        </td> 
                    </tr>


                    <tr>
                        <td>
                            <form:label path="nrWpisu">
                                <spring:message text="Nr identyfikacyjny wpisu do szpitala: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="nrWpisu" type="number" />
                        </td> 
                    </tr>

                    <tr>
                        <td>
                            <form:label path="nrResortowyKom">
                                <spring:message text="Nr resortowy komórki organizacyjnej: "/>
                            </form:label>
                        </td>
                        <td>

                            <form:select name="nazwa" path="nrResortowyKom">
                        <option>001</option>
                        <option>002</option>
                    </form:select>
                    </td> 
                    </tr>

                    <tr>
                        <td>
                            <form:label path="nrWypisu">
                                <spring:message text="Nr identyfikacyjny wypisu ze szpitala: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="nrWypisu" type="number"/>
                        </td> 
                    </tr>

                    <tr >
                        <td>
                            <form:label path="rozpOnkologiczne" >
                                <spring:message text="Rozpoznanie onkologiczne: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:textarea style="height: 100px" path="rozpOnkologiczne" />
                        </td> 
                    </tr>

                    <tr>
                        <td>
                            <form:label path="miejsceGdzieZostalWypisany">
                                <spring:message text="Miejsce gdzie został wypisany: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:textarea style="height: 50px" path="miejsceGdzieZostalWypisany" />
                        </td> 
                    </tr>

                    <tr>
                        <td>
                            <form:label path="transportSanitarny">
                                <spring:message text="Transport sanitarny: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:textarea style="height: 50px" path="transportSanitarny" />
                        </td> 
                    </tr>

                    <tr>
                        <td>
                            <form:label path="okolicznosciTr">
                                <spring:message text="Okoliczności transportu: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:textarea style="height: 100px" path="okolicznosciTr" />
                        </td> 
                    </tr>
                    <tr>
                        <td>
                            <form:label path="pobranieOplat">
                                <spring:message text="Pobranie opłat: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:textarea style="height: 50px" path="pobranieOplat" />
                        </td> 
                    </tr>
                    <tr>
                        <td>
                            <form:label path="nrPwzLekarz.nrPWZ">
                                <spring:message text="Nr PWZ lekarza: "/>
                            </form:label>
                        </td>
                        <td>
                            <input value="${pracownik.nrPWZ}" readonly="true" disabled="true"/>
                            <form:input path="nrPwzLekarz.nrPWZ" type="hidden" value="${pracownik.nrPWZ}"  readonly="true"/>

                        </td> 
                    </tr>
                    <tr>
                        <td>
                            <form:label path="nrKartyDepozytowej">
                                <spring:message text="Nr karty depozytowej: "/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="nrKartyDepozytowej" />
                        </td> 
                    </tr>


                    <tr><td></td>
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
        <p class="flip" id="flip1">Kliknij tutaj aby dodać nowy wpis do księgi przyjęć i wypisów</p>

        <br>
        <br>
        <h3>Lista wpisów w księdze przyjęć i wypisów</h3>
        <c:if test="${!empty listKsiegaPrzyjecWypisow}">
            <table class="tg" style="width: 100%">
                <tr>
                    <th width=5%>Nr w księdze</th>
                    <th width=10%>PESEL pacjenta</th>
                    <th width=10%>Nr wpisu</th>
                    <th width=10%>nr resortowy komórki organizacyjnej</th>
                    <th width=10%>Nr wypisu</th>
                    <th width=10%>Rozpoznanie onkologiczne</th>
                    <th width=10%>Miejsce gdzie zostal wypisany</th>
                    <th width=10%>Transport sanitarny</th>
                    <th width=10%>Okolocznosci transportu</th>
                    <th width=10%>Pobranie oplat</th>
                    <th width=10%>Imię, nazwisko oraz nr PWZ lekarza</th>
                    <th width=10%>Nr karty depozytowej</th>


                </tr>
                <c:forEach items="${listKsiegaPrzyjecWypisow}" var="ksiegaPrzyjecWypisow">
                    <tr>
                        <td>${ksiegaPrzyjecWypisow.nrWKsiedze}</td>
                        <td>${ksiegaPrzyjecWypisow.pesel}</td>
                        <td>${ksiegaPrzyjecWypisow.nrWpisu}</td>
                        <td>${ksiegaPrzyjecWypisow.nrResortowyKom}</td>
                        <td>${ksiegaPrzyjecWypisow.nrWypisu}</td>
                        <td>${ksiegaPrzyjecWypisow.rozpOnkologiczne}</td>
                        <td>${ksiegaPrzyjecWypisow.miejsceGdzieZostalWypisany}</td>
                        <td>${ksiegaPrzyjecWypisow.transportSanitarny}</td>
                        <td>${ksiegaPrzyjecWypisow.okolicznosciTr}</td>
                        <td>${ksiegaPrzyjecWypisow.pobranieOplat}</td>
                        <td>${ksiegaPrzyjecWypisow.nrPwzLekarz.tytulZawodowy} ${ksiegaPrzyjecWypisow.nrPwzLekarz.imie} ${ksiegaPrzyjecWypisow.nrPwzLekarz.nazwisko} ${ksiegaPrzyjecWypisow.nrPwzLekarz.nrPWZ}</td>
                        <td>${ksiegaPrzyjecWypisow.nrKartyDepozytowej}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>
