package com.hospital.spring.model;

import com.hospital.spring.model.Dzialanie;
import com.hospital.spring.model.KartaInformacyjna;
import com.hospital.spring.model.KsiegaChorychOddzialu;
import com.hospital.spring.model.KsiegaPrzyjecWypisow;
import com.hospital.spring.model.KsiegaRaportowLekarskich;
import com.hospital.spring.model.KsiegaRaportowPielegniarskich;
import com.hospital.spring.model.KsiegaZabiegow;
import com.hospital.spring.model.PrzebiegHospitalizacji;
import com.hospital.spring.model.RaportPielegniarski;
import com.hospital.spring.model.WpisDoSzpitala;
import com.hospital.spring.model.WypisZeSzpitala;
import com.hospital.spring.model.WywiadPielegniarski;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-25T16:09:40")
@StaticMetamodel(Pracownik.class)
public class Pracownik_ { 

    public static volatile CollectionAttribute<Pracownik, KsiegaZabiegow> ksiegaZabiegowCollection1;
    public static volatile CollectionAttribute<Pracownik, WypisZeSzpitala> wypisZeSzpitalaCollection;
    public static volatile CollectionAttribute<Pracownik, KsiegaChorychOddzialu> ksiegaChorychOddzialuCollection;
    public static volatile SingularAttribute<Pracownik, String> login;
    public static volatile SingularAttribute<Pracownik, Integer> enabled;
    public static volatile SingularAttribute<Pracownik, String> drugieImie;
    public static volatile CollectionAttribute<Pracownik, Dzialanie> dzialanieCollection;
    public static volatile SingularAttribute<Pracownik, String> nazwisko;
    public static volatile CollectionAttribute<Pracownik, KsiegaPrzyjecWypisow> ksiegaPrzyjecWypisowCollection;
    public static volatile CollectionAttribute<Pracownik, KartaInformacyjna> kartaInformacyjnaLeczeniaSzpitalnegoCollection;
    public static volatile SingularAttribute<Pracownik, String> specjalizacje;
    public static volatile CollectionAttribute<Pracownik, KsiegaRaportowPielegniarskich> ksiegaRaportowPielegniarskichCollection;
    public static volatile SingularAttribute<Pracownik, String> tytulZawodowy;
    public static volatile CollectionAttribute<Pracownik, WpisDoSzpitala> wpisDoSzpitalaCollection1;
    public static volatile SingularAttribute<Pracownik, String> pesel;
    public static volatile CollectionAttribute<Pracownik, WypisZeSzpitala> wypisZeSzpitalaCollection1;
    public static volatile CollectionAttribute<Pracownik, WpisDoSzpitala> wpisDoSzpitalaCollection;
    public static volatile CollectionAttribute<Pracownik, KsiegaZabiegow> ksiegaZabiegowCollection;
    public static volatile SingularAttribute<Pracownik, String> nrPWZ;
    public static volatile CollectionAttribute<Pracownik, RaportPielegniarski> raportPielegniarskiCollection;
    public static volatile CollectionAttribute<Pracownik, KsiegaRaportowLekarskich> ksiegaRaportowLekarskichCollection;
    public static volatile SingularAttribute<Pracownik, String> imie;
    public static volatile CollectionAttribute<Pracownik, PrzebiegHospitalizacji> przebiegHospitalizacjiCollection;
    public static volatile SingularAttribute<Pracownik, String> haslo;
    public static volatile CollectionAttribute<Pracownik, WywiadPielegniarski> wywiadPielegniarskiCollection;

}