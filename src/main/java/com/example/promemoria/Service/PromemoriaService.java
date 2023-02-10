package com.example.promemoria.Service;

import com.example.promemoria.Entity.Promemoria;
import com.example.promemoria.Repository.PromemoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PromemoriaService {
    @Autowired
    private PromemoriaRepository promemoriaRepository;

    public List<Promemoria> getAllPromemoria(){
        return promemoriaRepository.findAll();
    }
    public List<Promemoria> savePromemoria(List<Promemoria> PromemoriaLIst){
        return promemoriaRepository.saveAll(PromemoriaLIst);
    }
    public void deleteById(Long Id){
        promemoriaRepository.deleteById(Id);
    }

}
