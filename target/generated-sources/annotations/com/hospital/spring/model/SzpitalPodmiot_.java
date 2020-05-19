package com.hospital.spring.model;

import com.hospital.spring.model.SzpitalJednOrg;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-25T16:09:40")
@StaticMetamodel(SzpitalPodmiot.class)
public class SzpitalPodmiot_ { 

    public static volatile SingularAttribute<SzpitalPodmiot, String> nrTelefonu;
    public static volatile SingularAttribute<SzpitalPodmiot, String> regon;
    public static volatile SingularAttribute<SzpitalPodmiot, String> adres;
    public static volatile SingularAttribute<SzpitalPodmiot, String> nazwa;
    public static volatile CollectionAttribute<SzpitalPodmiot, SzpitalJednOrg> szpitalJednOrgCollection;
    public static volatile SingularAttribute<SzpitalPodmiot, String> nrKsiegiRejestrowejZakladu;

}