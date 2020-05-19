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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author stecu
 */
@Entity
@Table(name = "osoba_upowazniona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OsobaUpowazniona.findAll", query = "SELECT o FROM OsobaUpowazniona o")})
public class OsobaUpowazniona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "imie")
    private String imie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nazwisko")
    private String nazwisko;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "adres")
    private String adres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "nr_telefonu")
    private String nrTelefonu;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "historia_choroby", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private HistoriaChoroby historiaChoroby;

    public OsobaUpowazniona() {
    }

    public OsobaUpowazniona(Integer id) {
        this.id = id;
    }

    public OsobaUpowazniona(Integer id, String imie, String nazwisko, String adres, String nrTelefonu) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.nrTelefonu = nrTelefonu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public HistoriaChoroby getHistoriaChoroby() {
        return historiaChoroby;
    }

    public void setHistoriaChoroby(HistoriaChoroby historiaChoroby) {
        this.historiaChoroby = historiaChoroby;
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
        if (!(object instanceof OsobaUpowazniona)) {
            return false;
        }
        OsobaUpowazniona other = (OsobaUpowazniona) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hospital.spring.model.OsobaUpowazniona[ id=" + id + " ]";
    }

}
