package com.proyecto.ProyectoFinal.repository;

import com.proyecto.ProyectoFinal.model.proyectos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface proyectosRepository extends JpaRepository <proyectos, Long>{
    
    List<proyectos> findByPersonaId(@Param("idPersona")Long idPersona);
    
}
