package com.proyecto.ProyectoFinal.service;

import com.proyecto.ProyectoFinal.model.tipo_empleo;
import java.util.List;


public interface Itipo_empleoService {
    
    public List <tipo_empleo> vertipos_empleo ();
    
    public void creartipo_empleo (tipo_empleo tip);
    
    public void borrartipo_empleo (Long id);
    
    public tipo_empleo buscartipo_empleo (Long id);    
    
}
