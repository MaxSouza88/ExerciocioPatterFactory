package com.exercicioFactory.Exemplo.Factory.controller;

import com.exercicioFactory.Exemplo.Factory.model.RecebimentoModel;
import com.exercicioFactory.Exemplo.Factory.model.recebimentos.CalculoRecebimento;
import com.exercicioFactory.Exemplo.Factory.model.recebimentos.CalculoRecebimentoFactory;
import com.exercicioFactory.Exemplo.Factory.service.RecebimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/recebimentos")
public class RecebimentoController {

    @Autowired
    private RecebimentoService recebimentoService;

    @GetMapping
    public List<RecebimentoModel> exibirTodosRecebimento() {
        return recebimentoService.buscarTodos();
    }

    @GetMapping(path = "/{id}")
    public Optional<RecebimentoModel> exibirRecebimentoViaId(@PathVariable Long id) {
        return recebimentoService.buscaId(id);
    }

    @PostMapping
    public RecebimentoModel cadastrarNovoRecebimento(@RequestBody RecebimentoModel recebimentoModel, CalculoRecebimento calculoRecebimento) {
        return recebimentoService.cadastraRecebimento(recebimentoModel, calculoRecebimento);
    }

    @PutMapping(path = "/{id}")
    public RecebimentoModel alterarRecebimento(@RequestBody RecebimentoModel recebimentoModel, CalculoRecebimento calculoRecebimento) {
        return recebimentoService.alterarRecebimento(recebimentoModel, calculoRecebimento);
    }

    @DeleteMapping(path = "/{id}")
    public void deletarRecebimento(@PathVariable Long id) {
        recebimentoService.deletarRecebimento(id);
    }


}