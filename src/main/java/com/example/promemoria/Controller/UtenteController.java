package com.example.promemoria.Controller;

import com.example.promemoria.Entity.Utente;
import com.example.promemoria.Service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
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
        return utenteService.findById(id);
    }
    @PostMapping("/utente")
    public List<Utente> saveAll(@RequestBody List<Utente> a){
        return utenteService.saveUtenti(a);
    }
    @DeleteMapping("/utente/{id}")
    public void deletebyId (@PathVariable Long Id){
        utenteService.deletebyId(Id);

    }

    @PostMapping
     public Utente save(@RequestBody Utente utente){
         return utenteService.save(utente);
     }
    @PutMapping("/utente/{id}")
    public void updateUtente(@PathVariable(value = "id") Long id, @RequestBody Utente dettagliutente ){
      Utente utente = utenteService.findById(id);

       utente.setFirstname(dettagliutente.getFirstname());
       utente.setLastname(dettagliutente.getLastname());

    }
}
