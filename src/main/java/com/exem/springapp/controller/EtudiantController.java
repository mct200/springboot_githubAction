package com.exem.springapp.controller;

import com.exem.springapp.entities.Etudiant;
import com.exem.springapp.service.EtudiantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiant")

public class EtudiantController {
   private  final EtudiantService etudiantService;

    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @PostMapping("/create")
   public Etudiant create(@RequestBody Etudiant etudiant){
       return etudiantService.creer(etudiant);
   }
   @GetMapping("/read")
   public List<Etudiant> read(){
       return etudiantService.lire();
   }
   @PutMapping("/update/{id}")
   public Etudiant update(Long id, Etudiant etudiant){
       return  etudiantService.modifier(id,etudiant);
   }
   @DeleteMapping("/delete")
   public String delete(@PathVariable Long id){
       return  etudiantService.supprimer(id);
   }

}
