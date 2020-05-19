package com.hospital.spring.model;

import com.hospital.spring.model.KartaInformacyjna;
import com.hospital.spring.model.KsiegaChorychOddzialu;
import com.hospital.spring.model.KsiegaPrzyjecWypisow;
import com.hospital.spring.model.KsiegaRaportowLekarskich;
import com.hospital.spring.model.KsiegaZabiegow;
import com.hospital.spring.model.RaportPielegniarski;
import com.hospital.spring.model.SzpitalJednOrg;
import com.hospital.spring.model.WywiadPielegniarski;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-25T16:09:40")
@StaticMetamodel(SzpitalKomOrg.class)
public class SzpitalKomOrg_ { 

    public static volatile CollectionAttribute<SzpitalKomOrg, KsiegaRaportowLekarskich> ksiegaRaportowLekarskichCollection;
    public static volatile SingularAttribute<SzpitalKomOrg, SzpitalJednOrg> kodResortowyJednOrg;
    public static volatile CollectionAttribute<SzpitalKomOrg, KsiegaPrzyjecWypisow> ksiegaPrzyjecWypisowCollection;
    public static volatile CollectionAttribute<SzpitalKomOrg, KsiegaChorychOddzialu> ksiegaChorychOddzialuCollection;
    public static volatile CollectionAttribute<SzpitalKomOrg, KartaInformacyjna> kartaInformacyjnaLeczeniaSzpitalnegoCollection;
    public static volatile CollectionAttribute<SzpitalKomOrg, KsiegaZabiegow> ksiegaZabiegowCollection;
    public static volatile CollectionAttribute<SzpitalKomOrg, RaportPielegniarski> raportPielegniarskiCollection;
    public static volatile SingularAttribute<SzpitalKomOrg, String> nazwa;
    public static volatile CollectionAttribute<SzpitalKomOrg, WywiadPielegniarski> wywiadPielegniarskiCollection;
    public static volatile SingularAttribute<SzpitalKomOrg, String> kodResortowy;

}