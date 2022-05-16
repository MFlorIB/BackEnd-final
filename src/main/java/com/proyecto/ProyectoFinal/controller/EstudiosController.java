package com.proyecto.ProyectoFinal.controller;

import com.proyecto.ProyectoFinal.model.estudios;
import com.proyecto.ProyectoFinal.service.IestudiosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class EstudiosController {
    
    @Autowired
    private IestudiosService estuServ;
    
    
    @PostMapping ("/new/estudios")
    public void agregarestudios (@RequestBody estudios est) {
        estuServ.crearestudios(est);
        
    }
    
    @GetMapping ("/ver/estudios")
    @ResponseBody
    public List<estudios> verestudios(){
    return estuServ.verestudios();
    
    }
    
    
    @DeleteMapping ("/borrar/estudios/{id}")
    public void borrarestudios (@PathVariable Long id){
          estuServ.borrarestudios (id);
    
    }

    @PutMapping ("/editar/estudios/{id}")
    public estudios editestudios (@PathVariable Long id,
                                  @RequestBody estudios est){
       
        estudios estu = estuServ.buscarestudios(id);
        
        estu.setNivel(est.getNivel());
        estu.setDescripcion (est.getDescripcion());
        estu.setEstablecimiento (est.getEstablecimiento());
        estu.setFecha_fin (est.getFecha_fin());
        estu.setFechaInicio (est.getFechaInicio());
        
        estuServ.crearestudios(estu);
        
        return estu;
    }
    
    @GetMapping("/ver/estudiosXpersona/{idPers}")
    public List<estudios> buscarEstudiosPorPersona(@PathVariable Long idPers){
        
        return estuServ.verEstudiosPersona(idPers);
    }
    
    
}









