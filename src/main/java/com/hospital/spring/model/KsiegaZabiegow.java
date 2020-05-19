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
@Table(name = "ksiega_zabiegow")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KsiegaZabiegow.findAll", query = "SELECT k FROM KsiegaZabiegow k")})
public class KsiegaZabiegow implements Serializable {

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
    @Size(min = 1, max = 200)
    @Column(name = "rodzaj_zabiegu")
    private String rodzajZabiegu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "przebieg_zabiegu")
    private String przebiegZabiegu;
    @JoinColumn(name = "pracownik_zlec", referencedColumnName = "nr_PWZ")
    @ManyToOne(optional = false)
    private Pracownik lekarzZlec;
    @JoinColumn(name = "szpital_kom_org", referencedColumnName = "kod_resortowy")
    @ManyToOne(optional = false)
    private SzpitalKomOrg nrKomOrg;
    @JoinColumn(name = "pracownik_wyk", referencedColumnName = "nr_PWZ")
    @ManyToOne(optional = false)
    private Pracownik pracownikWyk;
    @JoinColumn(name = "pacjent", referencedColumnName = "PESEL")
    @ManyToOne(optional = false)
    private Pacjent pacjent;

    public KsiegaZabiegow() {
    }

    public KsiegaZabiegow(Integer id) {
        this.id = id;
    }

    public KsiegaZabiegow(Integer id, Date data, String rodzajZabiegu, String przebiegZabiegu) {
        this.id = id;
        this.data = data;
        this.rodzajZabiegu = rodzajZabiegu;
        this.przebiegZabiegu = przebiegZabiegu;
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

    public String getRodzajZabiegu() {
        return rodzajZabiegu;
    }

    public void setRodzajZabiegu(String rodzajZabiegu) {
        this.rodzajZabiegu = rodzajZabiegu;
    }

    public String getPrzebiegZabiegu() {
        return przebiegZabiegu;
    }

    public void setPrzebiegZabiegu(String przebiegZabiegu) {
        this.przebiegZabiegu = przebiegZabiegu;
    }

    public Pracownik getLekarzZlec() {
        return lekarzZlec;
    }

    public void setLekarzZlec(Pracownik lekarzZlec) {
        this.lekarzZlec = lekarzZlec;
    }

    public SzpitalKomOrg getNrKomOrg() {
        return nrKomOrg;
    }

    public void setNrKomOrg(SzpitalKomOrg nrKomOrg) {
        this.nrKomOrg = nrKomOrg;
    }

    public Pracownik getPracownikWyk() {
        return pracownikWyk;
    }

    public void setPracownikWyk(Pracownik pracownikWyk) {
        this.pracownikWyk = pracownikWyk;
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
        if (!(object instanceof KsiegaZabiegow)) {
            return false;
        }
        KsiegaZabiegow other = (KsiegaZabiegow) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hospital.spring.model.KsiegaZabiegow[ id=" + id + " ]";
    }

}
