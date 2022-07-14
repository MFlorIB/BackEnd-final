package com.proyecto.ProyectoFinal.service;

import com.proyecto.ProyectoFinal.model.usuario;
import com.proyecto.ProyectoFinal.repository.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class usuarioService implements IusuarioService{

    
    @Autowired
    public usuarioRepository usuRepo;
    
    @Override
    public usuario buscarusuario(String email) {
        return usuRepo.findByEmail(email);
    }
    
}

