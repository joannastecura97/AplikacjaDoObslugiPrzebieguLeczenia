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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author stecu
 */
@Entity
@Table(name = "historia_choroby")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoriaChoroby.findAll", query = "SELECT h FROM HistoriaChoroby h")})
public class HistoriaChoroby implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "historiaChoroby")
    private Collection<WpisDoSzpitala> wpisDoSzpitalaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "historiaChoroby")
    private Collection<OsobaUpowazniona> osobaUpowaznionaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "historiaChoroby")
    private Collection<PrzebiegHospitalizacji> przebiegHospitalizacjiCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "historiaChoroby")
    private Collection<WypisZeSzpitala> wypisZeSzpitalaCollection;
    @JoinColumn(name = "pacjent", referencedColumnName = "PESEL")
    @ManyToOne(optional = false)
    private Pacjent pacjent;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "historiaChoroby")
    private Collection<WywiadPielegniarski> wywiadPielegniarskiCollection;

    public HistoriaChoroby() {
    }

    public HistoriaChoroby(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @XmlTransient
    public Collection<WpisDoSzpitala> getWpisDoSzpitalaCollection() {
        return wpisDoSzpitalaCollection;
    }

    public void setWpisDoSzpitalaCollection(Collection<WpisDoSzpitala> wpisDoSzpitalaCollection) {
        this.wpisDoSzpitalaCollection = wpisDoSzpitalaCollection;
    }

    @XmlTransient
    public Collection<OsobaUpowazniona> getOsobaUpowaznionaCollection() {
        return osobaUpowaznionaCollection;
    }

    public void setOsobaUpowaznionaCollection(Collection<OsobaUpowazniona> osobaUpowaznionaCollection) {
        this.osobaUpowaznionaCollection = osobaUpowaznionaCollection;
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

    public Pacjent getPacjent() {
        return pacjent;
    }

    public void setPacjent(Pacjent pacjent) {
        this.pacjent = pacjent;
    }

    @XmlTransient
    public Collection<WywiadPielegniarski> getWywiadPielegniarskiCollection() {
        return wywiadPielegniarskiCollection;
    }

    public void setWywiadPielegniarskiCollection(Collection<WywiadPielegniarski> wywiadPielegniarskiCollection) {
        this.wywiadPielegniarskiCollection = wywiadPielegniarskiCollection;
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
        if (!(object instanceof HistoriaChoroby)) {
            return false;
        }
        HistoriaChoroby other = (HistoriaChoroby) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hospital.spring.model.HistoriaChoroby[ id=" + id + " ]";
    }

}
