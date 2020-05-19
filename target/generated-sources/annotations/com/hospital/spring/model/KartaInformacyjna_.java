package com.hospital.spring.model;

import com.hospital.spring.model.Pacjent;
import com.hospital.spring.model.Pracownik;
import com.hospital.spring.model.SzpitalKomOrg;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-25T16:09:40")
@StaticMetamodel(KartaInformacyjna.class)
public class KartaInformacyjna_ { 

    public static volatile SingularAttribute<KartaInformacyjna, String> okresNiezdolnosci;
    public static volatile SingularAttribute<KartaInformacyjna, String> leki;
    public static volatile SingularAttribute<KartaInformacyjna, Pracownik> nrPwzLekarz;
    public static volatile SingularAttribute<KartaInformacyjna, Pacjent> pacjent;
    public static volatile SingularAttribute<KartaInformacyjna, String> wynikiBadan;
    public static volatile SingularAttribute<KartaInformacyjna, String> zalecenia;
    public static volatile SingularAttribute<KartaInformacyjna, Date> dataWydania;
    public static volatile SingularAttribute<KartaInformacyjna, Integer> id;
    public static volatile SingularAttribute<KartaInformacyjna, String> rozpoznania;
    public static volatile SingularAttribute<KartaInformacyjna, String> epikryza;
    public static volatile SingularAttribute<KartaInformacyjna, SzpitalKomOrg> nrKomOrg;
    public static volatile SingularAttribute<KartaInformacyjna, String> leczenie;

}