package com.proyecto.ProyectoFinal.service;

import com.proyecto.ProyectoFinal.model.experiencia_laboral;
import java.util.List;


public interface Iexperiencia_laboralService {
    
    public List<experiencia_laboral> verexperiencias_laboral ();
    
    public void crearexperiencia_laboral (experiencia_laboral expe);
    
    public void borrarexperiencia_laboral (Long id);
    
    public experiencia_laboral buscarexperiencia_laboral (Long id);
    
    public List<experiencia_laboral> verexperiencias_laboralPersona (Long idpersona);
}
