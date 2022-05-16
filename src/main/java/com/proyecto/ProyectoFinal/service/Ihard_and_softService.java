package com.proyecto.ProyectoFinal.service;

import com.proyecto.ProyectoFinal.model.hard_and_soft;
import java.util.List;


public interface Ihard_and_softService {
    
    public List<hard_and_soft> verhards_and_soft ();
    
    public void crearhard_and_soft (hard_and_soft har);
    
    public void borrarhard_and_soft (Long id);
    
    public hard_and_soft buscarhard_and_soft (Long id);
   
    public List<hard_and_soft> verhards_and_soft_persona(Long idpersona);
}
