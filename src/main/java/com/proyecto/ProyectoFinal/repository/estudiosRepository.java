package com.proyecto.ProyectoFinal.repository;

import com.proyecto.ProyectoFinal.model.estudios;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface estudiosRepository extends JpaRepository <estudios, Long>{
     
    List<estudios> findByPersonaIdOrderByFechaInicioDesc(@Param("idPersona")Long idPersona);
    
}



