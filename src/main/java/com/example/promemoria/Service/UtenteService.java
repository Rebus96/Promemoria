package com.example.promemoria.Service;

import com.example.promemoria.Entity.Utente;
import com.example.promemoria.Repository.UntenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UtenteService {
    @Autowired
    private UntenteRepository untenteRepository;

    public List<Utente> saveUtenti(List<Utente> utenteList){
        return untenteRepository.saveAll(utenteList);
    }


    public List<Utente> getAllUtenti(){
        return untenteRepository.findAll();
    }


    public void deletebyId(Long Id){
        untenteRepository.deleteById(Id);

    }
}