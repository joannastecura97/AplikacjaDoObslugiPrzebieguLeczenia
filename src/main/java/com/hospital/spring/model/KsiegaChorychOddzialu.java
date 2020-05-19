/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.model;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author stecu
 */
@Entity
@Table(name = "ksiega_chorych_oddzialu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KsiegaChorychOddzialu.findAll", query = "SELECT k FROM KsiegaChorychOddzialu k")})
public class KsiegaChorychOddzialu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "pracownik", referencedColumnName = "nr_PWZ")
    @ManyToOne(optional = false)
    private Pracownik lekarzProw;
    @JoinColumn(name = "szpital_kom_org", referencedColumnName = "kod_resortowy")
    @ManyToOne(optional = false)
    private SzpitalKomOrg nrKomOrg;
    @JoinColumn(name = "pacjent", referencedColumnName = "PESEL")
    @ManyToOne(optional = false)
    private Pacjent pesel;
    @JoinColumn(name = "ksiega_przyjec_wypisow", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private KsiegaPrzyjecWypisow nrKsiegaPrzyjec;

    public KsiegaChorychOddzialu() {
    }

    public KsiegaChorychOddzialu(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pracownik getLekarzProw() {
        return lekarzProw;
    }

    public void setLekarzProw(Pracownik lekarzProw) {
        this.lekarzProw = lekarzProw;
    }

    public SzpitalKomOrg getNrKomOrg() {
        return nrKomOrg;
    }

    public void setNrKomOrg(SzpitalKomOrg nrKomOrg) {
        this.nrKomOrg = nrKomOrg;
    }

    public Pacjent getPesel() {
        return pesel;
    }

    public void setPesel(Pacjent pesel) {
        this.pesel = pesel;
    }

    public KsiegaPrzyjecWypisow getNrKsiegaPrzyjec() {
        return nrKsiegaPrzyjec;
    }

    public void setNrKsiegaPrzyjec(KsiegaPrzyjecWypisow nrKsiegaPrzyjec) {
        this.nrKsiegaPrzyjec = nrKsiegaPrzyjec;
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
        if (!(object instanceof KsiegaChorychOddzialu)) {
            return false;
        }
        KsiegaChorychOddzialu other = (KsiegaChorychOddzialu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hospital.spring.model.KsiegaChorychOddzialu[ id=" + id + " ]";
    }

}
