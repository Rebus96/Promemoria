package com.example.promemoria.Repository;

import com.example.promemoria.Entity.Utente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PageRepository extends PagingAndSortingRepository<Utente, Long> {
    Page<Utente> findAll(Pageable pageable);



}
