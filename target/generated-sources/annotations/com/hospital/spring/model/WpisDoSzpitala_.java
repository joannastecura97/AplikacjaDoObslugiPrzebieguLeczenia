package com.hospital.spring.model;

import com.hospital.spring.model.HistoriaChoroby;
import com.hospital.spring.model.KsiegaPrzyjecWypisow;
import com.hospital.spring.model.Pracownik;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-25T16:09:40")
@StaticMetamodel(WpisDoSzpitala.class)
public class WpisDoSzpitala_ { 

    public static volatile SingularAttribute<WpisDoSzpitala, String> rozpPrzezLekKier;
    public static volatile SingularAttribute<WpisDoSzpitala, HistoriaChoroby> historiaChoroby;
    public static volatile SingularAttribute<WpisDoSzpitala, Pracownik> lekarzPrzyjm;
    public static volatile CollectionAttribute<WpisDoSzpitala, KsiegaPrzyjecWypisow> ksiegaPrzyjecWypisowCollection;
    public static volatile SingularAttribute<WpisDoSzpitala, Date> dataPrzyjecia;
    public static volatile SingularAttribute<WpisDoSzpitala, String> trybPrzyjecia;
    public static volatile SingularAttribute<WpisDoSzpitala, Integer> id;
    public static volatile SingularAttribute<WpisDoSzpitala, Pracownik> lekarzKier;
    public static volatile SingularAttribute<WpisDoSzpitala, String> rozpPrzezLekPrzyjm;

}