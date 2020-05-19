package com.hospital.spring.model;

import com.hospital.spring.model.KsiegaChorychOddzialu;
import com.hospital.spring.model.Pacjent;
import com.hospital.spring.model.Pracownik;
import com.hospital.spring.model.SzpitalKomOrg;
import com.hospital.spring.model.WpisDoSzpitala;
import com.hospital.spring.model.WypisZeSzpitala;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-25T16:09:40")
@StaticMetamodel(KsiegaPrzyjecWypisow.class)
public class KsiegaPrzyjecWypisow_ { 

    public static volatile SingularAttribute<KsiegaPrzyjecWypisow, WypisZeSzpitala> idWypisu;
    public static volatile SingularAttribute<KsiegaPrzyjecWypisow, WpisDoSzpitala> idWpisu;
    public static volatile SingularAttribute<KsiegaPrzyjecWypisow, String> nrKartyDepozytowej;
    public static volatile CollectionAttribute<KsiegaPrzyjecWypisow, KsiegaChorychOddzialu> ksiegaChorychOddzialuCollection;
    public static volatile SingularAttribute<KsiegaPrzyjecWypisow, String> transportSanitarny;
    public static volatile SingularAttribute<KsiegaPrzyjecWypisow, SzpitalKomOrg> nrResortowyKom;
    public static volatile SingularAttribute<KsiegaPrzyjecWypisow, String> rozpOnkologiczne;
    public static volatile SingularAttribute<KsiegaPrzyjecWypisow, Pracownik> nrPwzLekarz;
    public static volatile SingularAttribute<KsiegaPrzyjecWypisow, String> pobranieOplat;
    public static volatile SingularAttribute<KsiegaPrzyjecWypisow, Integer> id;
    public static volatile SingularAttribute<KsiegaPrzyjecWypisow, String> miejsceGdzieZostalWypisany;
    public static volatile SingularAttribute<KsiegaPrzyjecWypisow, Pacjent> pesel;
    public static volatile SingularAttribute<KsiegaPrzyjecWypisow, String> okolicznosciTr;

}