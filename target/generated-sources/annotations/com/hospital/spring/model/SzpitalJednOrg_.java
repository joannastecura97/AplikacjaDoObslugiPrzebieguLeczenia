package com.hospital.spring.model;

import com.hospital.spring.model.SzpitalKomOrg;
import com.hospital.spring.model.SzpitalPodmiot;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-25T16:09:40")
@StaticMetamodel(SzpitalJednOrg.class)
public class SzpitalJednOrg_ { 

    public static volatile SingularAttribute<SzpitalJednOrg, String> nazwa;
    public static volatile SingularAttribute<SzpitalJednOrg, String> kodResortowy;
    public static volatile CollectionAttribute<SzpitalJednOrg, SzpitalKomOrg> szpitalKomOrgCollection;
    public static volatile SingularAttribute<SzpitalJednOrg, SzpitalPodmiot> nrKsiegiRejestrowejZakladu;

}