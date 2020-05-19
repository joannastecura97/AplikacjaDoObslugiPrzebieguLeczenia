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
@Table(name = "karta_informacyjna_leczenia_szpitalnego")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KartaInformacyjna.findAll", query = "SELECT k FROM KartaInformacyjna k")})
public class KartaInformacyjna implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_wydania")
    @Temporal(TemporalType.DATE)
    private Date dataWydania;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "rozpoznania")
    private String rozpoznania;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "wyniki_badan")
    private String wynikiBadan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "leczenie")
    private String leczenie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "epikryza")
    private String epikryza;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "zalecenia")
    private String zalecenia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "okres_niezdolnosci")
    private String okresNiezdolnosci;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "leki")
    private String leki;
    @JoinColumn(name = "szpital_kom_org", referencedColumnName = "kod_resortowy")
    @ManyToOne(optional = false)
    private SzpitalKomOrg nrKomOrg;
    @JoinColumn(name = "pracownik", referencedColumnName = "nr_PWZ")
    @ManyToOne(optional = false)
    private Pracownik nrPwzLekarz;
    @JoinColumn(name = "pacjent", referencedColumnName = "PESEL")
    @ManyToOne(optional = false)
    private Pacjent pacjent;

    public KartaInformacyjna() {
    }

    public KartaInformacyjna(Integer id) {
        this.id = id;
    }

    public KartaInformacyjna(Integer id, Date dataWydania, String rozpoznania, String wynikiBadan, String leczenie, String epikryza, String zalecenia, String okresNiezdolnosci, String leki) {
        this.id = id;
        this.dataWydania = dataWydania;
        this.rozpoznania = rozpoznania;
        this.wynikiBadan = wynikiBadan;
        this.leczenie = leczenie;
        this.epikryza = epikryza;
        this.zalecenia = zalecenia;
        this.okresNiezdolnosci = okresNiezdolnosci;
        this.leki = leki;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataWydania() {
        return dataWydania;
    }

    public void setDataWydania(Date dataWydania) {
        this.dataWydania = dataWydania;
    }

    public String getRozpoznania() {
        return rozpoznania;
    }

    public void setRozpoznania(String rozpoznania) {
        this.rozpoznania = rozpoznania;
    }

    public String getWynikiBadan() {
        return wynikiBadan;
    }

    public void setWynikiBadan(String wynikiBadan) {
        this.wynikiBadan = wynikiBadan;
    }

    public String getLeczenie() {
        return leczenie;
    }

    public void setLeczenie(String leczenie) {
        this.leczenie = leczenie;
    }

    public String getEpikryza() {
        return epikryza;
    }

    public void setEpikryza(String epikryza) {
        this.epikryza = epikryza;
    }

    public String getZalecenia() {
        return zalecenia;
    }

    public void setZalecenia(String zalecenia) {
        this.zalecenia = zalecenia;
    }

    public String getOkresNiezdolnosci() {
        return okresNiezdolnosci;
    }

    public void setOkresNiezdolnosci(String okresNiezdolnosci) {
        this.okresNiezdolnosci = okresNiezdolnosci;
    }

    public String getLeki() {
        return leki;
    }

    public void setLeki(String leki) {
        this.leki = leki;
    }

    public SzpitalKomOrg getNrKomOrg() {
        return nrKomOrg;
    }

    public void setNrKomOrg(SzpitalKomOrg nrKomOrg) {
        this.nrKomOrg = nrKomOrg;
    }

    public Pracownik getNrPwzLekarz() {
        return nrPwzLekarz;
    }

    public void setNrPwzLekarz(Pracownik nrPwzLekarz) {
        this.nrPwzLekarz = nrPwzLekarz;
    }

    public Pacjent getPacjent() {
        return pacjent;
    }

    public void setPacjent(Pacjent pacjent) {
        this.pacjent = pacjent;
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
        if (!(object instanceof KartaInformacyjna)) {
            return false;
        }
        KartaInformacyjna other = (KartaInformacyjna) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hospital.spring.model.KartaInformacyjnaLeczeniaSzpitalnego[ id=" + id + " ]";
    }

}
