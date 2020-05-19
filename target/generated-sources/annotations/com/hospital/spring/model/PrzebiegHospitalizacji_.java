package com.hospital.spring.model;

import com.hospital.spring.model.HistoriaChoroby;
import com.hospital.spring.model.Pracownik;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-25T16:09:40")
@StaticMetamodel(PrzebiegHospitalizacji.class)
public class PrzebiegHospitalizacji_ { 

    public static volatile SingularAttribute<PrzebiegHospitalizacji, String> przebiegChoroby;
    public static volatile SingularAttribute<PrzebiegHospitalizacji, HistoriaChoroby> historiaChoroby;
    public static volatile SingularAttribute<PrzebiegHospitalizacji, Date> data;
    public static volatile SingularAttribute<PrzebiegHospitalizacji, Integer> id;
    public static volatile SingularAttribute<PrzebiegHospitalizacji, Pracownik> lekarz;
    public static volatile SingularAttribute<PrzebiegHospitalizacji, String> leczenie;

}