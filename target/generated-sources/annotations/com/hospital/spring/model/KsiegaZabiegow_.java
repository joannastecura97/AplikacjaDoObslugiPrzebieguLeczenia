package com.hospital.spring.model;

import com.hospital.spring.model.Pacjent;
import com.hospital.spring.model.Pracownik;
import com.hospital.spring.model.SzpitalKomOrg;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-25T16:09:40")
@StaticMetamodel(KsiegaZabiegow.class)
public class KsiegaZabiegow_ { 

    public static volatile SingularAttribute<KsiegaZabiegow, Date> data;
    public static volatile SingularAttribute<KsiegaZabiegow, String> rodzajZabiegu;
    public static volatile SingularAttribute<KsiegaZabiegow, String> przebiegZabiegu;
    public static volatile SingularAttribute<KsiegaZabiegow, Pracownik> pracownikWyk;
    public static volatile SingularAttribute<KsiegaZabiegow, Pacjent> pacjent;
    public static volatile SingularAttribute<KsiegaZabiegow, Pracownik> lekarzZlec;
    public static volatile SingularAttribute<KsiegaZabiegow, Integer> id;
    public static volatile SingularAttribute<KsiegaZabiegow, SzpitalKomOrg> nrKomOrg;

}