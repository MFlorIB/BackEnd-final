package com.proyecto.ProyectoFinal.service;

import com.proyecto.ProyectoFinal.model.estudios;
import java.util.List;


public interface IestudiosService {
    
    public List<estudios> verestudios ();
    
    public void crearestudios (estudios est);
    
    public void borrarestudios (Long id);
    
    public estudios buscarestudios (Long id);
    
    public List<estudios> verEstudiosPersona(Long idpersona);
    
}
