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
@Table(name = "przebieg_hospitalizacji")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PrzebiegHospitalizacji.findAll", query = "SELECT p FROM PrzebiegHospitalizacji p")})
public class PrzebiegHospitalizacji implements Serializable {

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
    @Size(min = 1, max = 500)
    @Column(name = "przebieg_choroby")
    private String przebiegChoroby;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "leczenie")
    private String leczenie;
    @JoinColumn(name = "pracownik", referencedColumnName = "nr_PWZ")
    @ManyToOne(optional = false)
    private Pracownik lekarz;
    @JoinColumn(name = "historia_choroby", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private HistoriaChoroby historiaChoroby;

    public PrzebiegHospitalizacji() {
    }

    public PrzebiegHospitalizacji(Integer id) {
        this.id = id;
    }

    public PrzebiegHospitalizacji(Integer id, Date data, String przebiegChoroby, String leczenie) {
        this.id = id;
        this.data = data;
        this.przebiegChoroby = przebiegChoroby;
        this.leczenie = leczenie;
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

    public String getPrzebiegChoroby() {
        return przebiegChoroby;
    }

    public void setPrzebiegChoroby(String przebiegChoroby) {
        this.przebiegChoroby = przebiegChoroby;
    }

    public String getLeczenie() {
        return leczenie;
    }

    public void setLeczenie(String leczenie) {
        this.leczenie = leczenie;
    }

    public Pracownik getLekarz() {
        return lekarz;
    }

    public void setLekarz(Pracownik lekarz) {
        this.lekarz = lekarz;
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
        if (!(object instanceof PrzebiegHospitalizacji)) {
            return false;
        }
        PrzebiegHospitalizacji other = (PrzebiegHospitalizacji) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hospital.spring.model.PrzebiegHospitalizacji[ id=" + id + " ]";
    }

}
