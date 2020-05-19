package com.hospital.spring.model;

import com.hospital.spring.model.OsobaUpowazniona;
import com.hospital.spring.model.Pacjent;
import com.hospital.spring.model.PrzebiegHospitalizacji;
import com.hospital.spring.model.WpisDoSzpitala;
import com.hospital.spring.model.WypisZeSzpitala;
import com.hospital.spring.model.WywiadPielegniarski;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-25T16:09:40")
@StaticMetamodel(HistoriaChoroby.class)
public class HistoriaChoroby_ { 

    public static volatile CollectionAttribute<HistoriaChoroby, OsobaUpowazniona> osobaUpowaznionaCollection;
    public static volatile CollectionAttribute<HistoriaChoroby, WpisDoSzpitala> wpisDoSzpitalaCollection;
    public static volatile CollectionAttribute<HistoriaChoroby, WypisZeSzpitala> wypisZeSzpitalaCollection;
    public static volatile CollectionAttribute<HistoriaChoroby, PrzebiegHospitalizacji> przebiegHospitalizacjiCollection;
    public static volatile SingularAttribute<HistoriaChoroby, Pacjent> pacjent;
    public static volatile SingularAttribute<HistoriaChoroby, Integer> id;
    public static volatile CollectionAttribute<HistoriaChoroby, WywiadPielegniarski> wywiadPielegniarskiCollection;

}