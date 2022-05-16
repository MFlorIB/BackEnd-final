package com.proyecto.ProyectoFinal.service;

import com.proyecto.ProyectoFinal.model.hard_and_soft;
import com.proyecto.ProyectoFinal.repository.hard_and_softRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class hard_and_softService implements Ihard_and_softService {
    
    @Autowired
    public hard_and_softRepository hardRepo;
    @Override
    public List<hard_and_soft> verhards_and_soft() {
        return hardRepo.findAll();
    }

    @Override
    public void crearhard_and_soft(hard_and_soft har) {
     hardRepo.save(har);
    }

    @Override
    public void borrarhard_and_soft(Long id) {
     hardRepo.deleteById(id);
    }

    @Override
    public hard_and_soft buscarhard_and_soft(Long id) {
        return hardRepo.findById(id).orElse(null);
    }
    
    @Override
    public List<hard_and_soft> verhards_and_soft_persona(Long idPers){
        return hardRepo.findByPersonaId(idPers);
    }
}
