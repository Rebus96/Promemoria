package com.example.promemoria.Repository;

import com.example.promemoria.Entity.Utente;
import jakarta.persistence.Id;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UtenteRepository extends JpaRepository<Utente, Long>, JpaSpecificationExecutor<Utente> {
      Utente findAllById (Long id);
      List<Utente> findByFirstname (String firstname);
      List<Utente> findByLastname (String lastname);
      List<Utente> findAllByOrderByFirstnameAsc ();
      List<Utente> findAllByFirstnameContains(String firstname);

      List<Utente> findAll();


}
