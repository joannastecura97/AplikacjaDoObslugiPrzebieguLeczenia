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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "szpital_jedn_org")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SzpitalJednOrg.findAll", query = "SELECT s FROM SzpitalJednOrg s")})
public class SzpitalJednOrg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "kod_resortowy")
    private String kodResortowy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nazwa")
    private String nazwa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kodResortowyJednOrg")
    private Collection<SzpitalKomOrg> szpitalKomOrgCollection;
    @JoinColumn(name = "szpital_podmiot", referencedColumnName = "nr_ksiegi_rejestrowej_zakladu")
    @ManyToOne(optional = false)
    private SzpitalPodmiot nrKsiegiRejestrowejZakladu;

    public SzpitalJednOrg() {
    }

    public SzpitalJednOrg(String kodResortowy) {
        this.kodResortowy = kodResortowy;
    }

    public SzpitalJednOrg(String kodResortowy, String nazwa) {
        this.kodResortowy = kodResortowy;
        this.nazwa = nazwa;
    }

    public String getKodResortowy() {
        return kodResortowy;
    }

    public void setKodResortowy(String kodResortowy) {
        this.kodResortowy = kodResortowy;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @XmlTransient
    public Collection<SzpitalKomOrg> getSzpitalKomOrgCollection() {
        return szpitalKomOrgCollection;
    }

    public void setSzpitalKomOrgCollection(Collection<SzpitalKomOrg> szpitalKomOrgCollection) {
        this.szpitalKomOrgCollection = szpitalKomOrgCollection;
    }

    public SzpitalPodmiot getNrKsiegiRejestrowejZakladu() {
        return nrKsiegiRejestrowejZakladu;
    }

    public void setNrKsiegiRejestrowejZakladu(SzpitalPodmiot nrKsiegiRejestrowejZakladu) {
        this.nrKsiegiRejestrowejZakladu = nrKsiegiRejestrowejZakladu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodResortowy != null ? kodResortowy.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SzpitalJednOrg)) {
            return false;
        }
        SzpitalJednOrg other = (SzpitalJednOrg) object;
        if ((this.kodResortowy == null && other.kodResortowy != null) || (this.kodResortowy != null && !this.kodResortowy.equals(other.kodResortowy))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hospital.spring.model.SzpitalJednOrg[ kodResortowy=" + kodResortowy + " ]";
    }

}
