package com.example.promemoria.Controller;

import com.example.promemoria.Entity.Utente;
import com.example.promemoria.Service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UtenteController {
    @Autowired
    private UtenteService utenteService;

    @GetMapping("/utente")
    public List<Utente> getAllUtenti (){
        return utenteService.getAllUtenti();
    }
    @PostMapping("/utente")
    public List<Utente> saveAll(@RequestBody List<Utente> a){
        return utenteService.saveUtenti(a);
    }
    @DeleteMapping("/utente")
    public void deletebyId (@PathVariable Long Id){
        utenteService.deletebyId(Id);

    }
}
