<%--
    Document   : dokumentyPacjenta
    Created on : 2019-12-16, 02:20:38
    Author     : stecu
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>


<html lang="pl-PL">
    <head>
        <title>Dokumenty pacjentów</title>
        <meta charset="utf-8">
        <script type="text/javascript"
        src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script type="text/javascript" src="<c:url value="/resources/functions.js" />"></script>
        <link href="<c:url value="/resources/style.css" />" rel="stylesheet" type="text/css">

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
    </div>
    <h2>
        Pacjent i jego dokumenty
    </h2>
    <table class="tg" style="width: 100%">
        <tr>
            <th width=10%>Pesel</th>
            <th width=8%>Imię</th>
            <th width=8%>Drugie imię</th>
            <th width=10%>Nazwisko</th>
            <th width=10%>Znak Identyfikacyjny</th>
            <th width=10%>Data urodzenia</th>
            <th width=18%>Adres</th>
            <th width=8%">Płeć</th>
            <th width="18%">Dane przedstawiciela ustawowego</th>
        </tr>
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
    </table>
    <div class="errormessage">
        <c:if test="${not empty errMsg}">
            <h4 class="text-danger">${errMsg}</h4>
        </c:if>
    </div>
    <br>
    <br>
    <table class="title">
        <tr><td><h3>Historie choroby pacjenta</h3></td></tr>
    </table>
    <br>

    <br>
    <div class="panel" id="panel1" style="width: 70%; height: 80px;">

        <form:form action="dokumentyPacjenta/historiaChoroby/add" method="POST" commandName="historiaChoroby">
            <table class="formula">

                <tr>
                    <td>
                        <form:label path="pacjent">
                            <spring:message text="Nr PESEL pacjenta: "/>
                        </form:label>
                    </td>
                    <td>

                        <input value="${pacjent.pesel}" readonly="true" disabled="true"/>
                        <form:input path="pacjent" type="hidden" value="${pacjent.pesel}"  readonly="true"/>
                    </td> 
                </tr>

                <tr><td></td>
                    <td colspan="2">
                        <input type="submit"
                               value="<spring:message text="Dodaj"/>" />
                    </td>
                </tr>
            </table>	
        </form:form>
    </div>
    <br>
    <p class="flip" id="flip1">Kliknij tutaj aby założyć nową historię choroby</p>

    <br>
    <br>
    <br>
    <c:if test="${!empty listHistoriaChorob}">
        <table class="tg" style="width:30%">
            <tr>
                <th width="80">Id</th>
            </tr>
            <c:forEach items="${listHistoriaChorob}" var="historiaChoroby">
                <tr>
                    <td>${historiaChoroby.nr}</td>
                </tr>
            </c:forEach>
        </table>

    </c:if>
    <br>
    <br><table class="title">
        <tr><td><h3>Wpisy do szpitala</h3></td></tr>
    </table>

    <br>
    <br>
    <c:url var="addAction" value="dokumentyPacjenta/wpisDoSzpitala/add" ></c:url>
        <div class="panel" id="panel2" style="width: 70%; height: 400px;">
        <form:form action="${addAction}" commandName="wpisDoSzpitala">
            <table class="formula">

                <tr>
                    <td>
                        <form:label path="historiaChoroby">
                            <spring:message text="Nr historii choroby: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="historiaChoroby" />
                    </td>
                </tr>


                <tr>
                    <td>
                        <form:label path="trybPrzyjecia">
                            <spring:message text="Tryb przyjęcia: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="trybPrzyjecia" />
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="dataPrzyjecia">
                            <spring:message text="Data i godzina przyjęcia: "/>
                        </form:label>
                    </td>
                    <td>
                        <input type="text" id="datepicker1" autocomplete="off"/>
                        <input type="time" id="timepicker1" />
                        <form:input path="dataPrzyjecia" type="hidden" id="dg1"  readonly="true"/>
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="rozpPrzezLekKier">
                            <spring:message text="Rozpoznanie przez lekarza kierującego: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:textarea style="height: 100px" path="rozpPrzezLekKier" />
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="rozpPrzezLekPrzyjm">
                            <spring:message text="Rozpoznanie przez lekarza przyjmującego: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:textarea style="height: 100px" path="rozpPrzezLekPrzyjm" />
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="lekarzKier.nrPWZ">
                            <spring:message text="Nr PWZ lekarza kierującego: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="lekarzKier.nrPWZ" />
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="lekarzPrzyjm.nrPWZ">
                            <spring:message text="Nr PWZ lekarza przyjmującego: "/>
                        </form:label>
                    </td>
                    <td>
                        <input value="${pracownik.nrPWZ}" readonly="true" disabled="true"/>
                        <form:input path="lekarzPrzyjm.nrPWZ" type="hidden" value="${pracownik.nrPWZ}"  readonly="true"/>
                    </td>
                </tr>



                <tr><td></td>
                    <td colspan="2">
                        <input type="submit" id="button3"
                               value="<spring:message text="Dodaj"/>" />
                    </td>
                </tr>
            </table>
        </form:form>
    </div>
    <br>
    <p class="flip" id="flip2" >Kliknij tutaj aby dodać nowy wpis do szpitala</p>

    <br>
    <br>
    <c:if test="${!empty listWpisyDoSzpitala}">
        <table class="tg" style="width:100%">
            <tr>
                <th width=5%>Nr wpisu</th>
                <th width=10%>Tryb przyjęcia</th>
                <th width=15%>Data przyjęcia</th>
                <th width=21%>Rozpoznanie przez lekarza przyjmującego</th>
                <th width=20%>Rozpoznanie przez lekarza kierującego</th>
                <th width=12%>Imię, nazwisko oraz nr PWZ lekarza przyjmującego</th>
                <th width=12%>Imię, nazwisko oraz nr PWZ lekarza kierującego</th>
                <th width=5%>Nr historii choroby</th>
            </tr>
            <c:forEach items="${listWpisyDoSzpitala}" var="wpisDoSzpitala">
                <tr>
                    <td>${wpisDoSzpitala.nr}</td>
                    <td>${wpisDoSzpitala.trybPrzyjecia}</td>
                    <td>${wpisDoSzpitala.dataPrzyjecia}</td>
                    <td>${wpisDoSzpitala.rozpPrzezLekKier}</td>
                    <td>${wpisDoSzpitala.rozpPrzezLekPrzyjm}</td>
                    <td>${wpisDoSzpitala.lekarzPrzyjm.tytulZawodowy} ${wpisDoSzpitala.lekarzPrzyjm.imie} ${wpisDoSzpitala.lekarzPrzyjm.nazwisko}, ${wpisDoSzpitala.lekarzPrzyjm.nrPWZ}</td>
                    <td>${wpisDoSzpitala.lekarzKier.tytulZawodowy} ${wpisDoSzpitala.lekarzKier.imie} ${wpisDoSzpitala.lekarzKier.nazwisko}, ${wpisDoSzpitala.lekarzKier.nrPWZ}</td>
                    <td>${wpisDoSzpitala.historiaChoroby}</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>

    <br>
    <br>
    <table class="title">
        <tr><td><h3>Opisy przebiegu hospitalizacji</h3></td></tr>
    </table>
    <br>

    <c:url var="addAction" value="dokumentyPacjenta/przebiegHospitalizacji/add" ></c:url>
        <div class="panel" id="panel3" style="width: 70%; height: 350px;">
        <form:form action="${addAction}" commandName="przebiegHospitalizacji">
            <table class="formula">


                <tr>
                    <td>
                        <form:label path="historiaChoroby">
                            <spring:message text="Nr historii choroby: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="historiaChoroby" />
                    </td>
                </tr>


                <tr>
                    <td>
                        <form:label path="data">
                            <spring:message text="Data wpisu: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="data" id="datepicker" type="text" autocomplete="off"/>
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="przebiegChoroby">
                            <spring:message text="Przebieg choroby: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:textarea style="height: 100px" path="przebiegChoroby" />
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="leczenie">
                            <spring:message text="Leczenie: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:textarea style="height: 100px"  path="leczenie" />
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="lekarz.nrPWZ">
                            <spring:message text="Nr PWZ lekarza dokonującego wpisu: "/>
                        </form:label>
                    </td>
                    <td>
                        <input value="${pracownik.nrPWZ}" readonly="true" disabled="true"/>
                        <form:input path="lekarz.nrPWZ" type="hidden" value="${pracownik.nrPWZ}"  readonly="true"/>
                    </td>
                </tr>



                <tr><td></td>
                    <td>
                        <input type="submit"
                               value="<spring:message text="Dodaj"/>" />
                    </td>
                </tr>
            </table>
        </form:form>
        </div>
    <br>
    <p class="flip" id="flip3">Kliknij tutaj aby dodać nowy przebieg hospitalizacji do historii choroby</p>

    <br>
    <br>
    <c:if test="${!empty listPrzebiegHospitalizacji}">
        <table class="tg" style="width:100%">
            <tr>
                <th width=8%>Nr historii choroby</th>
                <th width=15%>Data wpisu</th>
                <th width=30%>Przebieg choroby</th>
                <th width=25%>Leczenie</th>
                <th width=17%>Lekarz</th>


            </tr>
            <c:forEach items="${listPrzebiegHospitalizacji}" var="przebiegHospitalizacji">
                <tr>
                    <td>${przebiegHospitalizacji.historiaChoroby}</td>
                    <td>${przebiegHospitalizacji.data}</td>
                    <td>${przebiegHospitalizacji.przebiegChoroby}</td>
                    <td>${przebiegHospitalizacji.leczenie}</td>
                    <td>${przebiegHospitalizacji.lekarz.tytulZawodowy} ${przebiegHospitalizacji.lekarz.imie} ${przebiegHospitalizacji.lekarz.nazwisko}, ${przebiegHospitalizacji.lekarz.nrPWZ}</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <br>
    <br><table class="title">
        <tr><td><h3>Wypisy ze szpitala</h3></td></tr>
    </table>

    <br>
    <c:url var="addAction" value="dokumentyPacjenta/wypisZeSzpitala/add" ></c:url>
        <div class="panel" id="panel4" style="width: 80%; height: 1550px;">
        <form:form action="${addAction}" commandName="wypisZeSzpitala">
            <table class="formula" style="table-layout: fixed;">

                <c:if test="${!empty wypisZeSzpitala.rozpoznanieKliniczne}">
                    <tr>
                        <td>
                            <form:label path="nr">
                                <spring:message text="ID"/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="nr" />
                        </td>
                    </tr>
                </c:if>

                <tr>
                    <td>
                        <form:label path="historiaChoroby">
                            <spring:message text="Nr historii choroby: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="historiaChoroby" />
                    </td>
                </tr>


                <tr>
                    <td>
                        <form:label path="rozpoznanieKliniczne">
                            <spring:message text="Rozpoznanie kliniczne: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:textarea style="height: 150px" path="rozpoznanieKliniczne" />
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="nrStatZasadnicze">
                            <spring:message text="Nr statystyczny choroby zasadniczej: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="nrStatZasadnicze" />
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="nrStatWspolistniejace">
                            <spring:message text="Nr statystyczny choroby współistniejącej: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="nrStatWspolistniejace" />
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="opisZastLeczenia">
                            <spring:message text="Opis zastosowanego leczenia: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:textarea style="height: 150px"  path="opisZastLeczenia" />
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="epikryza">
                            <spring:message text="Epikryza: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:textarea style="height: 200px" path="epikryza" />
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="przyczynaWypisu">
                            <spring:message text="Okoliczności i przyczyny wypisu: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:textarea style="height: 150px" path="przyczynaWypisu" />
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="dataWypisu">
                            <spring:message text="Data wypisu: "/>
                        </form:label>
                    </td>
                    <td>

                        <form:input path="dataWypisu" type="text" id="datepicker2" autocomplete="off" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="lekarzWyp.nrPWZ">
                            <spring:message text="Nr PWZ lekarza wypisującego: "/>
                        </form:label>
                    </td>
                    <td>
                        <input value="${pracownik.nrPWZ}" readonly="true" disabled="true"/>
                        <form:input path="lekarzWyp.nrPWZ" type="hidden" value="${pracownik.nrPWZ}"  readonly="true"/>

                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="dataZgonu">
                            <spring:message text="Data zgonu: " />
                        </form:label>
                    </td>
                    <td>
                        <input type="text" id="datepicker3" autocomplete="off" />
                        <input type="time" id="timepicker3" />
                        <form:input path="dataZgonu" type="hidden" id="dg3"  readonly="true"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="przyczynaZgonu">
                            <spring:message text="Przyczyna zgonu: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:textarea style="height: 150px" path="przyczynaZgonu" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="nrStatChorZgon">
                            <spring:message text="Nr statystyczny choroby, która spowodowała zgon: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="nrStatChorZgon" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="protokolKom">
                            <spring:message text="Protokół komisji stwierdzającej śmierć mózgową, jeżeli miała miejsce: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:textarea style="height: 150px" path="protokolKom" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="sekcjaZwlok">
                            <spring:message text="Adnotacja o wykonaniu/niewykonaniu sekcji zwłok: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:textarea style="height: 150px" path="sekcjaZwlok" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="dawca">
                            <spring:message text="Adnotacja o pobieraniu ze zwłok komórek, tkanek, narządów: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:textarea style="height: 150px" path="dawca" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="lekarzZg.nrPWZ">
                            <spring:message text="Nr PWZ lekarza, który stwierdził zgon: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="lekarzZg.nrPWZ" />
                    </td>
                </tr>



                <tr><td></td>
                    <td>
                        <input type="submit" id="button4"
                               value="<spring:message text="Dodaj"/>" />
                    </td>
                </tr>
            </table>
        </form:form>
    </div>
    <br>
    <p class="flip" id="flip4" >Kliknij tutaj aby dodać nowy wypis ze szpitala</p>

    <br>
    <br>

    <c:if test="${!empty listWypisyZeSzpitala}">
        <table class="tg" style="width: 100%">
            <tr>
                <th width=10%>Nr wypisu</th>
                <th width=10%>Nr historii choroby</th>
                <th width=28%>Rozpoznanie kliniczne</th>
                <th width=10%>Nr statystyczne chorob zasadniczych</th>
                <th width=10%>Nr statystyczne chorób współistniejących</th>
                <th width=10%>Data wypisu</th>
                <th width=12%>Nr PWZ lekarza dokonujacego wypisu</th>


            </tr>
            <c:forEach items="${listWypisyZeSzpitala}" var="wypisZeSzpitala">
                <tr>
                    <td>${wypisZeSzpitala.nr}</td>
                    <td>${wypisZeSzpitala.historiaChoroby}</td>
                    <td>${wypisZeSzpitala.rozpoznanieKliniczne}</td>
                    <td>${wypisZeSzpitala.nrStatZasadnicze}</td>
                    <td>${wypisZeSzpitala.nrStatWspolistniejace}</td>
                    <td>${wypisZeSzpitala.dataWypisu}</td>
                    <td>${wypisZeSzpitala.lekarzWyp.tytulZawodowy} ${wypisZeSzpitala.lekarzWyp.imie} ${wypisZeSzpitala.lekarzWyp.nazwisko}, ${wypisZeSzpitala.lekarzWyp.nrPWZ}</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <br>
    <br><table class="title">
        <tr><td><h3>Osoby upoważnione do wglądu w dokumentację medyczną pacjenta</h3></td></tr>
    </table>

    <br>
    <br>

    <c:url var="addAction" value="dokumentyPacjenta/osobaUpowazniona/add" ></c:url>
        <div class="panel" id ="panel5" style="width: 70%; height: 250px;">
        <form:form action="${addAction}" commandName="osobaUpowazniona">
            <table class="formula">

                <tr>
                    <td>
                        <form:label path="historiaChoroby">
                            <spring:message text="Nr historii choroby: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="historiaChoroby" />
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
                        <form:label path="adres">
                            <spring:message text="Adres: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:textarea style="height: 50px; width: 60%" path="adres" />
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="nrTelefonu">
                            <spring:message text="Numer telefonu: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="nrTelefonu" />
                    </td>
                </tr>



                <tr> <td> </td>
                    <td colspan="2">

                        <input type="submit"
                               value="<spring:message text="Dodaj"/>" />

                    </td>
                </tr>
            </table>
        </form:form>
        </div>
    <br>
    <p class="flip" id ="flip5">Kliknij tutaj aby dodać nową osobę upoważnioną do wglądu w dokumentację medyczną pacjenta</p>

    <br>
    <br>
    <c:if test="${!empty listOsobaUpowazniona}">
        <table class="tg" style="width:90%">
            <tr>
                <th width=10%>Nr historii choroby</th>
                <th width=15%>Imię</th>
                <th width=15%>Nazwisko</th>
                <th width=30%>Adres</th>
                <th width=15%>Nr telefonu</th>
            </tr>
            <c:forEach items="${listOsobaUpowazniona}" var="osobaUpowazniona">
                <tr>
                    <td>${osobaUpowazniona.historiaChoroby}</td>
                    <td>${osobaUpowazniona.imie}</td>
                    <td>${osobaUpowazniona.nazwisko}</td>
                    <td>${osobaUpowazniona.adres}</td>
                    <td>${osobaUpowazniona.nrTelefonu}</td>
                    <td><a style="text-decoration: none; color: white" href="<c:url value='dokumentyPacjenta/removeOsobaUpowazniona/${osobaUpowazniona.nrTelefonu}' />" >Usuń</a></td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <br>
    <br><table class="title">
        <tr><td><h3>Wywiady pielęgniarskie</h3></td></tr>
    </table>

    <br>
    <br>
    <c:if test="${!empty listWywiadPielegniarski}">
        <table class="tg">
            <tr>
                <th width=15%>Nr historii choroby</th>
                <th width=30%>Nazwa oddziału</th>
                <th width=40%>Nr PWZ pielegniarki przyprowadzającej wywiad</th>


            </tr>
            <c:forEach items="${listWywiadPielegniarski}" var="wywiadPielegniarski">
                <tr>
                    <td>${wywiadPielegniarski.historiaChoroby}</td>
                    <td>${wywiadPielegniarski.nazwaKomOrg}</td>
                    <td>${wywiadPielegniarski.pelegniarka.tytulZawodowy} ${wywiadPielegniarski.pelegniarka.imie} ${wywiadPielegniarski.pelegniarka.nazwisko}, ${wywiadPielegniarski.pelegniarka.nrPWZ}</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <br>
    <br><table class="title">
        <tr><td><h3>Karty informacyjne z leczenia szpitalnego</h3></td></tr>
    </table>

    <br>
    <br>
    <c:url var="addAction" value="dokumentyPacjenta/kartaInformacyjna/add" ></c:url>
        <div class="panel" id="panel6" style="width: 80%; height: 1150px;">
        <form:form action="${addAction}" commandName="kartaInformacyjna">
            <table class="formula" style="table-layout: fixed;">


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
                        <form:label path="pacjent">
                            <spring:message text="Nr PESEL pacjenta: "/>
                        </form:label>
                    </td>
                    <td>
                        <input value="${pacjent.pesel}" readonly="true" disabled="true"/>
                        <form:input path="pacjent" type="hidden" value="${pacjent.pesel}"  readonly="true"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="nrPwzLekarz.nrPWZ">
                            <spring:message text="Nr PWZ lekarza wydającego kartę informacyjną: "/>
                        </form:label>
                    </td>
                    <td>
                        <input value="${pracownik.nrPWZ}" readonly="true" disabled="true"/>
                        <form:input path="nrPwzLekarz.nrPWZ" type="hidden" value="${pracownik.nrPWZ}"  readonly="true"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="dataWydania">
                            <spring:message text="Data wydania: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="dataWydania" type="text" id="datepicker4" autocomplete="off" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="rozpoznania">
                            <spring:message text="Rozpoznania: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:textarea style="height: 150px" path="rozpoznania" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="wynikiBadan">
                            <spring:message text="Wyniki badań: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:textarea style="height: 150px" path="wynikiBadan" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="leczenie">
                            <spring:message text="Leczenie: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:textarea style="height: 150px" path="leczenie" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="epikryza">
                            <spring:message text="Epikryza: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:textarea style="height: 200px" path="epikryza" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="zalecenia">
                            <spring:message text="Zalecenia: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:textarea style="height: 150px" path="zalecenia" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="okresNiezdolnosci">
                            <spring:message text="Okres niezdolności: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:textarea style="height: 50px" path="okresNiezdolnosci" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="leki">
                            <spring:message text="Lekarstwa: "/>
                        </form:label>
                    </td>
                    <td>
                        <form:textarea style="height: 100px" path="leki" />
                    </td>
                </tr>

                <tr><td></td>
                    <td>

                        <input type="submit"
                               value="<spring:message text="Dodaj"/>" />

                    </td>
                </tr>
            </table>
        </form:form>
    </div>
    <br>
    <p class="flip" id="flip6">Kliknij tutaj aby dodać nową kartę informacyjną z leczenia szpitalnego</p>

    <br>
    <br>
    <c:if test="${!empty listKartaInformacyjna}">
        <table class="tg" style="width: 80%">
            <tr>
                <th width=17%>Nazwa oddziału</th>
                <th width=18%>Data wydania</th>
                <th width=35%>Rozpoznania</th>
                <th width=20%>Imię, nazwisko i nr PWZ lekarza</th>


            </tr>
            <c:forEach items="${listKartaInformacyjna}" var="kartaInformacyjna">
                <tr>
                    <td>${kartaInformacyjna.nrKomOrg}</td>
                    <td>${kartaInformacyjna.dataWydania}</td>
                    <td>${kartaInformacyjna.rozpoznania}</td>
                    <td>${kartaInformacyjna.nrPwzLekarz.tytulZawodowy} ${kartaInformacyjna.nrPwzLekarz.imie} ${kartaInformacyjna.nrPwzLekarz.nazwisko} ${kartaInformacyjna.nrPwzLekarz.nrPWZ}</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <br>
    <br><table class="title" >
        <tr><td><h3>Raporty pielęgniarskie</h3></td></tr>
    </table>

    <br>
    <br>
    <c:if test="${!empty listRaportPielegniarski}">
        <table class="tg" style="width: 80%">
            <tr>
                <th width="120">Nazwa oddziału</th>
                <th width="120">Data</th>
                <th width=20%>Imię, nazwisko i nr PWZ pielęgniarki</th>


            </tr>
            <c:forEach items="${listRaportPielegniarski}" var="raportPielegniarski">
                <tr>
                    <td>${raportPielegniarski.nazwaKomOrg}</td>
                    <td>${raportPielegniarski.data}</td>
                    <td>${raportPielegniarski.pelegniarka.tytulZawodowy} ${raportPielegniarski.pelegniarka.imie} ${raportPielegniarski.pelegniarka.nazwisko}, ${raportPielegniarski.pelegniarka.nrPWZ}</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <br>
    <br><table class="title">
        <tr><td><h3>Raporty lekarskie</h3></td></tr>
    </table>

    <br>
    <br>
    <c:url var="addAction" value="dokumentyPacjenta/ksiegaRaportowLekarskich/add" ></c:url>
        <div class="panel" id="panel7" style="width: 70%; height: 320px;">
        <form:form action="${addAction}" commandName="ksiegaRaportowLekarskich">
            <table class="formula">

                <c:if test="${!empty ksiegaRaportowLekarskich.pacjent}">
                    <tr>
                        <td>
                            <form:label path="nrWKsiedze">
                                <spring:message text="ID"/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="nrWKsiedze" readonly="true" size="8"  disabled="true" />
                            <form:hidden path="nrWKsiedze" />
                        </td>
                    </tr>
                </c:if>

                <tr>
                    <td>
                        <form:label path="nrKomOrg">
                            <spring:message text="Nr komórki organizacyjnej: "/>
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
                        <form:input path="data"  type="text" id="datepicker5" autocomplete="off"  />

                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="pacjent">
                            <spring:message text="Nr PESEL pacjenta: "/>
                        </form:label>
                    </td>
                    <td>
                        <input value="${pacjent.pesel}" readonly="true" disabled="true"/>
                        <form:input path="pacjent" type="hidden" value="${pacjent.pesel}"  readonly="true"/>
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
                    <td>
                        <input value="${pracownik.nrPWZ}" readonly="true" disabled="true"/>
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
    <p class="flip" id="flip7">Kliknij tutaj aby dodać nowy raport lekarski</p>

    <br>
    <br>
    <c:if test="${!empty listKsiegaRaportowLekarskich}">
        <table class="tg" style="width: 80%">
            <tr>
                <th width=5%>Nr w księdze</th>
                <th width=15%>Nazwa odddziału</th>
                <th width=10%>Data wpisu</th>
                <th width=35%>Sprawozdanie</th>
                <th width=20%>Nr PWZ lekarza</th>


            </tr>
            <c:forEach items="${listKsiegaRaportowLekarskich}" var="ksiegaRaportowLekarskich">
                <tr>
                    <td>${ksiegaRaportowLekarskich.nrWKsiedze}</td>
                    <td>${ksiegaRaportowLekarskich.nrKomOrg}</td>
                    <td>${ksiegaRaportowLekarskich.data}</td>
                    <td>${ksiegaRaportowLekarskich.sprawozdanie}</td>
                    <td>${ksiegaRaportowLekarskich.lekarz.tytulZawodowy} ${ksiegaRaportowLekarskich.lekarz.imie} ${ksiegaRaportowLekarskich.lekarz.nazwisko} ${ksiegaRaportowLekarskich.lekarz.nrPWZ}</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <br>
    <br><table class="title">
        <tr><td><h3>Zabiegi</h3></td></tr>
    </table>

    <br>
    <br>
    <c:url var="addAction" value="dokumentyPacjenta/ksiegaZabiegow/add" ></c:url>
        <div class="panel" id="panel8" style="width: 70%; height: 450px;">
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
                        <form:input path="data" type="text" id="datepicker6" autocomplete="off" />
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="pacjentPESEL">
                            <spring:message text="Nr PESEL pacjenta: "/>
                        </form:label>
                    </td>
                    <td>

                        <input value="${pacjent.pesel}" readonly="true" disabled="true"/>
                        <form:input path="pacjentPESEL" type="hidden" value="${pacjent.pesel}"  readonly="true"/>
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
    <p class="flip" id="flip8">Kliknij tutaj aby dodać nowy zabieg dla pacjenta</p>

    <br>
    <br>
    <h3>Lista wpisów w księdze zabiegów</h3>
    <c:if test="${!empty listKsiegaZabiegow}">
        <table class="tg" style="width: 100%">
            <tr>
                <th width=5%>Nr w księdze</th>
                <th width=10%>Nazwa oddziału</th>
                <th width=10%>Data</th>
                <th width=10%>Imię, nazwisko i nr PWZ lekarza zlecającego zabieg</th>
                <th width=15%>Rodzaj zabiegu</th>
                <th width=30%>Przebieg zabiegu</th>
                <th width=10%>Imię, nazwisko i nr PWZ pracownika wykonującego zabieg</th>


            </tr>
            <c:forEach items="${listKsiegaZabiegow}" var="ksiegaZabiegow">
                <tr>
                    <td>${ksiegaZabiegow.nrWKsiedze}</td>
                    <td>${ksiegaZabiegow.nrKomOrg}</td>
                    <td>${ksiegaZabiegow.data}</td>
                    <td>${ksiegaZabiegow.nrPWZlekarzZlec.tytulZawodowy} ${ksiegaZabiegow.nrPWZlekarzZlec.imie} ${ksiegaZabiegow.nrPWZlekarzZlec.nazwisko} ${ksiegaZabiegow.nrPWZlekarzZlec.nrPWZ}</td>
                    <td>${ksiegaZabiegow.rodzajZabiegu}</td>
                    <td>${ksiegaZabiegow.przebiegZabiegu}</td>
                    <td>${ksiegaZabiegow.nrPWZpracownikWyk.tytulZawodowy} ${ksiegaZabiegow.nrPWZpracownikWyk.imie} ${ksiegaZabiegow.nrPWZpracownikWyk.nazwisko} ${ksiegaZabiegow.nrPWZpracownikWyk.nrPWZ}</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>

</body>
</html>
