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
@Table(name = "raport_pielegniarski")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RaportPielegniarski.findAll", query = "SELECT r FROM RaportPielegniarski r")})
public class RaportPielegniarski implements Serializable {

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
    @Column(name = "diagnoza_lekarska")
    private String diagnozaLekarska;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "stan_ogolny")
    private String stanOgolny;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "aktywnosc")
    private String aktywnosc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "parametry_zyciowe")
    private String parametryZyciowe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "bol")
    private String bol;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "zachowanie")
    private String zachowanie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "wzrok")
    private String wzrok;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "sluch")
    private String sluch;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "uklad_oddechowy")
    private String ukladOddechowy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "uklad_krazenia")
    private String ukladKrazenia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "uklad_pokarmowy")
    private String ukladPokarmowy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "uklad_moczowy")
    private String ukladMoczowy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "skora")
    private String skora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "usprawnienie_bezpieczenstwo")
    private String usprawnienieBezpieczenstwo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "terapia_dozylna")
    private String terapiaDozylna;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "higiena")
    private String higiena;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "przygotowanie_do_badan")
    private String przygotowanieDoBadan;
    @Size(max = 500)
    @Column(name = "inne")
    private String inne;
    @JoinColumn(name = "szpital_kom_org", referencedColumnName = "kod_resortowy")
    @ManyToOne(optional = false)
    private SzpitalKomOrg nrKomOrg;
    @JoinColumn(name = "pacjent", referencedColumnName = "PESEL")
    @ManyToOne(optional = false)
    private Pacjent pacjent;
    @JoinColumn(name = "pracownik", referencedColumnName = "nr_PWZ")
    @ManyToOne(optional = false)
    private Pracownik pielegniarka;
    @JoinColumn(name = "ksiega_raportow_pielegniarskich", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private KsiegaRaportowPielegniarskich ksiegaRapPiel;

    public RaportPielegniarski() {
    }

    public RaportPielegniarski(Integer id) {
        this.id = id;
    }

    public RaportPielegniarski(Integer id, Date data, String diagnozaLekarska, String stanOgolny, String aktywnosc, String parametryZyciowe, String bol, String zachowanie, String wzrok, String sluch, String ukladOddechowy, String ukladKrazenia, String ukladPokarmowy, String ukladMoczowy, String skora, String usprawnienieBezpieczenstwo, String terapiaDozylna, String higiena, String przygotowanieDoBadan) {
        this.id = id;
        this.data = data;
        this.diagnozaLekarska = diagnozaLekarska;
        this.stanOgolny = stanOgolny;
        this.aktywnosc = aktywnosc;
        this.parametryZyciowe = parametryZyciowe;
        this.bol = bol;
        this.zachowanie = zachowanie;
        this.wzrok = wzrok;
        this.sluch = sluch;
        this.ukladOddechowy = ukladOddechowy;
        this.ukladKrazenia = ukladKrazenia;
        this.ukladPokarmowy = ukladPokarmowy;
        this.ukladMoczowy = ukladMoczowy;
        this.skora = skora;
        this.usprawnienieBezpieczenstwo = usprawnienieBezpieczenstwo;
        this.terapiaDozylna = terapiaDozylna;
        this.higiena = higiena;
        this.przygotowanieDoBadan = przygotowanieDoBadan;
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

    public String getDiagnozaLekarska() {
        return diagnozaLekarska;
    }

    public void setDiagnozaLekarska(String diagnozaLekarska) {
        this.diagnozaLekarska = diagnozaLekarska;
    }

    public String getStanOgolny() {
        return stanOgolny;
    }

    public void setStanOgolny(String stanOgolny) {
        this.stanOgolny = stanOgolny;
    }

    public String getAktywnosc() {
        return aktywnosc;
    }

    public void setAktywnosc(String aktywnosc) {
        this.aktywnosc = aktywnosc;
    }

    public String getParametryZyciowe() {
        return parametryZyciowe;
    }

    public void setParametryZyciowe(String parametryZyciowe) {
        this.parametryZyciowe = parametryZyciowe;
    }

    public String getBol() {
        return bol;
    }

    public void setBol(String bol) {
        this.bol = bol;
    }

    public String getZachowanie() {
        return zachowanie;
    }

    public void setZachowanie(String zachowanie) {
        this.zachowanie = zachowanie;
    }

    public String getWzrok() {
        return wzrok;
    }

    public void setWzrok(String wzrok) {
        this.wzrok = wzrok;
    }

    public String getSluch() {
        return sluch;
    }

    public void setSluch(String sluch) {
        this.sluch = sluch;
    }

    public String getUkladOddechowy() {
        return ukladOddechowy;
    }

    public void setUkladOddechowy(String ukladOddechowy) {
        this.ukladOddechowy = ukladOddechowy;
    }

    public String getUkladKrazenia() {
        return ukladKrazenia;
    }

    public void setUkladKrazenia(String ukladKrazenia) {
        this.ukladKrazenia = ukladKrazenia;
    }

    public String getUkladPokarmowy() {
        return ukladPokarmowy;
    }

    public void setUkladPokarmowy(String ukladPokarmowy) {
        this.ukladPokarmowy = ukladPokarmowy;
    }

    public String getUkladMoczowy() {
        return ukladMoczowy;
    }

    public void setUkladMoczowy(String ukladMoczowy) {
        this.ukladMoczowy = ukladMoczowy;
    }

    public String getSkora() {
        return skora;
    }

    public void setSkora(String skora) {
        this.skora = skora;
    }

    public String getUsprawnienieBezpieczenstwo() {
        return usprawnienieBezpieczenstwo;
    }

    public void setUsprawnienieBezpieczenstwo(String usprawnienieBezpieczenstwo) {
        this.usprawnienieBezpieczenstwo = usprawnienieBezpieczenstwo;
    }

    public String getTerapiaDozylna() {
        return terapiaDozylna;
    }

    public void setTerapiaDozylna(String terapiaDozylna) {
        this.terapiaDozylna = terapiaDozylna;
    }

    public String getHigiena() {
        return higiena;
    }

    public void setHigiena(String higiena) {
        this.higiena = higiena;
    }

    public String getPrzygotowanieDoBadan() {
        return przygotowanieDoBadan;
    }

    public void setPrzygotowanieDoBadan(String przygotowanieDoBadan) {
        this.przygotowanieDoBadan = przygotowanieDoBadan;
    }

    public String getInne() {
        return inne;
    }

    public void setInne(String inne) {
        this.inne = inne;
    }

    public SzpitalKomOrg getNrKomOrg() {
        return nrKomOrg;
    }

    public void setNrKomOrg(SzpitalKomOrg nrKomOrg) {
        this.nrKomOrg = nrKomOrg;
    }

    public Pacjent getPacjent() {
        return pacjent;
    }

    public void setPacjent(Pacjent pacjent) {
        this.pacjent = pacjent;
    }

    public Pracownik getPielegniarka() {
        return pielegniarka;
    }

    public void setPielegniarka(Pracownik pielegniarka) {
        this.pielegniarka = pielegniarka;
    }

    public KsiegaRaportowPielegniarskich getKsiegaRapPiel() {
        return ksiegaRapPiel;
    }

    public void setKsiegaRapPiel(KsiegaRaportowPielegniarskich ksiegaRapPiel) {
        this.ksiegaRapPiel = ksiegaRapPiel;
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
        if (!(object instanceof RaportPielegniarski)) {
            return false;
        }
        RaportPielegniarski other = (RaportPielegniarski) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hospital.spring.model.RaportPielegniarski[ id=" + id + " ]";
    }

}
