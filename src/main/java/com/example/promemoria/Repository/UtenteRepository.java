package com.example.promemoria.Repository;

import com.example.promemoria.Entity.Utente;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UtenteRepository extends JpaRepository<Utente, Long> {
      Utente findAllById (Long id);
      List<Utente> findByFirstname (String nome);
      List<Utente> findByLastname (String cognome);
      List<Utente> findAllByOrderByFirstnameAsc ();


      List<Utente> findAll();


}
