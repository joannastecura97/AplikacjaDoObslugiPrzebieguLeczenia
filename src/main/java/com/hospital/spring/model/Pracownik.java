/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author stecu
 */
@Entity
@Table(name = "pracownik")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pracownik.findAll", query = "SELECT p FROM Pracownik p")})
public class Pracownik implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nr_PWZ")
    private String nrPWZ;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tytul_zawodowy")
    private String tytulZawodowy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "imie")
    private String imie;
    @Size(max = 30)
    @Column(name = "drugie_imie")
    private String drugieImie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nazwisko")
    private String nazwisko;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "specjalizacje")
    private String specjalizacje;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "pesel")
    private String pesel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "haslo")
    private String haslo;
    @NotNull
    @Basic(optional = false)
    @Column(name = "enabled")
    private Integer enabled;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lekarzKier")
    private Collection<WpisDoSzpitala> wpisDoSzpitalaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lekarzPrzyjm")
    private Collection<WpisDoSzpitala> wpisDoSzpitalaCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lekarzProw")
    private Collection<KsiegaChorychOddzialu> ksiegaChorychOddzialuCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nrPwzLekarz")
    private Collection<KartaInformacyjna> kartaInformacyjnaLeczeniaSzpitalnegoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lekarz")
    private Collection<PrzebiegHospitalizacji> przebiegHospitalizacjiCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lekarzWyp")
    private Collection<WypisZeSzpitala> wypisZeSzpitalaCollection;
    @OneToMany(mappedBy = "lekarzZg")
    private Collection<WypisZeSzpitala> wypisZeSzpitalaCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pielegniarka")
    private Collection<WywiadPielegniarski> wywiadPielegniarskiCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lekarz")
    private Collection<KsiegaRaportowLekarskich> ksiegaRaportowLekarskichCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pielegniarka")
    private Collection<KsiegaRaportowPielegniarskich> ksiegaRaportowPielegniarskichCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pracownik")
    private Collection<Dzialanie> dzialanieCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nrPwzLekarz")
    private Collection<KsiegaPrzyjecWypisow> ksiegaPrzyjecWypisowCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pielegniarka")
    private Collection<RaportPielegniarski> raportPielegniarskiCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lekarzZlec")
    private Collection<KsiegaZabiegow> ksiegaZabiegowCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pracownikWyk")
    private Collection<KsiegaZabiegow> ksiegaZabiegowCollection1;

    public Pracownik() {
    }

    public Pracownik(String nrPWZ) {
        this.nrPWZ = nrPWZ;
    }

    public Pracownik(String nrPWZ, String tytulZawodowy, String imie, String nazwisko, String specjalizacje, String pesel, String login, String haslo, int enabled) {
        this.nrPWZ = nrPWZ;
        this.tytulZawodowy = tytulZawodowy;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.specjalizacje = specjalizacje;
        this.pesel = pesel;
        this.login = login;
        this.haslo = haslo;
        this.enabled = enabled;
    }

    public String getNrPWZ() {
        return nrPWZ;
    }

    public void setNrPWZ(String nrPWZ) {
        this.nrPWZ = nrPWZ;
    }

    public String getTytulZawodowy() {
        return tytulZawodowy;
    }

    public void setTytulZawodowy(String tytulZawodowy) {
        this.tytulZawodowy = tytulZawodowy;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getDrugieImie() {
        return drugieImie;
    }

    public void setDrugieImie(String drugieImie) {
        this.drugieImie = drugieImie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getSpecjalizacje() {
        return specjalizacje;
    }

    public void setSpecjalizacje(String specjalizacje) {
        this.specjalizacje = specjalizacje;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    @XmlTransient
    public Collection<WpisDoSzpitala> getWpisDoSzpitalaCollection() {
        return wpisDoSzpitalaCollection;
    }

    public void setWpisDoSzpitalaCollection(Collection<WpisDoSzpitala> wpisDoSzpitalaCollection) {
        this.wpisDoSzpitalaCollection = wpisDoSzpitalaCollection;
    }

    @XmlTransient
    public Collection<WpisDoSzpitala> getWpisDoSzpitalaCollection1() {
        return wpisDoSzpitalaCollection1;
    }

    public void setWpisDoSzpitalaCollection1(Collection<WpisDoSzpitala> wpisDoSzpitalaCollection1) {
        this.wpisDoSzpitalaCollection1 = wpisDoSzpitalaCollection1;
    }

    @XmlTransient
    public Collection<KsiegaChorychOddzialu> getKsiegaChorychOddzialuCollection() {
        return ksiegaChorychOddzialuCollection;
    }

    public void setKsiegaChorychOddzialuCollection(Collection<KsiegaChorychOddzialu> ksiegaChorychOddzialuCollection) {
        this.ksiegaChorychOddzialuCollection = ksiegaChorychOddzialuCollection;
    }

    @XmlTransient
    public Collection<KartaInformacyjna> getKartaInformacyjnaLeczeniaSzpitalnegoCollection() {
        return kartaInformacyjnaLeczeniaSzpitalnegoCollection;
    }

    public void setKartaInformacyjnaLeczeniaSzpitalnegoCollection(Collection<KartaInformacyjna> kartaInformacyjnaLeczeniaSzpitalnegoCollection) {
        this.kartaInformacyjnaLeczeniaSzpitalnegoCollection = kartaInformacyjnaLeczeniaSzpitalnegoCollection;
    }

    @XmlTransient
    public Collection<PrzebiegHospitalizacji> getPrzebiegHospitalizacjiCollection() {
        return przebiegHospitalizacjiCollection;
    }

    public void setPrzebiegHospitalizacjiCollection(Collection<PrzebiegHospitalizacji> przebiegHospitalizacjiCollection) {
        this.przebiegHospitalizacjiCollection = przebiegHospitalizacjiCollection;
    }

    @XmlTransient
    public Collection<WypisZeSzpitala> getWypisZeSzpitalaCollection() {
        return wypisZeSzpitalaCollection;
    }

    public void setWypisZeSzpitalaCollection(Collection<WypisZeSzpitala> wypisZeSzpitalaCollection) {
        this.wypisZeSzpitalaCollection = wypisZeSzpitalaCollection;
    }

    @XmlTransient
    public Collection<WypisZeSzpitala> getWypisZeSzpitalaCollection1() {
        return wypisZeSzpitalaCollection1;
    }

    public void setWypisZeSzpitalaCollection1(Collection<WypisZeSzpitala> wypisZeSzpitalaCollection1) {
        this.wypisZeSzpitalaCollection1 = wypisZeSzpitalaCollection1;
    }

    @XmlTransient
    public Collection<WywiadPielegniarski> getWywiadPielegniarskiCollection() {
        return wywiadPielegniarskiCollection;
    }

    public void setWywiadPielegniarskiCollection(Collection<WywiadPielegniarski> wywiadPielegniarskiCollection) {
        this.wywiadPielegniarskiCollection = wywiadPielegniarskiCollection;
    }

    @XmlTransient
    public Collection<KsiegaRaportowLekarskich> getKsiegaRaportowLekarskichCollection() {
        return ksiegaRaportowLekarskichCollection;
    }

    public void setKsiegaRaportowLekarskichCollection(Collection<KsiegaRaportowLekarskich> ksiegaRaportowLekarskichCollection) {
        this.ksiegaRaportowLekarskichCollection = ksiegaRaportowLekarskichCollection;
    }

    @XmlTransient
    public Collection<KsiegaRaportowPielegniarskich> getKsiegaRaportowPielegniarskichCollection() {
        return ksiegaRaportowPielegniarskichCollection;
    }

    public void setKsiegaRaportowPielegniarskichCollection(Collection<KsiegaRaportowPielegniarskich> ksiegaRaportowPielegniarskichCollection) {
        this.ksiegaRaportowPielegniarskichCollection = ksiegaRaportowPielegniarskichCollection;
    }

    @XmlTransient
    public Collection<Dzialanie> getDzialanieCollection() {
        return dzialanieCollection;
    }

    public void setDzialanieCollection(Collection<Dzialanie> dzialanieCollection) {
        this.dzialanieCollection = dzialanieCollection;
    }

    @XmlTransient
    public Collection<KsiegaPrzyjecWypisow> getKsiegaPrzyjecWypisowCollection() {
        return ksiegaPrzyjecWypisowCollection;
    }

    public void setKsiegaPrzyjecWypisowCollection(Collection<KsiegaPrzyjecWypisow> ksiegaPrzyjecWypisowCollection) {
        this.ksiegaPrzyjecWypisowCollection = ksiegaPrzyjecWypisowCollection;
    }

    @XmlTransient
    public Collection<RaportPielegniarski> getRaportPielegniarskiCollection() {
        return raportPielegniarskiCollection;
    }

    public void setRaportPielegniarskiCollection(Collection<RaportPielegniarski> raportPielegniarskiCollection) {
        this.raportPielegniarskiCollection = raportPielegniarskiCollection;
    }

    @XmlTransient
    public Collection<KsiegaZabiegow> getKsiegaZabiegowCollection() {
        return ksiegaZabiegowCollection;
    }

    public void setKsiegaZabiegowCollection(Collection<KsiegaZabiegow> ksiegaZabiegowCollection) {
        this.ksiegaZabiegowCollection = ksiegaZabiegowCollection;
    }

    @XmlTransient
    public Collection<KsiegaZabiegow> getKsiegaZabiegowCollection1() {
        return ksiegaZabiegowCollection1;
    }

    public void setKsiegaZabiegowCollection1(Collection<KsiegaZabiegow> ksiegaZabiegowCollection1) {
        this.ksiegaZabiegowCollection1 = ksiegaZabiegowCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrPWZ != null ? nrPWZ.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pracownik)) {
            return false;
        }
        Pracownik other = (Pracownik) object;
        if ((this.nrPWZ == null && other.nrPWZ != null) || (this.nrPWZ != null && !this.nrPWZ.equals(other.nrPWZ))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hospital.spring.model.Pracownik[ nrPWZ=" + nrPWZ + " ]";
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

}
