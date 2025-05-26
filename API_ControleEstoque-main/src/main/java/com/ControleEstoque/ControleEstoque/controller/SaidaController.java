package com.ControleEstoque.ControleEstoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ControleEstoque.ControleEstoque.model.Saida;
import com.ControleEstoque.ControleEstoque.service.SaidaService;



@RestController

@RequestMapping("/api/saida")
public class SaidaController {
    
    @Autowired
    private SaidaService service;
    
    @GetMapping
    public List<Saida> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Saida> buscarPorId(@PathVariable Long id){
        return service.buscarporId(id)
                .map(saida -> ResponseEntity.ok(saida))
                .orElse(ResponseEntity.notFound().build());
        
    }

    @PostMapping
    public Saida salvar(@RequestBody Saida saida){
        return service.salvar(saida);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Saida> atualizar(@PathVariable long id, @RequestBody Saida saida){
        if (!service.buscarporId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        saida.setId(id);
        return ResponseEntity.ok(service.salvar(saida));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        if (!service.buscarporId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }

}
