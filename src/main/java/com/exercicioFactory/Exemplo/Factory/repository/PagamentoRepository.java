package com.exercicioFactory.Exemplo.Factory.repository;

import com.exercicioFactory.Exemplo.Factory.model.PagamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository <PagamentoModel,Long> {

}
