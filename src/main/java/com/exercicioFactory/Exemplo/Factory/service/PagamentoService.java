package com.exercicioFactory.Exemplo.Factory.service;

import com.exercicioFactory.Exemplo.Factory.model.PagamentoModel;
import com.exercicioFactory.Exemplo.Factory.model.pagamentos.CalculoPagamentoFactory;
import com.exercicioFactory.Exemplo.Factory.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    public List<PagamentoModel> buscaTodo() {
        return pagamentoRepository.findAll();
    }

    public Optional<PagamentoModel> buscaId(Long codigo) {

        return pagamentoRepository.findById(codigo);
    }

    public PagamentoModel cadastraPagamento(PagamentoModel pagamentoModel, CalculoPagamentoFactory calculoPagamentoFactory) {
        BigDecimal resultado = CalculoPagamentoFactory.tipoPagamento(pagamentoModel.getStatusPagamento()).calculoPagamento(pagamentoModel);
        pagamentoModel.setValorPago(resultado);

        return pagamentoRepository.save(pagamentoModel);
    }

    public PagamentoModel alterarPagamento(PagamentoModel pagamentoModel, CalculoPagamentoFactory calculoPagamentoFactory) {

        BigDecimal resultado = CalculoPagamentoFactory.tipoPagamento(pagamentoModel.getStatusPagamento()).calculoPagamento(pagamentoModel);
        pagamentoModel.setValorPago(resultado);

        return pagamentoRepository.save(pagamentoModel);
    }

    public void deletarPagamento(Long codigo) {
        pagamentoRepository.deleteById(codigo);
    }
}
