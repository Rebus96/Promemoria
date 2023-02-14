package com.example.promemoria.Controller;

import com.example.promemoria.Entity.Utente;
import com.example.promemoria.Service.UtenteService;
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


    @GetMapping("/utente")
    public List<Utente> getAllUtenti (){
        return utenteService.getAllUtenti();
    }
    @GetMapping("/utente/{id}")
    public Utente getPersonaById(@PathVariable Long id){
        return utenteService.findAllById(id);
    }
    @PostMapping("/utente")
    public List<Utente> saveAll(@RequestBody List<Utente> a){
        return utenteService.saveUtenti(a);
    }
    @DeleteMapping("/utente/{id}")
    public void deleteUtenti(Long Id){
        utenteService.deletebyId(Id);
    }

    @PostMapping
     public Utente save(@RequestBody Utente utente){
         return utenteService.save(utente);
     }
    @PutMapping("/utente/{id}")
    public ResponseEntity<Utente> updateUtente(@PathVariable(value = "id") Long id, @RequestBody Utente dettagliutente ){
      Utente utente = utenteService.findById(id);

       utente.setFirstname(dettagliutente.getFirstname());
       utente.setLastname(dettagliutente.getLastname());
        final Utente updatedUtente = utenteService.save(utente);
        return ResponseEntity.ok(updatedUtente);



    }
}
