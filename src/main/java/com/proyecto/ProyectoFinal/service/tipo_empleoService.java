package com.proyecto.ProyectoFinal.service;

import com.proyecto.ProyectoFinal.model.tipo_empleo;
import com.proyecto.ProyectoFinal.repository.tipo_empleoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class tipo_empleoService implements Itipo_empleoService{
    
    @Autowired
    public tipo_empleoRepository tipoRepo;
    @Override
    public List<tipo_empleo> vertipos_empleo() {
       return tipoRepo.findAll();
    }

    @Override
    public void creartipo_empleo(tipo_empleo tip) {
       tipoRepo.save(tip);
    }

    @Override
    public void borrartipo_empleo(Long id) {
        tipoRepo.deleteById(id);
    }

    @Override
    public tipo_empleo buscartipo_empleo(Long id) {
        return tipoRepo.findById(id).orElse(null);
    }
    
}







