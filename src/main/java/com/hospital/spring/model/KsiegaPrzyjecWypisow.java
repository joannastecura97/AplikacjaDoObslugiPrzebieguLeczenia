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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "ksiega_przyjec_wypisow")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KsiegaPrzyjecWypisow.findAll", query = "SELECT k FROM KsiegaPrzyjecWypisow k")})
public class KsiegaPrzyjecWypisow implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 300)
    @Column(name = "rozp_onkologiczne")
    private String rozpOnkologiczne;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "miejsce_gdzie_zostal_wypisany")
    private String miejsceGdzieZostalWypisany;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "transport_sanitarny")
    private String transportSanitarny;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "okolicznosci_tr")
    private String okolicznosciTr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "pobranie_oplat")
    private String pobranieOplat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nr_karty_depozytowej")
    private String nrKartyDepozytowej;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nrKsiegaPrzyjec")
    private Collection<KsiegaChorychOddzialu> ksiegaChorychOddzialuCollection;
    @JoinColumn(name = "pacjent", referencedColumnName = "PESEL")
    @ManyToOne(optional = false)
    private Pacjent pesel;
    @JoinColumn(name = "wpis_do_szpitala", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private WpisDoSzpitala idWpisu;
    @JoinColumn(name = "wypis_ze_szpitala", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private WypisZeSzpitala idWypisu;
    @JoinColumn(name = "szpital_kom_org", referencedColumnName = "kod_resortowy")
    @ManyToOne(optional = false)
    private SzpitalKomOrg nrResortowyKom;
    @JoinColumn(name = "pracownik", referencedColumnName = "nr_PWZ")
    @ManyToOne(optional = false)
    private Pracownik nrPwzLekarz;

    public KsiegaPrzyjecWypisow() {
    }

    public KsiegaPrzyjecWypisow(Integer id) {
        this.id = id;
    }

    public KsiegaPrzyjecWypisow(Integer id, String miejsceGdzieZostalWypisany, String transportSanitarny, String okolicznosciTr, String pobranieOplat, String nrKartyDepozytowej) {
        this.id = id;
        this.miejsceGdzieZostalWypisany = miejsceGdzieZostalWypisany;
        this.transportSanitarny = transportSanitarny;
        this.okolicznosciTr = okolicznosciTr;
        this.pobranieOplat = pobranieOplat;
        this.nrKartyDepozytowej = nrKartyDepozytowej;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRozpOnkologiczne() {
        return rozpOnkologiczne;
    }

    public void setRozpOnkologiczne(String rozpOnkologiczne) {
        this.rozpOnkologiczne = rozpOnkologiczne;
    }

    public String getMiejsceGdzieZostalWypisany() {
        return miejsceGdzieZostalWypisany;
    }

    public void setMiejsceGdzieZostalWypisany(String miejsceGdzieZostalWypisany) {
        this.miejsceGdzieZostalWypisany = miejsceGdzieZostalWypisany;
    }

    public String getTransportSanitarny() {
        return transportSanitarny;
    }

    public void setTransportSanitarny(String transportSanitarny) {
        this.transportSanitarny = transportSanitarny;
    }

    public String getOkolicznosciTr() {
        return okolicznosciTr;
    }

    public void setOkolicznosciTr(String okolicznosciTr) {
        this.okolicznosciTr = okolicznosciTr;
    }

    public String getPobranieOplat() {
        return pobranieOplat;
    }

    public void setPobranieOplat(String pobranieOplat) {
        this.pobranieOplat = pobranieOplat;
    }

    public String getNrKartyDepozytowej() {
        return nrKartyDepozytowej;
    }

    public void setNrKartyDepozytowej(String nrKartyDepozytowej) {
        this.nrKartyDepozytowej = nrKartyDepozytowej;
    }

    @XmlTransient
    public Collection<KsiegaChorychOddzialu> getKsiegaChorychOddzialuCollection() {
        return ksiegaChorychOddzialuCollection;
    }

    public void setKsiegaChorychOddzialuCollection(Collection<KsiegaChorychOddzialu> ksiegaChorychOddzialuCollection) {
        this.ksiegaChorychOddzialuCollection = ksiegaChorychOddzialuCollection;
    }

    public Pacjent getPesel() {
        return pesel;
    }

    public void setPesel(Pacjent pesel) {
        this.pesel = pesel;
    }

    public WpisDoSzpitala getIdWpisu() {
        return idWpisu;
    }

    public void setIdWpisu(WpisDoSzpitala idWpisu) {
        this.idWpisu = idWpisu;
    }

    public WypisZeSzpitala getIdWypisu() {
        return idWypisu;
    }

    public void setIdWypisu(WypisZeSzpitala idWypisu) {
        this.idWypisu = idWypisu;
    }

    public SzpitalKomOrg getNrResortowyKom() {
        return nrResortowyKom;
    }

    public void setNrResortowyKom(SzpitalKomOrg nrResortowyKom) {
        this.nrResortowyKom = nrResortowyKom;
    }

    public Pracownik getNrPwzLekarz() {
        return nrPwzLekarz;
    }

    public void setNrPwzLekarz(Pracownik nrPwzLekarz) {
        this.nrPwzLekarz = nrPwzLekarz;
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
        if (!(object instanceof KsiegaPrzyjecWypisow)) {
            return false;
        }
        KsiegaPrzyjecWypisow other = (KsiegaPrzyjecWypisow) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hospital.spring.model.KsiegaPrzyjecWypisow[ id=" + id + " ]";
    }

}
