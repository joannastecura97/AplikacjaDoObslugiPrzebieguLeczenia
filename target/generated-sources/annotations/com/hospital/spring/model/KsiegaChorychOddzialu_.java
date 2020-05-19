package com.hospital.spring.model;

import com.hospital.spring.model.KsiegaPrzyjecWypisow;
import com.hospital.spring.model.Pacjent;
import com.hospital.spring.model.Pracownik;
import com.hospital.spring.model.SzpitalKomOrg;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-25T16:09:40")
@StaticMetamodel(KsiegaChorychOddzialu.class)
public class KsiegaChorychOddzialu_ { 

    public static volatile SingularAttribute<KsiegaChorychOddzialu, Pracownik> lekarzProw;
    public static volatile SingularAttribute<KsiegaChorychOddzialu, Integer> id;
    public static volatile SingularAttribute<KsiegaChorychOddzialu, Pacjent> pesel;
    public static volatile SingularAttribute<KsiegaChorychOddzialu, SzpitalKomOrg> nrKomOrg;
    public static volatile SingularAttribute<KsiegaChorychOddzialu, KsiegaPrzyjecWypisow> nrKsiegaPrzyjec;

}