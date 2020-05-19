/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.spring.toolDTO;

import com.hospital.spring.DTO.DzialanieDTO;
import com.hospital.spring.DTO.HistoriaChorobyDTO;
import com.hospital.spring.DTO.KartaInformacyjnaDTO;
import com.hospital.spring.DTO.KsiegaChorychOddzialuDTO;
import com.hospital.spring.DTO.KsiegaPrzyjecWypisowDTO;
import com.hospital.spring.DTO.KsiegaRaportowLekarskichDTO;
import com.hospital.spring.DTO.KsiegaRaportowPielegniarskichDTO;
import com.hospital.spring.DTO.KsiegaZabiegowDTO;
import com.hospital.spring.DTO.OsobaUpowaznionaDTO;
import com.hospital.spring.DTO.PacjentDTO;
import com.hospital.spring.DTO.PracownikDTO;
import com.hospital.spring.DTO.PrzebiegHospitalizacjiDTO;
import com.hospital.spring.DTO.RaportPielegniarskiDTO;
import com.hospital.spring.DTO.WpisDoSzpitalaDTO;
import com.hospital.spring.DTO.WypisZeSzpitalaDTO;
import com.hospital.spring.DTO.WywiadPielegniarskiDTO;
import com.hospital.spring.model.Dzialanie;
import com.hospital.spring.model.HistoriaChoroby;
import com.hospital.spring.model.KartaInformacyjna;
import com.hospital.spring.model.KsiegaChorychOddzialu;
import com.hospital.spring.model.KsiegaPrzyjecWypisow;
import com.hospital.spring.model.KsiegaRaportowLekarskich;
import com.hospital.spring.model.KsiegaRaportowPielegniarskich;
import com.hospital.spring.model.KsiegaZabiegow;
import com.hospital.spring.model.OsobaUpowazniona;
import com.hospital.spring.model.Pacjent;
import com.hospital.spring.model.Pracownik;
import com.hospital.spring.model.PrzebiegHospitalizacji;
import com.hospital.spring.model.RaportPielegniarski;
import com.hospital.spring.model.WpisDoSzpitala;
import com.hospital.spring.model.WypisZeSzpitala;
import com.hospital.spring.model.WywiadPielegniarski;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stecu
 */
public class BuilderDTO {

    public PracownikDTO wykonajPracownikDTO(Pracownik pracownik) {
        PracownikDTO pracdto = new PracownikDTO();
        pracdto.setLogin(pracownik.getLogin());
        pracdto.setImie(pracownik.getImie());
        pracdto.setNazwisko(pracownik.getNazwisko());
        pracdto.setNrPWZ(pracownik.getNrPWZ());
        pracdto.setTytulZawodowy(pracownik.getTytulZawodowy());
        return pracdto;
    }

    public List<DzialanieDTO> modelDzialanDTO(List<Dzialanie> lista) {
        List<DzialanieDTO> dane = new ArrayList();
        for (Dzialanie d : lista) {
            DzialanieDTO dzialdto = new DzialanieDTO();
            dzialdto.setData(d.getDataGodzina());
            dzialdto.setOpis(d.getOpis());
            dane.add(dzialdto);
        }

        return dane;
    }

    public List<PacjentDTO> modelPacjentowDTO(List<Pacjent> lista) {
        List<PacjentDTO> dane = new ArrayList();
        for (Pacjent p : lista) {
            PacjentDTO pacjentdto = new PacjentDTO();
            pacjentdto.setImie(p.getImie());
            pacjentdto.setDrugieImie(p.getDrugieImie());
            pacjentdto.setNazwisko(p.getNazwisko());
            pacjentdto.setPesel(p.getPesel());
            pacjentdto.setPlec(p.getPlec());
            pacjentdto.setZnakIdentyfikacyjny(p.getZnakIdentyfikacyjny());
            pacjentdto.setDanePrzedstawicielaUst(p.getDanePrzedstawicielaUst());
            pacjentdto.setDataUrodzenia(p.getDataUrodzenia());
            pacjentdto.setAdres(p.getAdres());

            dane.add(pacjentdto);
        }

        return dane;
    }

