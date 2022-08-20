package com.exercicioFactory.Exemplo.Factory.controller;

import com.exercicioFactory.Exemplo.Factory.model.PagamentoModel;
import com.exercicioFactory.Exemplo.Factory.model.pagamentos.CalculoPagamentoFactory;
import com.exercicioFactory.Exemplo.Factory.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @GetMapping
    public List<PagamentoModel> buscarTudo(){
        return pagamentoService.buscaTodo();
    }

    @GetMapping(path = "/{codigo}")
    public Optional<PagamentoModel> buscaId(@PathVariable Long codigo){
        return pagamentoService.buscaId(codigo);
    }

    @PostMapping
    public PagamentoModel cadastrarPagamento(@RequestBody PagamentoModel pagamentoModel, CalculoPagamentoFactory calculoPagamentoFactory){
        return pagamentoService.cadastraPagamento(pagamentoModel,calculoPagamentoFactory);
    }

    @PutMapping(path = "/{codigo}")
    public PagamentoModel alterarpagamento(@RequestBody PagamentoModel pagamentoModel, CalculoPagamentoFactory calculoPagamentoFactory){
        return pagamentoService.alterarPagamento(pagamentoModel,calculoPagamentoFactory);
    }

    @DeleteMapping(path = "/{codigo}")
    public void deletaPagamento(@PathVariable Long codigo){
        pagamentoService.deletarPagamento(codigo);
    }




}
