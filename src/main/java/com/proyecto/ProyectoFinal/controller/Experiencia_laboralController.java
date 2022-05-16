package com.proyecto.ProyectoFinal.controller;

import com.proyecto.ProyectoFinal.model.experiencia_laboral;
import com.proyecto.ProyectoFinal.service.Iexperiencia_laboralService;
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
public class Experiencia_laboralController {
    
    @Autowired
    private Iexperiencia_laboralService experiServ;
    
    
    
    @PostMapping ("/new/experiencia_laboral")
    public void agregarexperiencia_laboral (@RequestBody experiencia_laboral expe){
        experiServ.crearexperiencia_laboral(expe);
    }
    
    
    @GetMapping ("/ver/experiencia_laboral")
    @ResponseBody
    public List <experiencia_laboral> verexperiencias_laboral (){
    return experiServ.verexperiencias_laboral();
    }
    
    @DeleteMapping ("/borrar/experiencia_laboral/{id}")
    public void borrarexperiencia_laboral (@PathVariable Long id) {
        experiServ.borrarexperiencia_laboral(id);
    }
    
    @PutMapping ("/editar/experiencia_laboral/{id}")
    public experiencia_laboral editexperiencia_laboral (@PathVariable Long id, 
                                                        @RequestBody experiencia_laboral exp){
   
    experiencia_laboral experi = experiServ.buscarexperiencia_laboral(id);
    
    experi.setNombre_empresa(exp.getNombre_empresa());
    experi.setEs_trabajo_actual(Boolean.TRUE);
    experi.setFechaInicio(exp.getFechaInicio());
    experi.setFecha_fin(exp.getFecha_fin());
    experi.setDescripcion(exp.getDescripcion());
    
   experiServ.crearexperiencia_laboral(experi);
   
   return experi;
    
    
    }
    
    @GetMapping("/ver/experienciasXpersona/{idPers}")
    public List<experiencia_laboral> ver_experienciasXPersona(@PathVariable Long idPers){
        return experiServ.verexperiencias_laboralPersona(idPers);
    }
    
}
