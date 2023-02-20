package com.example.promemoria.Service;

import com.example.promemoria.Entity.Utente;
import com.example.promemoria.Repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;

    public List<Utente> saveUtenti(List<Utente> utenteList){
        return utenteRepository.saveAll(utenteList);
    }

    public Utente findById(Long id){ return utenteRepository.findAllById(id);}


    public List<Utente> getAllUtenti(){
        return utenteRepository.findAll();
    }



    public void deletebyId(Long id){
        utenteRepository.deleteById(id);

    }
    public Utente save(Utente utente){
        System.out.println("ciao");
        return utenteRepository.save(utente);
    }

    public Utente findAllById(Long id) { return utenteRepository.findAllById(id);
    }
    public List<Utente> findByFirstname(String firstName){
        return utenteRepository.findByFirstname(firstName);
    }
    public List<Utente> findByLastname(String lastName){
        return utenteRepository.findByLastname(lastName);
    }
    public List<Utente> findByOrderByFirstnameAsc(){
        return utenteRepository.findAllByOrderByFirstnameAsc();
    }


    }