    public PacjentDTO dodajPacjentDTO(Pacjent p) {
        PacjentDTO pacjentdto = new PacjentDTO();
        pacjentdto.setImie(p.getImie());
        pacjentdto.setDrugieImie(p.getDrugieImie());
        pacjentdto.setNazwisko(p.getNazwisko());
        pacjentdto.setPesel(p.getPesel());
        pacjentdto.setPlec(p.getPlec());
        pacjentdto.setZnakIdentyfikacyjny(p.getZnakIdentyfikacyjny());
        pacjentdto.setDanePrzedstawicielaUst(p.getDanePrzedstawicielaUst());
        pacjentdto.setDataUrodzenia(p.getDataUrodzenia());
        pacjentdto.setAdres(p.getAdres());

        return pacjentdto;
    }

    public List<KsiegaZabiegowDTO> modelKsiegiZabiegowDTO(List<KsiegaZabiegow> lista) {
        List<KsiegaZabiegowDTO> dane = new ArrayList();
        for (KsiegaZabiegow p : lista) {
            KsiegaZabiegowDTO ksiega = new KsiegaZabiegowDTO();
            ksiega.setData(p.getData());
            ksiega.setNrPWZlekarzZlec(wykonajPracownikDTO(p.getLekarzZlec()));
            ksiega.setNrKomOrg(p.getNrKomOrg().getNazwa());
            ksiega.setPacjentPESEL(p.getPacjent().getPesel());
            ksiega.setNrPWZpracownikWyk(wykonajPracownikDTO(p.getPracownikWyk()));
            ksiega.setPrzebiegZabiegu(p.getPrzebiegZabiegu());
            ksiega.setRodzajZabiegu(p.getRodzajZabiegu());
            ksiega.setNrWKsiedze(p.getId());

            dane.add(ksiega);
        }

        return dane;
    }

    public List<KsiegaRaportowLekarskichDTO> modelKsiegiRaportowLekarskichDTO(List<KsiegaRaportowLekarskich> lista) {
        List<KsiegaRaportowLekarskichDTO> dane = new ArrayList();
        for (KsiegaRaportowLekarskich p : lista) {
            KsiegaRaportowLekarskichDTO ksiega = new KsiegaRaportowLekarskichDTO();
            ksiega.setNrWKsiedze(p.getId());
            ksiega.setData(p.getData());
            ksiega.setNrKomOrg(p.getNrKomOrg().getNazwa());
            ksiega.setPacjent(p.getPacjent().getPesel());
            ksiega.setLekarz(wykonajPracownikDTO(p.getLekarz()));
            ksiega.setSprawozdanie(p.getSprawozdanie());
            dane.add(ksiega);
        }

        return dane;
    }

    public List<KsiegaChorychOddzialuDTO> modelKsiegiChorychOddzialuDTO(List<KsiegaChorychOddzialu> lista) {
        List<KsiegaChorychOddzialuDTO> dane = new ArrayList();
        for (KsiegaChorychOddzialu p : lista) {
            KsiegaChorychOddzialuDTO ksiega = new KsiegaChorychOddzialuDTO();
            ksiega.setLekarzProw(wykonajPracownikDTO(p.getLekarzProw()));
            ksiega.setNrKomOrg(p.getNrKomOrg().getNazwa());
            ksiega.setNrKsiegaPrzyjec(p.getNrKsiegaPrzyjec().getId());
            ksiega.setPesel(p.getPesel().getPesel());
            ksiega.setNrWKsiedze(p.getId());
            dane.add(ksiega);
        }

        return dane;
    }

