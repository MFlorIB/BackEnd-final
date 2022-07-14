package com.proyecto.ProyectoFinal.repository;

import com.proyecto.ProyectoFinal.model.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface usuarioRepository extends JpaRepository <usuario, Long>{
    
    usuario findByEmail(@Param("email")String email);
}
