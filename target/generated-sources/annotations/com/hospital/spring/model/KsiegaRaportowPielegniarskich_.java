package com.hospital.spring.model;

import com.hospital.spring.model.Pracownik;
import com.hospital.spring.model.RaportPielegniarski;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-25T16:09:40")
@StaticMetamodel(KsiegaRaportowPielegniarskich.class)
public class KsiegaRaportowPielegniarskich_ { 

    public static volatile SingularAttribute<KsiegaRaportowPielegniarskich, Integer> osobyWypisane;
    public static volatile SingularAttribute<KsiegaRaportowPielegniarskich, Date> data;
    public static volatile SingularAttribute<KsiegaRaportowPielegniarskich, Integer> osobyPrzyjete;
    public static volatile SingularAttribute<KsiegaRaportowPielegniarskich, Integer> osobyZmarle;
    public static volatile SingularAttribute<KsiegaRaportowPielegniarskich, Pracownik> pielegniarka;
    public static volatile SingularAttribute<KsiegaRaportowPielegniarskich, Integer> id;
    public static volatile CollectionAttribute<KsiegaRaportowPielegniarskich, RaportPielegniarski> raportPielegniarskiCollection;

}