package com.proyecto.ProyectoFinal.service;

import com.proyecto.ProyectoFinal.model.experiencia_laboral;
import com.proyecto.ProyectoFinal.repository.experiencia_laboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class experiencia_laboralService implements Iexperiencia_laboralService{

    @Autowired
    public experiencia_laboralRepository experiRepo;
    @Override
    public List<experiencia_laboral> verexperiencias_laboral() {
      return experiRepo.findAll();
    }

    @Override
    public void crearexperiencia_laboral(experiencia_laboral expe) {
        experiRepo.save(expe);
    }

    @Override
    public void borrarexperiencia_laboral(Long id) {
       experiRepo.deleteById(id);
    }

    @Override
    public experiencia_laboral buscarexperiencia_laboral(Long id) {
        return experiRepo.findById(id).orElse(null);
    }
    
    @Override
    public List<experiencia_laboral> verexperiencias_laboralPersona (Long idpersona){
        return experiRepo.findByPersonaIdOrderByFechaInicioDesc(idpersona);
    }
    
    
}