    public List<KsiegaPrzyjecWypisowDTO> modelKsiegiPrzyjecWypisowDTO(List<KsiegaPrzyjecWypisow> lista) {
        List<KsiegaPrzyjecWypisowDTO> dane = new ArrayList();
        for (KsiegaPrzyjecWypisow p : lista) {
            KsiegaPrzyjecWypisowDTO ksiega = new KsiegaPrzyjecWypisowDTO();
            ksiega.setNrWpisu(p.getIdWpisu().getId());
            ksiega.setNrWypisu(p.getIdWypisu().getId());
            ksiega.setMiejsceGdzieZostalWypisany(p.getMiejsceGdzieZostalWypisany());
            ksiega.setNrKartyDepozytowej(p.getNrKartyDepozytowej());
            ksiega.setNrPwzLekarz(wykonajPracownikDTO(p.getNrPwzLekarz()));
            ksiega.setNrResortowyKom(p.getNrResortowyKom().getNazwa());
            ksiega.setOkolicznosciTr(p.getOkolicznosciTr());
            ksiega.setPesel(p.getPesel().getPesel());
            ksiega.setPobranieOplat(p.getPobranieOplat());
            ksiega.setRozpOnkologiczne(p.getRozpOnkologiczne());
            ksiega.setTransportSanitarny(p.getTransportSanitarny());
            ksiega.setNrWKsiedze(p.getId());
            dane.add(ksiega);
        }

        return dane;

    }

    public List<KsiegaRaportowPielegniarskichDTO> modelKsiegiRaportowPielegniarskichDTO(List<KsiegaRaportowPielegniarskich> lista) {
        List<KsiegaRaportowPielegniarskichDTO> dane = new ArrayList();
        for (KsiegaRaportowPielegniarskich p : lista) {
            KsiegaRaportowPielegniarskichDTO ksiega = new KsiegaRaportowPielegniarskichDTO();
            ksiega.setNrWpisu(p.getId());
            ksiega.setData(p.getData());
            ksiega.setOsobyPrzyjete(p.getOsobyPrzyjete());
            ksiega.setOsobyWypisane(p.getOsobyWypisane());
            ksiega.setOsobyZmarle(p.getOsobyZmarle());
            ksiega.setPielegniarka(wykonajPracownikDTO(p.getPielegniarka()));

            dane.add(ksiega);
        }

        return dane;

    }

    public List<HistoriaChorobyDTO> modelHistoriiChorobPacjentaDTO(List<HistoriaChoroby> lista) {
        List<HistoriaChorobyDTO> dane = new ArrayList();
        for (HistoriaChoroby p : lista) {
            HistoriaChorobyDTO dto = new HistoriaChorobyDTO();
            dto.setNr(p.getId());
            dto.setPacjent(p.getPacjent().getPesel());
            dane.add(dto);
        }

        return dane;

    }

    public List<KartaInformacyjnaDTO> modelKartaInformacyjnaPacjentaDTO(List<KartaInformacyjna> lista) {
        List<KartaInformacyjnaDTO> dane = new ArrayList();
        for (KartaInformacyjna p : lista) {
            KartaInformacyjnaDTO k = new KartaInformacyjnaDTO();

            k.setDataWydania(p.getDataWydania());
            k.setEpikryza(p.getEpikryza());
            k.setLeczenie(p.getLeczenie());
            k.setLeki(p.getLeki());
            k.setNrKomOrg(p.getNrKomOrg().getKodResortowy());
            k.setNrPwzLekarz(wykonajPracownikDTO(p.getNrPwzLekarz()));
            k.setOkresNiezdolnosci(p.getOkresNiezdolnosci());
            k.setPacjent(p.getPacjent().getPesel());
            k.setRozpoznania(p.getRozpoznania());
            k.setWynikiBadan(p.getWynikiBadan());
            k.setZalecenia(p.getZalecenia());
            dane.add(k);
        }

        return dane;

    }

    public List<OsobaUpowaznionaDTO> modelOsobUpowaznionychPacjentaDTO(List<OsobaUpowazniona> lista) {
        List<OsobaUpowaznionaDTO> dane = new ArrayList();
        for (OsobaUpowazniona p : lista) {
            OsobaUpowaznionaDTO o = new OsobaUpowaznionaDTO();
            o.setAdres(p.getAdres());
            o.setHistoriaChoroby(p.getHistoriaChoroby().getId());
            o.setImie(p.getImie());
            o.setNazwisko(p.getNazwisko());
            o.setNrTelefonu(p.getNrTelefonu());
            dane.add(o);
        }

        return dane;

    }

