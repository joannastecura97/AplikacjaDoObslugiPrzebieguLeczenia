/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author stecu
 */
@Entity
@Table(name = "pacjent")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pacjent.findAll", query = "SELECT p FROM Pacjent p")})
public class Pacjent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 5, max = 30)
    @Column(name = "znak_identyfikacyjny")
    private String znakIdentyfikacyjny;
    @Basic(optional = false)
    @NotNull
    @Size(min = 2, max = 30)
    @Column(name = "imie")
    private String imie;
    @Size(max = 30)
    @Column(name = "drugie_imie")
    private String drugieImie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 2, max = 30)
    @Column(name = "nazwisko")
    private String nazwisko;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_urodzenia")
    @Temporal(TemporalType.DATE)
    private Date dataUrodzenia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 2, max = 15)
    @Column(name = "plec")
    private String plec;
    @Basic(optional = false)
    @NotNull
    @Size(min = 10, max = 100)
    @Column(name = "adres")
    private String adres;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 11, max = 11)
    @Column(name = "PESEL")
    private String pesel;
    @Size(max = 160)
    @Column(name = "dane_przedstawiciela_ust")
    private String danePrzedstawicielaUst;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pesel")
    private Collection<KsiegaChorychOddzialu> ksiegaChorychOddzialuCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacjent")
    private Collection<KartaInformacyjna> kartaInformacyjnaLeczeniaSzpitalnegoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacjent")
    private Collection<HistoriaChoroby> historiaChorobyCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacjent")
    private Collection<KsiegaRaportowLekarskich> ksiegaRaportowLekarskichCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pesel")
    private Collection<KsiegaPrzyjecWypisow> ksiegaPrzyjecWypisowCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacjent")
    private Collection<RaportPielegniarski> raportPielegniarskiCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacjent")
    private Collection<KsiegaZabiegow> ksiegaZabiegowCollection;

    public Pacjent() {
    }

    public Pacjent(String pesel) {
        this.pesel = pesel;
    }

    public Pacjent(String pesel, String znakIdentyfikacyjny, String imie, String nazwisko, Date dataUrodzenia, String plec, String adres) {
        this.pesel = pesel;
        this.znakIdentyfikacyjny = znakIdentyfikacyjny;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
        this.adres = adres;
    }

    public String getZnakIdentyfikacyjny() {
        return znakIdentyfikacyjny;
    }

    public void setZnakIdentyfikacyjny(String znakIdentyfikacyjny) {
        this.znakIdentyfikacyjny = znakIdentyfikacyjny;
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

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getDanePrzedstawicielaUst() {
        return danePrzedstawicielaUst;
    }

    public void setDanePrzedstawicielaUst(String danePrzedstawicielaUst) {
        this.danePrzedstawicielaUst = danePrzedstawicielaUst;
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
    public Collection<HistoriaChoroby> getHistoriaChorobyCollection() {
        return historiaChorobyCollection;
    }

    public void setHistoriaChorobyCollection(Collection<HistoriaChoroby> historiaChorobyCollection) {
        this.historiaChorobyCollection = historiaChorobyCollection;
    }

    @XmlTransient
    public Collection<KsiegaRaportowLekarskich> getKsiegaRaportowLekarskichCollection() {
        return ksiegaRaportowLekarskichCollection;
    }

    public void setKsiegaRaportowLekarskichCollection(Collection<KsiegaRaportowLekarskich> ksiegaRaportowLekarskichCollection) {
        this.ksiegaRaportowLekarskichCollection = ksiegaRaportowLekarskichCollection;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pesel != null ? pesel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pacjent)) {
            return false;
        }
        Pacjent other = (Pacjent) object;
        if ((this.pesel == null && other.pesel != null) || (this.pesel != null && !this.pesel.equals(other.pesel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hospital.spring.model.Pacjent[ pesel=" + pesel + " ]";
    }

}
