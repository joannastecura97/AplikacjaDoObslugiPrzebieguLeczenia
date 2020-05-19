package com.hospital.spring.model;

import com.hospital.spring.model.Pracownik;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-25T16:09:40")
@StaticMetamodel(Dzialanie.class)
public class Dzialanie_ { 

    public static volatile SingularAttribute<Dzialanie, Pracownik> pracownik;
    public static volatile SingularAttribute<Dzialanie, Date> dataGodzina;
    public static volatile SingularAttribute<Dzialanie, Integer> id;
    public static volatile SingularAttribute<Dzialanie, String> opis;

}