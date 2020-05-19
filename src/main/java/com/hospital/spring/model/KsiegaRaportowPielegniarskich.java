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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author stecu
 */
@Entity
@Table(name = "ksiega_raportow_pielegniarskich")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KsiegaRaportowPielegniarskich.findAll", query = "SELECT k FROM KsiegaRaportowPielegniarskich k")})
public class KsiegaRaportowPielegniarskich implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @NotNull
    @Column(name = "osoby_przyjete")
    private int osobyPrzyjete;
    @Basic(optional = false)
    @NotNull
    @Column(name = "osoby_wypisane")
    private int osobyWypisane;
    @Basic(optional = false)
    @NotNull
    @Column(name = "osoby_zmarle")
    private int osobyZmarle;
    @JoinColumn(name = "pracownik", referencedColumnName = "nr_PWZ")
    @ManyToOne(optional = false)
    private Pracownik pielegniarka;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ksiegaRapPiel")
    private Collection<RaportPielegniarski> raportPielegniarskiCollection;

    public KsiegaRaportowPielegniarskich() {
    }

    public KsiegaRaportowPielegniarskich(Integer id) {
        this.id = id;
    }

    public KsiegaRaportowPielegniarskich(Integer id, Date data, int osobyPrzyjete, int osobyWypisane, int osobyZmarle) {
        this.id = id;
        this.data = data;
        this.osobyPrzyjete = osobyPrzyjete;
        this.osobyWypisane = osobyWypisane;
        this.osobyZmarle = osobyZmarle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getOsobyPrzyjete() {
        return osobyPrzyjete;
    }

    public void setOsobyPrzyjete(int osobyPrzyjete) {
        this.osobyPrzyjete = osobyPrzyjete;
    }

    public int getOsobyWypisane() {
        return osobyWypisane;
    }

    public void setOsobyWypisane(int osobyWypisane) {
        this.osobyWypisane = osobyWypisane;
    }

    public int getOsobyZmarle() {
        return osobyZmarle;
    }

    public void setOsobyZmarle(int osobyZmarle) {
        this.osobyZmarle = osobyZmarle;
    }

    public Pracownik getPielegniarka() {
        return pielegniarka;
    }

    public void setPielegniarka(Pracownik pielegniarka) {
        this.pielegniarka = pielegniarka;
    }

    @XmlTransient
    public Collection<RaportPielegniarski> getRaportPielegniarskiCollection() {
        return raportPielegniarskiCollection;
    }

    public void setRaportPielegniarskiCollection(Collection<RaportPielegniarski> raportPielegniarskiCollection) {
        this.raportPielegniarskiCollection = raportPielegniarskiCollection;
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
        if (!(object instanceof KsiegaRaportowPielegniarskich)) {
            return false;
        }
        KsiegaRaportowPielegniarskich other = (KsiegaRaportowPielegniarskich) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hospital.spring.model.KsiegaRaportowPielegniarskich[ id=" + id + " ]";
    }

}
