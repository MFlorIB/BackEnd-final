package com.proyecto.ProyectoFinal.service;

import com.proyecto.ProyectoFinal.model.proyectos;
import com.proyecto.ProyectoFinal.repository.proyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class proyectosService implements IproyectosService{

    @Autowired
    public proyectosRepository proyRepo;
    @Override
    public List<proyectos> verproyectos() {
      return proyRepo.findAll();
    }

    @Override
    public void crearproyectos(proyectos pro) {
        proyRepo.save(pro);
    }

    @Override
    public void borrarproyectos(Long id) {
       proyRepo.deleteById(id);
    }

    @Override
    public proyectos buscarproyectos(Long id) {
       return proyRepo.findById(id).orElse(null);
    }
    
    @Override
    public List<proyectos> verproyectosXPersona (Long idpersona){
        return proyRepo.findByPersonaId(idpersona);
    }
    
}