    public List<WpisDoSzpitalaDTO> modelWpisyDoszpitalaPacjentaDTO(List<WpisDoSzpitala> lista) {
        List<WpisDoSzpitalaDTO> dane = new ArrayList();
        for (WpisDoSzpitala p : lista) {
            WpisDoSzpitalaDTO w = new WpisDoSzpitalaDTO();
            w.setNr(p.getId());
            w.setDataPrzyjecia(p.getDataPrzyjecia());
            w.setHistoriaChoroby(p.getHistoriaChoroby().getId());
            w.setLekarzKier(wykonajPracownikDTO(p.getLekarzKier()));
            w.setLekarzPrzyjm(wykonajPracownikDTO(p.getLekarzPrzyjm()));
            w.setRozpPrzezLekKier(p.getRozpPrzezLekKier());
            w.setRozpPrzezLekPrzyjm(p.getRozpPrzezLekPrzyjm());
            w.setTrybPrzyjecia(p.getTrybPrzyjecia());
            dane.add(w);
        }

        return dane;

    }

    public List<WypisZeSzpitalaDTO> modelWypisyZeSzpitalaPacjentaDTO(List<WypisZeSzpitala> lista) {
        List<WypisZeSzpitalaDTO> dane = new ArrayList();
        for (WypisZeSzpitala p : lista) {
            WypisZeSzpitalaDTO w = new WypisZeSzpitalaDTO();
            w.setDataWypisu(p.getDataWypisu());
            w.setEpikryza(p.getEpikryza());
            w.setHistoriaChoroby(p.getHistoriaChoroby().getId());
            w.setLekarzWyp(wykonajPracownikDTO(p.getLekarzWyp()));
            w.setNr(p.getId());
            w.setNrStatWspolistniejace(p.getNrStatWspolistniejace());
            w.setNrStatZasadnicze(p.getNrStatZasadnicze());
            w.setOpisZastLeczenia(p.getOpisZastLeczenia());
            w.setPrzyczynaWypisu(p.getPrzyczynaWypisu());
            w.setRozpoznanieKliniczne(p.getRozpoznanieKliniczne());
            dane.add(w);
        }

        return dane;

    }

    public List<WywiadPielegniarskiDTO> modelWywiadPielegniarskiPacjentaDTO(List<WywiadPielegniarski> lista) {
        List<WywiadPielegniarskiDTO> dane = new ArrayList();
        for (WywiadPielegniarski p : lista) {
            WywiadPielegniarskiDTO w = new WywiadPielegniarskiDTO();
            w.setHistoriaChoroby(p.getHistoriaChoroby().getId());
            w.setNazwaKomOrg(p.getNrKomOrg().getNazwa());
            w.setPelegniarka(wykonajPracownikDTO(p.getPielegniarka()));

            dane.add(w);
        }

        return dane;

    }

    public List<RaportPielegniarskiDTO> modelRaportPielegniarskiPacjentaDTO(List<RaportPielegniarski> lista) {
        List<RaportPielegniarskiDTO> dane = new ArrayList();
        for (RaportPielegniarski p : lista) {
            RaportPielegniarskiDTO w = new RaportPielegniarskiDTO();
            w.setData(p.getData());
            w.setNazwaKomOrg(p.getNrKomOrg().getNazwa());
            w.setPelegniarka(wykonajPracownikDTO(p.getPielegniarka()));
            dane.add(w);
        }

        return dane;

    }

    public List<PrzebiegHospitalizacjiDTO> modelPrzebiegHospitalizacjiPacjentaDTO(List<PrzebiegHospitalizacji> lista) {
        List<PrzebiegHospitalizacjiDTO> dane = new ArrayList();
        for (PrzebiegHospitalizacji p : lista) {
            PrzebiegHospitalizacjiDTO w = new PrzebiegHospitalizacjiDTO();
            w.setData(p.getData());
            w.setHistoriaChoroby(p.getHistoriaChoroby().getId());
            w.setLeczenie(p.getLeczenie());
            w.setLekarz(wykonajPracownikDTO(p.getLekarz()));
            w.setPrzebiegChoroby(p.getPrzebiegChoroby());
            dane.add(w);
        }

        return dane;

    }
}
