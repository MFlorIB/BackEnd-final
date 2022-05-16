package com.proyecto.ProyectoFinal.service;

import com.proyecto.ProyectoFinal.model.proyectos;
import java.util.List;



public interface IproyectosService {
    
    public List<proyectos> verproyectos ();
    
    public void crearproyectos (proyectos pro);
            
    public void borrarproyectos (Long id);
            
    public proyectos buscarproyectos (Long id);
    
    public List<proyectos> verproyectosXPersona (Long idpersona);
    
}
