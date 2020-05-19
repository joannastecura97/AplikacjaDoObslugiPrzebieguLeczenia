package com.hospital.spring.model;

import com.hospital.spring.model.Pacjent;
import com.hospital.spring.model.Pracownik;
import com.hospital.spring.model.SzpitalKomOrg;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-25T16:09:40")
@StaticMetamodel(KsiegaRaportowLekarskich.class)
public class KsiegaRaportowLekarskich_ { 

    public static volatile SingularAttribute<KsiegaRaportowLekarskich, Date> data;
    public static volatile SingularAttribute<KsiegaRaportowLekarskich, Pacjent> pacjent;
    public static volatile SingularAttribute<KsiegaRaportowLekarskich, Integer> id;
    public static volatile SingularAttribute<KsiegaRaportowLekarskich, Pracownik> lekarz;
    public static volatile SingularAttribute<KsiegaRaportowLekarskich, String> sprawozdanie;
    public static volatile SingularAttribute<KsiegaRaportowLekarskich, SzpitalKomOrg> nrKomOrg;

}