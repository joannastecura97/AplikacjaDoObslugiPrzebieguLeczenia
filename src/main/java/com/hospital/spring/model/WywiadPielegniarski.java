/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author stecu
 */
@Entity
@Table(name = "wywiad_pielegniarski")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WywiadPielegniarski.findAll", query = "SELECT w FROM WywiadPielegniarski w")})
public class WywiadPielegniarski implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "stan_cywilny")
    private String stanCywilny;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "nr_telefonu")
    private String nrTelefonu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "zawod")
    private String zawod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "wyksztalcenie")
    private String wyksztalcenie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "tryb_przyjecia")
    private String trybPrzyjecia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ilosc_pobytow")
    private int iloscPobytow;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "diagnoza_lekarska")
    private String diagnozaLekarska;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "przyczyna_przyjecia")
    private String przyczynaPrzyjecia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "kontakt_z_pacjentem")
    private String kontaktZPacjentem;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "objawy")
    private String objawy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "objawy_towarzysz")
    private String objawyTowarzysz;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "choroby")
    private String choroby;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "przeb_chor_zak")
    private String przebChorZak;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "przeb_zab_operac")
    private String przebZabOperac;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wzrost")
    private int wzrost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "waga")
    private int waga;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bmi")
    private double bmi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "temperatura")
    private double temperatura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "cisnienie")
    private String cisnienie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "tetno")
    private String tetno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "oddech")
    private String oddech;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "bol")
    private String bol;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "umiejscowienie_bolu")
    private String umiejscowienieBolu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "grupa_krwi")
    private String grupaKrwi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "alergie")
    private String alergie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "transfuzje")
    private String transfuzje;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "reakcja_na_transf")
    private String reakcjaNaTransf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "styl_zycia")
    private String stylZycia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "przyjmowane_leki")
    private String przyjmowaneLeki;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "opieka_duszp")
    private String opiekaDuszp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "kapiel")
    private String kapiel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "higiena")
    private String higiena;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "poruszanie_sie")
    private String poruszanieSie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "wyjscie_do_toal")
    private String wyjscieDoToal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "korzystanie_toal")
    private String korzystanieToal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "aktywnosc_lozku")
    private String aktywnoscLozku;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "jedzenie")
    private String jedzenie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "liczba_punktow")
    private int liczbaPunktow;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "stopien_zmeczenia")
    private String stopienZmeczenia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "sprzet_kompens")
    private String sprzetKompens;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "warunki_socjalne")
    private String warunkiSocjalne;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "skora")
    private String skora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "odlezyny")
    private String odlezyny;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "uklad_nerwowy")
    private String ukladNerwowy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "orient_czasie")
    private int orientCzasie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "orient_miejscu")
    private int orientMiejscu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "zapamietywanie")
    private int zapamietywanie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "uwaga")
    private int uwaga;
    @Basic(optional = false)
    @NotNull
    @Column(name = "przypominanie")
    private int przypominanie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "funk_jezykowe")
    private int funkJezykowe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "powtarzanie")
    private int powtarzanie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wykonyw_polecen")
    private int wykonywPolecen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pisanie")
    private int pisanie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "praksja_konstr")
    private int praksjaKonstr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ogolem_pkt")
    private int ogolemPkt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "zachowanie")
    private String zachowanie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "uk_krazeniowy")
    private String ukKrazeniowy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "uk_oddechowy")
    private String ukOddechowy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "dusznosc")
    private String dusznosc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "uk_pokarmowy")
    private String ukPokarmowy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "nudnosci")
    private String nudnosci;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "uk_moczowo_pl")
    private String ukMoczowoPl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "trzymanie_moczu")
    private String trzymanieMoczu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "uk_kostno_staw")
    private String ukKostnoStaw;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "upadki")
    private String upadki;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "diagnozy_piel")
    private String diagnozyPiel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "uwagi")
    private String uwagi;
    @JoinColumn(name = "pracownik", referencedColumnName = "nr_PWZ")
    @ManyToOne(optional = false)
    private Pracownik pielegniarka;
    @JoinColumn(name = "szpital_kom_org", referencedColumnName = "kod_resortowy")
    @ManyToOne(optional = false)
    private SzpitalKomOrg nrKomOrg;
    @JoinColumn(name = "historia_choroby", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private HistoriaChoroby historiaChoroby;

    public WywiadPielegniarski() {
    }

    public WywiadPielegniarski(Integer id) {
        this.id = id;
    }

    public WywiadPielegniarski(Integer id, Date data, String stanCywilny, String nrTelefonu, String zawod, String wyksztalcenie, String trybPrzyjecia, int iloscPobytow, String diagnozaLekarska, String przyczynaPrzyjecia, String kontaktZPacjentem, String objawy, String objawyTowarzysz, String choroby, String przebChorZak, String przebZabOperac, int wzrost, int waga, double bmi, double temperatura, String cisnienie, String tetno, String oddech, String bol, String umiejscowienieBolu, String grupaKrwi, String alergie, String transfuzje, String reakcjaNaTransf, String stylZycia, String przyjmowaneLeki, String opiekaDuszp, String kapiel, String higiena, String poruszanieSie, String wyjscieDoToal, String korzystanieToal, String aktywnoscLozku, String jedzenie, int liczbaPunktow, String stopienZmeczenia, String sprzetKompens, String warunkiSocjalne, String skora, String odlezyny, String ukladNerwowy, int orientCzasie, int orientMiejscu, int zapamietywanie, int uwaga, int przypominanie, int funkJezykowe, int powtarzanie, int wykonywPolecen, int pisanie, int praksjaKonstr, int ogolemPkt, String zachowanie, String ukKrazeniowy, String ukOddechowy, String dusznosc, String ukPokarmowy, String nudnosci, String ukMoczowoPl, String trzymanieMoczu, String ukKostnoStaw, String upadki, String diagnozyPiel, String uwagi) {
        this.id = id;
        this.data = data;
        this.stanCywilny = stanCywilny;
        this.nrTelefonu = nrTelefonu;
        this.zawod = zawod;
        this.wyksztalcenie = wyksztalcenie;
        this.trybPrzyjecia = trybPrzyjecia;
        this.iloscPobytow = iloscPobytow;
        this.diagnozaLekarska = diagnozaLekarska;
        this.przyczynaPrzyjecia = przyczynaPrzyjecia;
        this.kontaktZPacjentem = kontaktZPacjentem;
        this.objawy = objawy;
        this.objawyTowarzysz = objawyTowarzysz;
        this.choroby = choroby;
        this.przebChorZak = przebChorZak;
        this.przebZabOperac = przebZabOperac;
        this.wzrost = wzrost;
        this.waga = waga;
        this.bmi = bmi;
        this.temperatura = temperatura;
        this.cisnienie = cisnienie;
        this.tetno = tetno;
        this.oddech = oddech;
        this.bol = bol;
        this.umiejscowienieBolu = umiejscowienieBolu;
        this.grupaKrwi = grupaKrwi;
        this.alergie = alergie;
        this.transfuzje = transfuzje;
        this.reakcjaNaTransf = reakcjaNaTransf;
        this.stylZycia = stylZycia;
        this.przyjmowaneLeki = przyjmowaneLeki;
        this.opiekaDuszp = opiekaDuszp;
        this.kapiel = kapiel;
        this.higiena = higiena;
        this.poruszanieSie = poruszanieSie;
        this.wyjscieDoToal = wyjscieDoToal;
        this.korzystanieToal = korzystanieToal;
        this.aktywnoscLozku = aktywnoscLozku;
        this.jedzenie = jedzenie;
        this.liczbaPunktow = liczbaPunktow;
        this.stopienZmeczenia = stopienZmeczenia;
        this.sprzetKompens = sprzetKompens;
        this.warunkiSocjalne = warunkiSocjalne;
        this.skora = skora;
        this.odlezyny = odlezyny;
        this.ukladNerwowy = ukladNerwowy;
        this.orientCzasie = orientCzasie;
        this.orientMiejscu = orientMiejscu;
        this.zapamietywanie = zapamietywanie;
        this.uwaga = uwaga;
        this.przypominanie = przypominanie;
        this.funkJezykowe = funkJezykowe;
        this.powtarzanie = powtarzanie;
        this.wykonywPolecen = wykonywPolecen;
        this.pisanie = pisanie;
        this.praksjaKonstr = praksjaKonstr;
        this.ogolemPkt = ogolemPkt;
        this.zachowanie = zachowanie;
        this.ukKrazeniowy = ukKrazeniowy;
        this.ukOddechowy = ukOddechowy;
        this.dusznosc = dusznosc;
        this.ukPokarmowy = ukPokarmowy;
        this.nudnosci = nudnosci;
        this.ukMoczowoPl = ukMoczowoPl;
        this.trzymanieMoczu = trzymanieMoczu;
        this.ukKostnoStaw = ukKostnoStaw;
        this.upadki = upadki;
        this.diagnozyPiel = diagnozyPiel;
        this.uwagi = uwagi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStanCywilny() {
        return stanCywilny;
    }

    public void setStanCywilny(String stanCywilny) {
        this.stanCywilny = stanCywilny;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    public String getZawod() {
        return zawod;
    }

    public void setZawod(String zawod) {
        this.zawod = zawod;
    }

    public String getWyksztalcenie() {
        return wyksztalcenie;
    }

    public void setWyksztalcenie(String wyksztalcenie) {
        this.wyksztalcenie = wyksztalcenie;
    }

    public String getTrybPrzyjecia() {
        return trybPrzyjecia;
    }

    public void setTrybPrzyjecia(String trybPrzyjecia) {
        this.trybPrzyjecia = trybPrzyjecia;
    }

    public int getIloscPobytow() {
        return iloscPobytow;
    }

    public void setIloscPobytow(int iloscPobytow) {
        this.iloscPobytow = iloscPobytow;
    }

    public String getDiagnozaLekarska() {
        return diagnozaLekarska;
    }

    public void setDiagnozaLekarska(String diagnozaLekarska) {
        this.diagnozaLekarska = diagnozaLekarska;
    }

    public String getPrzyczynaPrzyjecia() {
        return przyczynaPrzyjecia;
    }

    public void setPrzyczynaPrzyjecia(String przyczynaPrzyjecia) {
        this.przyczynaPrzyjecia = przyczynaPrzyjecia;
    }

    public String getKontaktZPacjentem() {
        return kontaktZPacjentem;
    }

    public void setKontaktZPacjentem(String kontaktZPacjentem) {
        this.kontaktZPacjentem = kontaktZPacjentem;
    }

    public String getObjawy() {
        return objawy;
    }

    public void setObjawy(String objawy) {
        this.objawy = objawy;
    }

    public String getObjawyTowarzysz() {
        return objawyTowarzysz;
    }

    public void setObjawyTowarzysz(String objawyTowarzysz) {
        this.objawyTowarzysz = objawyTowarzysz;
    }

    public String getChoroby() {
        return choroby;
    }

    public void setChoroby(String choroby) {
        this.choroby = choroby;
    }

    public String getPrzebChorZak() {
        return przebChorZak;
    }

    public void setPrzebChorZak(String przebChorZak) {
        this.przebChorZak = przebChorZak;
    }

    public String getPrzebZabOperac() {
        return przebZabOperac;
    }

    public void setPrzebZabOperac(String przebZabOperac) {
        this.przebZabOperac = przebZabOperac;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getCisnienie() {
        return cisnienie;
    }

    public void setCisnienie(String cisnienie) {
        this.cisnienie = cisnienie;
    }

    public String getTetno() {
        return tetno;
    }

    public void setTetno(String tetno) {
        this.tetno = tetno;
    }

    public String getOddech() {
        return oddech;
    }

    public void setOddech(String oddech) {
        this.oddech = oddech;
    }

    public String getBol() {
        return bol;
    }

    public void setBol(String bol) {
        this.bol = bol;
    }

    public String getUmiejscowienieBolu() {
        return umiejscowienieBolu;
    }

    public void setUmiejscowienieBolu(String umiejscowienieBolu) {
        this.umiejscowienieBolu = umiejscowienieBolu;
    }

    public String getGrupaKrwi() {
        return grupaKrwi;
    }

    public void setGrupaKrwi(String grupaKrwi) {
        this.grupaKrwi = grupaKrwi;
    }

    public String getAlergie() {
        return alergie;
    }

    public void setAlergie(String alergie) {
        this.alergie = alergie;
    }

    public String getTransfuzje() {
        return transfuzje;
    }

    public void setTransfuzje(String transfuzje) {
        this.transfuzje = transfuzje;
    }

    public String getReakcjaNaTransf() {
        return reakcjaNaTransf;
    }

    public void setReakcjaNaTransf(String reakcjaNaTransf) {
        this.reakcjaNaTransf = reakcjaNaTransf;
    }

    public String getStylZycia() {
        return stylZycia;
    }

    public void setStylZycia(String stylZycia) {
        this.stylZycia = stylZycia;
    }

    public String getPrzyjmowaneLeki() {
        return przyjmowaneLeki;
    }

    public void setPrzyjmowaneLeki(String przyjmowaneLeki) {
        this.przyjmowaneLeki = przyjmowaneLeki;
    }

    public String getOpiekaDuszp() {
        return opiekaDuszp;
    }

    public void setOpiekaDuszp(String opiekaDuszp) {
        this.opiekaDuszp = opiekaDuszp;
    }

    public String getKapiel() {
        return kapiel;
    }

    public void setKapiel(String kapiel) {
        this.kapiel = kapiel;
    }

    public String getHigiena() {
        return higiena;
    }

    public void setHigiena(String higiena) {
        this.higiena = higiena;
    }

    public String getPoruszanieSie() {
        return poruszanieSie;
    }

    public void setPoruszanieSie(String poruszanieSie) {
        this.poruszanieSie = poruszanieSie;
    }

    public String getWyjscieDoToal() {
        return wyjscieDoToal;
    }

    public void setWyjscieDoToal(String wyjscieDoToal) {
        this.wyjscieDoToal = wyjscieDoToal;
    }

    public String getKorzystanieToal() {
        return korzystanieToal;
    }

    public void setKorzystanieToal(String korzystanieToal) {
        this.korzystanieToal = korzystanieToal;
    }

    public String getAktywnoscLozku() {
        return aktywnoscLozku;
    }

    public void setAktywnoscLozku(String aktywnoscLozku) {
        this.aktywnoscLozku = aktywnoscLozku;
    }

    public String getJedzenie() {
        return jedzenie;
    }

    public void setJedzenie(String jedzenie) {
        this.jedzenie = jedzenie;
    }

    public int getLiczbaPunktow() {
        return liczbaPunktow;
    }

    public void setLiczbaPunktow(int liczbaPunktow) {
        this.liczbaPunktow = liczbaPunktow;
    }

    public String getStopienZmeczenia() {
        return stopienZmeczenia;
    }

    public void setStopienZmeczenia(String stopienZmeczenia) {
        this.stopienZmeczenia = stopienZmeczenia;
    }

    public String getSprzetKompens() {
        return sprzetKompens;
    }

    public void setSprzetKompens(String sprzetKompens) {
        this.sprzetKompens = sprzetKompens;
    }

    public String getWarunkiSocjalne() {
        return warunkiSocjalne;
    }

    public void setWarunkiSocjalne(String warunkiSocjalne) {
        this.warunkiSocjalne = warunkiSocjalne;
    }

    public String getSkora() {
        return skora;
    }

    public void setSkora(String skora) {
        this.skora = skora;
    }

    public String getOdlezyny() {
        return odlezyny;
    }

    public void setOdlezyny(String odlezyny) {
        this.odlezyny = odlezyny;
    }

    public String getUkladNerwowy() {
        return ukladNerwowy;
    }

    public void setUkladNerwowy(String ukladNerwowy) {
        this.ukladNerwowy = ukladNerwowy;
    }

    public int getOrientCzasie() {
        return orientCzasie;
    }

    public void setOrientCzasie(int orientCzasie) {
        this.orientCzasie = orientCzasie;
    }

    public int getOrientMiejscu() {
        return orientMiejscu;
    }

    public void setOrientMiejscu(int orientMiejscu) {
        this.orientMiejscu = orientMiejscu;
    }

    public int getZapamietywanie() {
        return zapamietywanie;
    }

    public void setZapamietywanie(int zapamietywanie) {
        this.zapamietywanie = zapamietywanie;
    }

    public int getUwaga() {
        return uwaga;
    }

    public void setUwaga(int uwaga) {
        this.uwaga = uwaga;
    }

    public int getPrzypominanie() {
        return przypominanie;
    }

    public void setPrzypominanie(int przypominanie) {
        this.przypominanie = przypominanie;
    }

    public int getFunkJezykowe() {
        return funkJezykowe;
    }

    public void setFunkJezykowe(int funkJezykowe) {
        this.funkJezykowe = funkJezykowe;
    }

    public int getPowtarzanie() {
        return powtarzanie;
    }

    public void setPowtarzanie(int powtarzanie) {
        this.powtarzanie = powtarzanie;
    }

    public int getWykonywPolecen() {
        return wykonywPolecen;
    }

    public void setWykonywPolecen(int wykonywPolecen) {
        this.wykonywPolecen = wykonywPolecen;
    }

    public int getPisanie() {
        return pisanie;
    }

    public void setPisanie(int pisanie) {
        this.pisanie = pisanie;
    }

    public int getPraksjaKonstr() {
        return praksjaKonstr;
    }

    public void setPraksjaKonstr(int praksjaKonstr) {
        this.praksjaKonstr = praksjaKonstr;
    }

    public int getOgolemPkt() {
        return ogolemPkt;
    }

    public void setOgolemPkt(int ogolemPkt) {
        this.ogolemPkt = ogolemPkt;
    }

    public String getZachowanie() {
        return zachowanie;
    }

    public void setZachowanie(String zachowanie) {
        this.zachowanie = zachowanie;
    }

    public String getUkKrazeniowy() {
        return ukKrazeniowy;
    }

    public void setUkKrazeniowy(String ukKrazeniowy) {
        this.ukKrazeniowy = ukKrazeniowy;
    }

    public String getUkOddechowy() {
        return ukOddechowy;
    }

    public void setUkOddechowy(String ukOddechowy) {
        this.ukOddechowy = ukOddechowy;
    }

    public String getDusznosc() {
        return dusznosc;
    }

    public void setDusznosc(String dusznosc) {
        this.dusznosc = dusznosc;
    }

    public String getUkPokarmowy() {
        return ukPokarmowy;
    }

    public void setUkPokarmowy(String ukPokarmowy) {
        this.ukPokarmowy = ukPokarmowy;
    }

    public String getNudnosci() {
        return nudnosci;
    }

    public void setNudnosci(String nudnosci) {
        this.nudnosci = nudnosci;
    }

    public String getUkMoczowoPl() {
        return ukMoczowoPl;
    }

    public void setUkMoczowoPl(String ukMoczowoPl) {
        this.ukMoczowoPl = ukMoczowoPl;
    }

    public String getTrzymanieMoczu() {
        return trzymanieMoczu;
    }

    public void setTrzymanieMoczu(String trzymanieMoczu) {
        this.trzymanieMoczu = trzymanieMoczu;
    }

    public String getUkKostnoStaw() {
        return ukKostnoStaw;
    }

    public void setUkKostnoStaw(String ukKostnoStaw) {
        this.ukKostnoStaw = ukKostnoStaw;
    }

    public String getUpadki() {
        return upadki;
    }

    public void setUpadki(String upadki) {
        this.upadki = upadki;
    }

    public String getDiagnozyPiel() {
        return diagnozyPiel;
    }

    public void setDiagnozyPiel(String diagnozyPiel) {
        this.diagnozyPiel = diagnozyPiel;
    }

    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }

    public Pracownik getPielegniarka() {
        return pielegniarka;
    }

    public void setPielegniarka(Pracownik pielegniarka) {
        this.pielegniarka = pielegniarka;
    }

    public SzpitalKomOrg getNrKomOrg() {
        return nrKomOrg;
    }

    public void setNrKomOrg(SzpitalKomOrg nrKomOrg) {
        this.nrKomOrg = nrKomOrg;
    }

    public HistoriaChoroby getHistoriaChoroby() {
        return historiaChoroby;
    }

    public void setHistoriaChoroby(HistoriaChoroby historiaChoroby) {
        this.historiaChoroby = historiaChoroby;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WywiadPielegniarski)) {
            return false;
        }
        WywiadPielegniarski other = (WywiadPielegniarski) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hospital.spring.model.WywiadPielegniarski[ id=" + id + " ]";
    }

}
