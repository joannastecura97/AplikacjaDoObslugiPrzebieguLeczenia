package com.hospital.spring.model;

import com.hospital.spring.model.HistoriaChoroby;
import com.hospital.spring.model.Pracownik;
import com.hospital.spring.model.SzpitalKomOrg;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-25T16:09:40")
@StaticMetamodel(WywiadPielegniarski.class)
public class WywiadPielegniarski_ { 

    public static volatile SingularAttribute<WywiadPielegniarski, String> skora;
    public static volatile SingularAttribute<WywiadPielegniarski, Date> data;
    public static volatile SingularAttribute<WywiadPielegniarski, Pracownik> pielegniarka;
    public static volatile SingularAttribute<WywiadPielegniarski, String> reakcjaNaTransf;
    public static volatile SingularAttribute<WywiadPielegniarski, String> uwagi;
    public static volatile SingularAttribute<WywiadPielegniarski, String> sprzetKompens;
    public static volatile SingularAttribute<WywiadPielegniarski, String> diagnozyPiel;
    public static volatile SingularAttribute<WywiadPielegniarski, String> jedzenie;
    public static volatile SingularAttribute<WywiadPielegniarski, Integer> praksjaKonstr;
    public static volatile SingularAttribute<WywiadPielegniarski, String> ukMoczowoPl;
    public static volatile SingularAttribute<WywiadPielegniarski, String> zachowanie;
    public static volatile SingularAttribute<WywiadPielegniarski, Integer> waga;
    public static volatile SingularAttribute<WywiadPielegniarski, String> nrTelefonu;
    public static volatile SingularAttribute<WywiadPielegniarski, Integer> iloscPobytow;
    public static volatile SingularAttribute<WywiadPielegniarski, String> kapiel;
    public static volatile SingularAttribute<WywiadPielegniarski, String> przebZabOperac;
    public static volatile SingularAttribute<WywiadPielegniarski, String> ukKostnoStaw;
    public static volatile SingularAttribute<WywiadPielegniarski, Integer> id;
    public static volatile SingularAttribute<WywiadPielegniarski, Integer> orientCzasie;
    public static volatile SingularAttribute<WywiadPielegniarski, String> upadki;
    public static volatile SingularAttribute<WywiadPielegniarski, HistoriaChoroby> historiaChoroby;
    public static volatile SingularAttribute<WywiadPielegniarski, String> cisnienie;
    public static volatile SingularAttribute<WywiadPielegniarski, String> trybPrzyjecia;
    public static volatile SingularAttribute<WywiadPielegniarski, String> przebChorZak;
    public static volatile SingularAttribute<WywiadPielegniarski, String> objawy;
    public static volatile SingularAttribute<WywiadPielegniarski, String> choroby;
    public static volatile SingularAttribute<WywiadPielegniarski, Integer> wykonywPolecen;
    public static volatile SingularAttribute<WywiadPielegniarski, String> ukKrazeniowy;
    public static volatile SingularAttribute<WywiadPielegniarski, String> umiejscowienieBolu;
    public static volatile SingularAttribute<WywiadPielegniarski, Integer> uwaga;
    public static volatile SingularAttribute<WywiadPielegniarski, Integer> funkJezykowe;
    public static volatile SingularAttribute<WywiadPielegniarski, String> tetno;
    public static volatile SingularAttribute<WywiadPielegniarski, String> nudnosci;
    public static volatile SingularAttribute<WywiadPielegniarski, String> przyczynaPrzyjecia;
    public static volatile SingularAttribute<WywiadPielegniarski, Integer> wzrost;
    public static volatile SingularAttribute<WywiadPielegniarski, String> bol;
    public static volatile SingularAttribute<WywiadPielegniarski, Integer> powtarzanie;
    public static volatile SingularAttribute<WywiadPielegniarski, String> higiena;
    public static volatile SingularAttribute<WywiadPielegniarski, String> warunkiSocjalne;
    public static volatile SingularAttribute<WywiadPielegniarski, String> poruszanieSie;
    public static volatile SingularAttribute<WywiadPielegniarski, Integer> pisanie;
    public static volatile SingularAttribute<WywiadPielegniarski, String> opiekaDuszp;
    public static volatile SingularAttribute<WywiadPielegniarski, String> transfuzje;
    public static volatile SingularAttribute<WywiadPielegniarski, Integer> liczbaPunktow;
    public static volatile SingularAttribute<WywiadPielegniarski, String> grupaKrwi;
    public static volatile SingularAttribute<WywiadPielegniarski, String> stylZycia;
    public static volatile SingularAttribute<WywiadPielegniarski, String> aktywnoscLozku;
    public static volatile SingularAttribute<WywiadPielegniarski, String> wyksztalcenie;
    public static volatile SingularAttribute<WywiadPielegniarski, Integer> ogolemPkt;
    public static volatile SingularAttribute<WywiadPielegniarski, Double> temperatura;
    public static volatile SingularAttribute<WywiadPielegniarski, String> dusznosc;
    public static volatile SingularAttribute<WywiadPielegniarski, String> zawod;
    public static volatile SingularAttribute<WywiadPielegniarski, String> korzystanieToal;
    public static volatile SingularAttribute<WywiadPielegniarski, String> diagnozaLekarska;
    public static volatile SingularAttribute<WywiadPielegniarski, String> kontaktZPacjentem;
    public static volatile SingularAttribute<WywiadPielegniarski, String> oddech;
    public static volatile SingularAttribute<WywiadPielegniarski, String> wyjscieDoToal;
    public static volatile SingularAttribute<WywiadPielegniarski, String> objawyTowarzysz;
    public static volatile SingularAttribute<WywiadPielegniarski, String> trzymanieMoczu;
    public static volatile SingularAttribute<WywiadPielegniarski, Integer> zapamietywanie;
    public static volatile SingularAttribute<WywiadPielegniarski, String> alergie;
    public static volatile SingularAttribute<WywiadPielegniarski, String> stopienZmeczenia;
    public static volatile SingularAttribute<WywiadPielegniarski, String> stanCywilny;
    public static volatile SingularAttribute<WywiadPielegniarski, SzpitalKomOrg> nrKomOrg;
    public static volatile SingularAttribute<WywiadPielegniarski, Integer> orientMiejscu;
    public static volatile SingularAttribute<WywiadPielegniarski, String> ukladNerwowy;
    public static volatile SingularAttribute<WywiadPielegniarski, String> ukOddechowy;
    public static volatile SingularAttribute<WywiadPielegniarski, String> ukPokarmowy;
    public static volatile SingularAttribute<WywiadPielegniarski, String> przyjmowaneLeki;
    public static volatile SingularAttribute<WywiadPielegniarski, String> odlezyny;
    public static volatile SingularAttribute<WywiadPielegniarski, Integer> przypominanie;
    public static volatile SingularAttribute<WywiadPielegniarski, Double> bmi;

}