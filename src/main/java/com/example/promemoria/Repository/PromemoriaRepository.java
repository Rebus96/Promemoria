package com.example.promemoria.Repository;

import com.example.promemoria.Entity.Promemoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PromemoriaRepository extends JpaRepository {
    List<Promemoria> findAllById (Long Id);
    List<Promemoria> findByTitolo (String titolo);
    List<Promemoria> findByDescrizione (String descrizione);
    List<Promemoria> findByData (String data);
    List<Promemoria> findByOra (Long ora);
    List<Promemoria> findByFatto (String fatto);
    List<Promemoria> findByStato (String stato);
}
