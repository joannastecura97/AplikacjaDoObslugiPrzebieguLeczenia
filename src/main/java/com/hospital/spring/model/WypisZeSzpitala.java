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
@Table(name = "wypis_ze_szpitala")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WypisZeSzpitala.findAll", query = "SELECT w FROM WypisZeSzpitala w")})
public class WypisZeSzpitala implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "rozpoznanie_kliniczne")
    private String rozpoznanieKliniczne;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nr_stat_zasadnicze")
    private String nrStatZasadnicze;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nr_stat_wspolistniejace")
    private String nrStatWspolistniejace;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "opis_zast_leczenia")
    private String opisZastLeczenia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "epikryza")
    private String epikryza;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "przyczyna_wypisu")
    private String przyczynaWypisu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_wypisu")
    @Temporal(TemporalType.DATE)
    private Date dataWypisu;
    @Column(name = "data_zgonu")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataZgonu;
    @Size(max = 500)
    @Column(name = "przyczyna_zgonu")
    private String przyczynaZgonu;
    @Size(max = 30)
    @Column(name = "nr_stat_chor_zgon")
    private String nrStatChorZgon;
    @Size(max = 500)
    @Column(name = "protokol_kom")
    private String protokolKom;
    @Size(max = 500)
    @Column(name = "sekcja_zwlok")
    private String sekcjaZwlok;
    @Size(max = 200)
    @Column(name = "dawca")
    private String dawca;
    @JoinColumn(name = "pracownik_wyp", referencedColumnName = "nr_PWZ")
    @ManyToOne(optional = false)
    private Pracownik lekarzWyp;
    @JoinColumn(name = "pracownik_zg", referencedColumnName = "nr_PWZ")
    @ManyToOne(optional = true)
    private Pracownik lekarzZg;
    @JoinColumn(name = "historia_choroby", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private HistoriaChoroby historiaChoroby;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idWypisu")
    private Collection<KsiegaPrzyjecWypisow> ksiegaPrzyjecWypisowCollection;

    public WypisZeSzpitala() {
    }

    public WypisZeSzpitala(Integer id) {
        this.id = id;
    }

    public WypisZeSzpitala(Integer id, String rozpoznanieKliniczne, String nrStatZasadnicze, String nrStatWspolistniejace, String opisZastLeczenia, String epikryza, String przyczynaWypisu, Date dataWypisu) {
        this.id = id;
        this.rozpoznanieKliniczne = rozpoznanieKliniczne;
        this.nrStatZasadnicze = nrStatZasadnicze;
        this.nrStatWspolistniejace = nrStatWspolistniejace;
        this.opisZastLeczenia = opisZastLeczenia;
        this.epikryza = epikryza;
        this.przyczynaWypisu = przyczynaWypisu;
        this.dataWypisu = dataWypisu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRozpoznanieKliniczne() {
        return rozpoznanieKliniczne;
    }

    public void setRozpoznanieKliniczne(String rozpoznanieKliniczne) {
        this.rozpoznanieKliniczne = rozpoznanieKliniczne;
    }

    public String getNrStatZasadnicze() {
        return nrStatZasadnicze;
    }

    public void setNrStatZasadnicze(String nrStatZasadnicze) {
        this.nrStatZasadnicze = nrStatZasadnicze;
    }

    public String getNrStatWspolistniejace() {
        return nrStatWspolistniejace;
    }

    public void setNrStatWspolistniejace(String nrStatWspolistniejace) {
        this.nrStatWspolistniejace = nrStatWspolistniejace;
    }

    public String getOpisZastLeczenia() {
        return opisZastLeczenia;
    }

    public void setOpisZastLeczenia(String opisZastLeczenia) {
        this.opisZastLeczenia = opisZastLeczenia;
    }

    public String getEpikryza() {
        return epikryza;
    }

    public void setEpikryza(String epikryza) {
        this.epikryza = epikryza;
    }

    public String getPrzyczynaWypisu() {
        return przyczynaWypisu;
    }

    public void setPrzyczynaWypisu(String przyczynaWypisu) {
        this.przyczynaWypisu = przyczynaWypisu;
    }

    public Date getDataWypisu() {
        return dataWypisu;
    }

    public void setDataWypisu(Date dataWypisu) {
        this.dataWypisu = dataWypisu;
    }

    public Date getDataZgonu() {
        return dataZgonu;
    }

    public void setDataZgonu(Date dataZgonu) {
        this.dataZgonu = dataZgonu;
    }

    public String getPrzyczynaZgonu() {
        return przyczynaZgonu;
    }

    public void setPrzyczynaZgonu(String przyczynaZgonu) {
        this.przyczynaZgonu = przyczynaZgonu;
    }

    public String getNrStatChorZgon() {
        return nrStatChorZgon;
    }

    public void setNrStatChorZgon(String nrStatChorZgon) {
        this.nrStatChorZgon = nrStatChorZgon;
    }

    public String getProtokolKom() {
        return protokolKom;
    }

    public void setProtokolKom(String protokolKom) {
        this.protokolKom = protokolKom;
    }

    public String getSekcjaZwlok() {
        return sekcjaZwlok;
    }

    public void setSekcjaZwlok(String sekcjaZwlok) {
        this.sekcjaZwlok = sekcjaZwlok;
    }

    public String getDawca() {
        return dawca;
    }

    public void setDawca(String dawca) {
        this.dawca = dawca;
    }

    public Pracownik getLekarzWyp() {
        return lekarzWyp;
    }

    public void setLekarzWyp(Pracownik lekarzWyp) {
        this.lekarzWyp = lekarzWyp;
    }

    public Pracownik getLekarzZg() {
        return lekarzZg;
    }

    public void setLekarzZg(Pracownik lekarzZg) {
        this.lekarzZg = lekarzZg;
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
        if (!(object instanceof WypisZeSzpitala)) {
            return false;
        }
        WypisZeSzpitala other = (WypisZeSzpitala) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hospital.spring.model.WypisZeSzpitala[ id=" + id + " ]";
    }

}
