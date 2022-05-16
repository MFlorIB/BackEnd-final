package com.proyecto.ProyectoFinal.service;

import com.proyecto.ProyectoFinal.model.estudios;
import com.proyecto.ProyectoFinal.repository.estudiosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class estudiosService implements IestudiosService{
    
    @Autowired
    public estudiosRepository estuRepo;
    @Override
    public List<estudios> verestudios() {
        return estuRepo.findAll();
    }

    @Override
    public void crearestudios(estudios est) {
        estuRepo.save(est);
        
    }

    @Override
    public void borrarestudios(Long id) {
        estuRepo.deleteById(id);
        
    }

    @Override
    public estudios buscarestudios(Long id) {
       return estuRepo.findById(id).orElse(null);
    }
    
    @Override
    public List<estudios> verEstudiosPersona(Long idpersona){
        return estuRepo.findByPersonaIdOrderByFechaInicioDesc(idpersona);
    } 
    
}