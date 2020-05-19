package com.hospital.spring.model;

import com.hospital.spring.model.KsiegaRaportowPielegniarskich;
import com.hospital.spring.model.Pacjent;
import com.hospital.spring.model.Pracownik;
import com.hospital.spring.model.SzpitalKomOrg;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-25T16:09:40")
@StaticMetamodel(RaportPielegniarski.class)
public class RaportPielegniarski_ { 

    public static volatile SingularAttribute<RaportPielegniarski, String> skora;
    public static volatile SingularAttribute<RaportPielegniarski, String> aktywnosc;
    public static volatile SingularAttribute<RaportPielegniarski, String> diagnozaLekarska;
    public static volatile SingularAttribute<RaportPielegniarski, String> ukladKrazenia;
    public static volatile SingularAttribute<RaportPielegniarski, String> ukladPokarmowy;
    public static volatile SingularAttribute<RaportPielegniarski, String> stanOgolny;
    public static volatile SingularAttribute<RaportPielegniarski, String> ukladMoczowy;
    public static volatile SingularAttribute<RaportPielegniarski, Date> data;
    public static volatile SingularAttribute<RaportPielegniarski, String> higiena;
    public static volatile SingularAttribute<RaportPielegniarski, KsiegaRaportowPielegniarskich> ksiegaRapPiel;
    public static volatile SingularAttribute<RaportPielegniarski, Pracownik> pielegniarka;
    public static volatile SingularAttribute<RaportPielegniarski, String> sluch;
    public static volatile SingularAttribute<RaportPielegniarski, String> usprawnienieBezpieczenstwo;
    public static volatile SingularAttribute<RaportPielegniarski, String> wzrok;
    public static volatile SingularAttribute<RaportPielegniarski, String> inne;
    public static volatile SingularAttribute<RaportPielegniarski, SzpitalKomOrg> nrKomOrg;
    public static volatile SingularAttribute<RaportPielegniarski, String> parametryZyciowe;
    public static volatile SingularAttribute<RaportPielegniarski, String> zachowanie;
    public static volatile SingularAttribute<RaportPielegniarski, String> ukladOddechowy;
    public static volatile SingularAttribute<RaportPielegniarski, String> terapiaDozylna;
    public static volatile SingularAttribute<RaportPielegniarski, Pacjent> pacjent;
    public static volatile SingularAttribute<RaportPielegniarski, String> przygotowanieDoBadan;
    public static volatile SingularAttribute<RaportPielegniarski, Integer> id;
    public static volatile SingularAttribute<RaportPielegniarski, String> bol;

}