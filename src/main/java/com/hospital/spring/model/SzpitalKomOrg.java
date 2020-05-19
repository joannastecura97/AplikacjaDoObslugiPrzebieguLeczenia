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
@Table(name = "szpital_kom_org")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SzpitalKomOrg.findAll", query = "SELECT s FROM SzpitalKomOrg s")})
public class SzpitalKomOrg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "kod_resortowy")
    private String kodResortowy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nazwa")
    private String nazwa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nrKomOrg")
    private Collection<KsiegaChorychOddzialu> ksiegaChorychOddzialuCollection;
    @JoinColumn(name = "szpital_jedn_org", referencedColumnName = "kod_resortowy")
    @ManyToOne(optional = false)
    private SzpitalJednOrg kodResortowyJednOrg;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nrKomOrg")
    private Collection<KartaInformacyjna> kartaInformacyjnaLeczeniaSzpitalnegoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nrKomOrg")
    private Collection<WywiadPielegniarski> wywiadPielegniarskiCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nrKomOrg")
    private Collection<KsiegaRaportowLekarskich> ksiegaRaportowLekarskichCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nrResortowyKom")
    private Collection<KsiegaPrzyjecWypisow> ksiegaPrzyjecWypisowCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nrKomOrg")
    private Collection<RaportPielegniarski> raportPielegniarskiCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nrKomOrg")
    private Collection<KsiegaZabiegow> ksiegaZabiegowCollection;

    public SzpitalKomOrg() {
    }

    public SzpitalKomOrg(String kodResortowy) {
        this.kodResortowy = kodResortowy;
    }

    public SzpitalKomOrg(String kodResortowy, String nazwa) {
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
    public Collection<KsiegaChorychOddzialu> getKsiegaChorychOddzialuCollection() {
        return ksiegaChorychOddzialuCollection;
    }

    public void setKsiegaChorychOddzialuCollection(Collection<KsiegaChorychOddzialu> ksiegaChorychOddzialuCollection) {
        this.ksiegaChorychOddzialuCollection = ksiegaChorychOddzialuCollection;
    }

    public SzpitalJednOrg getKodResortowyJednOrg() {
        return kodResortowyJednOrg;
    }

    public void setKodResortowyJednOrg(SzpitalJednOrg kodResortowyJednOrg) {
        this.kodResortowyJednOrg = kodResortowyJednOrg;
    }

    @XmlTransient
    public Collection<KartaInformacyjna> getKartaInformacyjnaLeczeniaSzpitalnegoCollection() {
        return kartaInformacyjnaLeczeniaSzpitalnegoCollection;
    }

    public void setKartaInformacyjnaLeczeniaSzpitalnegoCollection(Collection<KartaInformacyjna> kartaInformacyjnaLeczeniaSzpitalnegoCollection) {
        this.kartaInformacyjnaLeczeniaSzpitalnegoCollection = kartaInformacyjnaLeczeniaSzpitalnegoCollection;
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
        hash += (kodResortowy != null ? kodResortowy.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SzpitalKomOrg)) {
            return false;
        }
        SzpitalKomOrg other = (SzpitalKomOrg) object;
        if ((this.kodResortowy == null && other.kodResortowy != null) || (this.kodResortowy != null && !this.kodResortowy.equals(other.kodResortowy))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hospital.spring.model.SzpitalKomOrg[ kodResortowy=" + kodResortowy + " ]";
    }

}
