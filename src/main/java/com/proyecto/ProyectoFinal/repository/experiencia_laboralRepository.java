package com.proyecto.ProyectoFinal.repository;

import com.proyecto.ProyectoFinal.model.experiencia_laboral;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface experiencia_laboralRepository extends JpaRepository <experiencia_laboral, Long> {
    
    List<experiencia_laboral> findByPersonaIdOrderByFechaInicioDesc(@Param("idPersona")Long idPersona);
}
