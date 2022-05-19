package com.proyecto.ProyectoFinal.controller;

import com.proyecto.ProyectoFinal.model.proyectos;
import com.proyecto.ProyectoFinal.service.IproyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ProyectosController {
    
    
    @Autowired
    private IproyectosService proyServ;
    
    @PostMapping ("/new/proyectos")
    public void agregarproyectos (@RequestBody proyectos pro){
        proyServ.crearproyectos(pro);
    }
    
    @GetMapping ("/ver/proyectos")
    @ResponseBody
    public List<proyectos> verproyectos(){
    return proyServ.verproyectos();
    }
    
    
    @DeleteMapping ("/borrar/proyectos/{id}")
    public void borrarproyectos (@PathVariable Long id){
    proyServ.borrarproyectos(id);
    }
    
    
    @PutMapping ("/editar/proyectos/{id}")
    public proyectos editproyectos (@PathVariable Long id,
                                    @RequestBody proyectos pro){
        
        proyectos proy = proyServ.buscarproyectos(id);
        
        proy.setTipo(pro.getTipo());
        proy.setLink_proyecto(pro.getLink_proyecto());
        proy.setDescripcion(pro.getDescripcion());
        
        proyServ.crearproyectos(proy);
        
        return proy;
    }
    
    @GetMapping ("/ver/proyectosXpersona/{idPers}")
    public List<proyectos> verproyectosXPersona(@PathVariable Long idPers){
        return proyServ.verproyectosXPersona(idPers);
    }
}






