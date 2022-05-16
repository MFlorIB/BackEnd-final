package com.proyecto.ProyectoFinal.service;

import com.proyecto.ProyectoFinal.model.persona;
import java.util.List;


public interface IpersonaService {
    
    public List<persona> verpersonas ();
    
    public void crearpersona (persona per);
    
    public void borrarpersona (Long id);
    
    public persona buscarpersona (Long id);
    
}
