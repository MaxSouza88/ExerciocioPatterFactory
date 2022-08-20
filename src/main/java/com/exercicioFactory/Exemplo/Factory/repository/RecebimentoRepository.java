package com.exercicioFactory.Exemplo.Factory.repository;

import com.exercicioFactory.Exemplo.Factory.model.RecebimentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecebimentoRepository extends JpaRepository <RecebimentoModel,Long> {

}
