package com.example.promemoria.Controller;

import com.example.promemoria.Entity.Promemoria;
import com.example.promemoria.Service.PromemoriaService;
import com.example.promemoria.Service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/promemoriautente")
public class PromemoriaController {
    @Autowired
    private PromemoriaService promemoriaService;

    @GetMapping("/promemoria")
    public List<Promemoria> getAllPromemoria(){
        return promemoriaService.getAllPromemoria();
    }
    @PostMapping("/promemoria")
    public List<Promemoria> saveAll(@RequestBody List<Promemoria> a){
        return promemoriaService.savePromemoria(a);
    }
    @DeleteMapping("/promemoria")
    public void deleteById(@PathVariable Long Id){
        promemoriaService.deleteById(Id);
    }

}
