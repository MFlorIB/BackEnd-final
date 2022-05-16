package com.proyecto.ProyectoFinal.repository;

import com.proyecto.ProyectoFinal.model.hard_and_soft;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface hard_and_softRepository extends JpaRepository <hard_and_soft, Long>{
    
    List<hard_and_soft> findByPersonaId(@Param("idPersona")Long idPersona);
    
}
