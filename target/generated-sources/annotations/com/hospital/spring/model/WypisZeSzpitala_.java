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
@StaticMetamodel(WypisZeSzpitala.class)
public class WypisZeSzpitala_ { 

    public static volatile SingularAttribute<WypisZeSzpitala, String> sekcjaZwlok;
    public static volatile SingularAttribute<WypisZeSzpitala, Pracownik> lekarzWyp;
    public static volatile SingularAttribute<WypisZeSzpitala, HistoriaChoroby> historiaChoroby;
    public static volatile SingularAttribute<WypisZeSzpitala, String> protokolKom;
    public static volatile SingularAttribute<WypisZeSzpitala, String> nrStatChorZgon;
    public static volatile SingularAttribute<WypisZeSzpitala, String> epikryza;
    public static volatile SingularAttribute<WypisZeSzpitala, Date> dataWypisu;
    public static volatile SingularAttribute<WypisZeSzpitala, String> rozpoznanieKliniczne;
    public static volatile SingularAttribute<WypisZeSzpitala, String> nrStatWspolistniejace;
    public static volatile SingularAttribute<WypisZeSzpitala, Pracownik> lekarzZg;
    public static volatile SingularAttribute<WypisZeSzpitala, String> przyczynaWypisu;
    public static volatile SingularAttribute<WypisZeSzpitala, Date> dataZgonu;
    public static volatile CollectionAttribute<WypisZeSzpitala, KsiegaPrzyjecWypisow> ksiegaPrzyjecWypisowCollection;
    public static volatile SingularAttribute<WypisZeSzpitala, String> opisZastLeczenia;
    public static volatile SingularAttribute<WypisZeSzpitala, String> dawca;
    public static volatile SingularAttribute<WypisZeSzpitala, String> przyczynaZgonu;
    public static volatile SingularAttribute<WypisZeSzpitala, Integer> id;
    public static volatile SingularAttribute<WypisZeSzpitala, String> nrStatZasadnicze;

}