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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "wpis_do_szpitala")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WpisDoSzpitala.findAll", query = "SELECT w FROM WpisDoSzpitala w")})
public class WpisDoSzpitala implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tryb_przyjecia")
    private String trybPrzyjecia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_przyjecia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataPrzyjecia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "rozp_przez_lek_kier")
    private String rozpPrzezLekKier;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "rozp_przez_lek_przyjm")
    private String rozpPrzezLekPrzyjm;
    @JoinColumn(name = "pracownik_kier", referencedColumnName = "nr_PWZ")
    @ManyToOne(optional = false)
    private Pracownik lekarzKier;
    @JoinColumn(name = "pracownik_przyjm", referencedColumnName = "nr_PWZ")
    @ManyToOne(optional = false)
    private Pracownik lekarzPrzyjm;
    @JoinColumn(name = "historia_choroby", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private HistoriaChoroby historiaChoroby;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idWpisu")
    private Collection<KsiegaPrzyjecWypisow> ksiegaPrzyjecWypisowCollection;

    public WpisDoSzpitala() {
    }

    public WpisDoSzpitala(Integer id) {
        this.id = id;
    }

    public WpisDoSzpitala(Integer id, String trybPrzyjecia, Date dataPrzyjecia, String rozpPrzezLekKier, String rozpPrzezLekPrzyjm) {
        this.id = id;
        this.trybPrzyjecia = trybPrzyjecia;
        this.dataPrzyjecia = dataPrzyjecia;
        this.rozpPrzezLekKier = rozpPrzezLekKier;
        this.rozpPrzezLekPrzyjm = rozpPrzezLekPrzyjm;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrybPrzyjecia() {
        return trybPrzyjecia;
    }

    public void setTrybPrzyjecia(String trybPrzyjecia) {
        this.trybPrzyjecia = trybPrzyjecia;
    }

    public Date getDataPrzyjecia() {
        return dataPrzyjecia;
    }

    public void setDataPrzyjecia(Date dataPrzyjecia) {
        this.dataPrzyjecia = dataPrzyjecia;
    }

    public String getRozpPrzezLekKier() {
        return rozpPrzezLekKier;
    }

    public void setRozpPrzezLekKier(String rozpPrzezLekKier) {
        this.rozpPrzezLekKier = rozpPrzezLekKier;
    }

    public String getRozpPrzezLekPrzyjm() {
        return rozpPrzezLekPrzyjm;
    }

    public void setRozpPrzezLekPrzyjm(String rozpPrzezLekPrzyjm) {
        this.rozpPrzezLekPrzyjm = rozpPrzezLekPrzyjm;
    }

    public Pracownik getLekarzKier() {
        return lekarzKier;
    }

    public void setLekarzKier(Pracownik lekarzKier) {
        this.lekarzKier = lekarzKier;
    }

    public Pracownik getLekarzPrzyjm() {
        return lekarzPrzyjm;
    }

    public void setLekarzPrzyjm(Pracownik lekarzPrzyjm) {
        this.lekarzPrzyjm = lekarzPrzyjm;
    }

    public HistoriaChoroby getHistoriaChoroby() {
        return historiaChoroby;
    }

    public void setHistoriaChoroby(HistoriaChoroby historiaChoroby) {
        this.historiaChoroby = historiaChoroby;
    }

    @XmlTransient
    public Collection<KsiegaPrzyjecWypisow> getKsiegaPrzyjecWypisowCollection() {
        return ksiegaPrzyjecWypisowCollection;
    }

    public void setKsiegaPrzyjecWypisowCollection(Collection<KsiegaPrzyjecWypisow> ksiegaPrzyjecWypisowCollection) {
        this.ksiegaPrzyjecWypisowCollection = ksiegaPrzyjecWypisowCollection;
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
        if (!(object instanceof WpisDoSzpitala)) {
            return false;
        }
        WpisDoSzpitala other = (WpisDoSzpitala) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hospital.spring.model.WpisDoSzpitala[ id=" + id + " ]";
    }

}
