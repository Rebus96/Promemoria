package com.example.promemoria.Controller;

import com.example.promemoria.Entity.Utente;
import com.example.promemoria.Repository.UtenteRepository;
import com.example.promemoria.Service.UtenteService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin()
@RestController
@RequestMapping("/utenti")
public class UtenteController {
    @Autowired
    private UtenteService utenteService;


    @GetMapping("/utente")
    public List<Utente> getAllUtenti() {
        return utenteService.getAllUtenti();
    }

    @GetMapping("/utente/{id}")
    public Utente getUtenteById(@RequestParam Long id) {
        return utenteService.findAllById(id);
    }


    @DeleteMapping("/utente/{id}")
    public void deleteUtenti(@PathVariable Long id) {
        utenteService.deletebyId(id);
    }

    @PostMapping("/utente")
    public Utente save(@RequestBody Utente utente) {
        return utenteService.save(utente);
    }


    @GetMapping("/utente/search/{firstname}")
    public List<Utente> search(@PathVariable String firstname){
        return utenteService.findByFirstname(firstname);
    }


    @GetMapping("/utente/ordine")
    public List<Utente> findByOrderByFirstnameAsc() {
        return utenteService.findByOrderByFirstnameAsc();
    }

    @GetMapping("/utente/page")
    public Page<Utente> findAllPage(@RequestParam(value = "page", required = false, defaultValue = "0") int page,
                                    @RequestParam(value = "size", required = false, defaultValue = "5") int size)
    {
        Pageable pageable = PageRequest.of(page,size);
        return utenteService.findAllPage(pageable);
    }

}