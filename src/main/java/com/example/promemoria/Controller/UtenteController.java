package com.example.promemoria.Controller;

import com.example.promemoria.Entity.Utente;
import com.example.promemoria.Service.UtenteService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin()
@RestController
@RequestMapping("/utenti")
public class UtenteController {
    @Autowired
    private UtenteService utenteService;


    //@GetMapping("/utente")
    //public List<Utente> getAllUtenti() {
       // return utenteService.getAllUtenti();
    //}

   // @GetMapping("/utente/{id}")
    //public Utente getUtenteById(@PathVariable Long id) {
      //  return utenteService.findAllById(id);
    //}


    @DeleteMapping("/utente/{id}")
    public void deleteUtenti(@PathVariable Long id) {
        Utente utente = utenteService.findAllById(id);
        utenteService.deletebyId(id);
    }

    @PostMapping("/utente")
    public Utente save(@RequestBody Utente utente) {
        return utenteService.save(utente);
    }


    //@GetMapping("/utente/{firstname}")
   // public List<Utente> findByFirstname(@PathVariable String firstName) {
       // return utenteService.findByFirstname(firstName);
   // }
    //@GetMapping("/utente/{lastname}")
    //public List<Utente> findByLastname(@PathVariable String lastName){
       // return utenteService.findByLastname(lastName);
    //}
    @GetMapping("/utente")
    public List<Utente> findByOrderByFirstnameAsc(){
        return utenteService.findByOrderByFirstnameAsc();
    }

}