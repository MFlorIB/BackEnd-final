package com.proyecto.ProyectoFinal.service;

import com.proyecto.ProyectoFinal.model.persona;
import com.proyecto.ProyectoFinal.repository.personaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personaService implements IpersonaService{

    
    @Autowired
    public personaRepository persoRepo;
    @Override
    public List<persona> verpersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearpersona(persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarpersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public persona buscarpersona(Long id) {
       return persoRepo.findById(id).orElse(null);
    }
    
}
