package com.exercicioFactory.Exemplo.Factory.service;

import com.exercicioFactory.Exemplo.Factory.model.RecebimentoModel;
import com.exercicioFactory.Exemplo.Factory.model.recebimentos.CalculoRecebimento;
import com.exercicioFactory.Exemplo.Factory.model.recebimentos.CalculoRecebimentoFactory;
import com.exercicioFactory.Exemplo.Factory.repository.RecebimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class RecebimentoService {
    @Autowired
    private RecebimentoRepository recebimentoRepository;

    public List<RecebimentoModel> buscarTodos() {
        return recebimentoRepository.findAll();
    }

    public Optional<RecebimentoModel> buscaId(Long codigo) {

        return recebimentoRepository.findById(codigo);
    }

    public RecebimentoModel cadastraRecebimento(RecebimentoModel recebimentoModel, CalculoRecebimento calculoRecebimento) {
        BigDecimal resultado = CalculoRecebimentoFactory.tipoRecebimento(recebimentoModel.getStatusDoRecebimento()).calculoRecebimento(recebimentoModel);
        recebimentoModel.setValorPago(recebimentoModel.getValorAPagar().subtract(resultado));

        return recebimentoRepository.save(recebimentoModel);
    }

    public RecebimentoModel alterarRecebimento(RecebimentoModel recebimentoModel, CalculoRecebimento calculoRecebimentoFactory) {

        BigDecimal resultado = CalculoRecebimentoFactory.tipoRecebimento(recebimentoModel.getStatusDoRecebimento()).calculoRecebimento(recebimentoModel);
        recebimentoModel.setValorPago(recebimentoModel.getValorAPagar().subtract(resultado));

        return recebimentoRepository.save(recebimentoModel);
    }

    public void deletarRecebimento(Long codigo) {
        recebimentoRepository.deleteById(codigo);
    }

}
