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
@Table(name = "szpital_podmiot")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SzpitalPodmiot.findAll", query = "SELECT s FROM SzpitalPodmiot s")})
public class SzpitalPodmiot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "nr_ksiegi_rejestrowej_zakladu")
    private String nrKsiegiRejestrowejZakladu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "REGON")
    private String regon;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "nazwa")
    private String nazwa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "adres")
    private String adres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nr_telefonu")
    private String nrTelefonu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nrKsiegiRejestrowejZakladu")
    private Collection<SzpitalJednOrg> szpitalJednOrgCollection;

    public SzpitalPodmiot() {
    }

    public SzpitalPodmiot(String nrKsiegiRejestrowejZakladu) {
        this.nrKsiegiRejestrowejZakladu = nrKsiegiRejestrowejZakladu;
    }

    public SzpitalPodmiot(String nrKsiegiRejestrowejZakladu, String regon, String nazwa, String adres, String nrTelefonu) {
        this.nrKsiegiRejestrowejZakladu = nrKsiegiRejestrowejZakladu;
        this.regon = regon;
        this.nazwa = nazwa;
        this.adres = adres;
        this.nrTelefonu = nrTelefonu;
    }

    public String getNrKsiegiRejestrowejZakladu() {
        return nrKsiegiRejestrowejZakladu;
    }

    public void setNrKsiegiRejestrowejZakladu(String nrKsiegiRejestrowejZakladu) {
        this.nrKsiegiRejestrowejZakladu = nrKsiegiRejestrowejZakladu;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    @XmlTransient
    public Collection<SzpitalJednOrg> getSzpitalJednOrgCollection() {
        return szpitalJednOrgCollection;
    }

    public void setSzpitalJednOrgCollection(Collection<SzpitalJednOrg> szpitalJednOrgCollection) {
        this.szpitalJednOrgCollection = szpitalJednOrgCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrKsiegiRejestrowejZakladu != null ? nrKsiegiRejestrowejZakladu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SzpitalPodmiot)) {
            return false;
        }
        SzpitalPodmiot other = (SzpitalPodmiot) object;
        if ((this.nrKsiegiRejestrowejZakladu == null && other.nrKsiegiRejestrowejZakladu != null) || (this.nrKsiegiRejestrowejZakladu != null && !this.nrKsiegiRejestrowejZakladu.equals(other.nrKsiegiRejestrowejZakladu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hospital.spring.model.SzpitalPodmiot[ nrKsiegiRejestrowejZakladu=" + nrKsiegiRejestrowejZakladu + " ]";
    }

}
