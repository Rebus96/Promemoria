package com.example.promemoria.Repository;

import com.example.promemoria.Entity.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UntenteRepository extends JpaRepository<Utente, Long> {
      List<Utente> findAllById (Long Id);
      List<Utente> findByFirstname (String nome);
      List<Utente> findByLastname (String cognome);

      List<Utente> findAll();
}
