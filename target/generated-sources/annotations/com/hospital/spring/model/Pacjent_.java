package com.hospital.spring.model;

import com.hospital.spring.model.HistoriaChoroby;
import com.hospital.spring.model.KartaInformacyjna;
import com.hospital.spring.model.KsiegaChorychOddzialu;
import com.hospital.spring.model.KsiegaPrzyjecWypisow;
import com.hospital.spring.model.KsiegaRaportowLekarskich;
import com.hospital.spring.model.KsiegaZabiegow;
import com.hospital.spring.model.RaportPielegniarski;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-25T16:09:40")
@StaticMetamodel(Pacjent.class)
public class Pacjent_ { 

    public static volatile CollectionAttribute<Pacjent, HistoriaChoroby> historiaChorobyCollection;
    public static volatile CollectionAttribute<Pacjent, KsiegaChorychOddzialu> ksiegaChorychOddzialuCollection;
    public static volatile CollectionAttribute<Pacjent, KsiegaZabiegow> ksiegaZabiegowCollection;
    public static volatile SingularAttribute<Pacjent, String> znakIdentyfikacyjny;
    public static volatile SingularAttribute<Pacjent, String> danePrzedstawicielaUst;
    public static volatile CollectionAttribute<Pacjent, RaportPielegniarski> raportPielegniarskiCollection;
    public static volatile SingularAttribute<Pacjent, String> plec;
    public static volatile SingularAttribute<Pacjent, String> drugieImie;
    public static volatile SingularAttribute<Pacjent, Date> dataUrodzenia;
    public static volatile CollectionAttribute<Pacjent, KsiegaRaportowLekarskich> ksiegaRaportowLekarskichCollection;
    public static volatile SingularAttribute<Pacjent, String> imie;
    public static volatile SingularAttribute<Pacjent, String> nazwisko;
    public static volatile CollectionAttribute<Pacjent, KsiegaPrzyjecWypisow> ksiegaPrzyjecWypisowCollection;
    public static volatile CollectionAttribute<Pacjent, KartaInformacyjna> kartaInformacyjnaLeczeniaSzpitalnegoCollection;
    public static volatile SingularAttribute<Pacjent, String> adres;
    public static volatile SingularAttribute<Pacjent, String> pesel;

}