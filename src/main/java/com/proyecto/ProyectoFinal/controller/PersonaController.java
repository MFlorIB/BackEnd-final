package com.proyecto.ProyectoFinal.controller;

import com.proyecto.ProyectoFinal.model.persona;
import com.proyecto.ProyectoFinal.service.IpersonaService;
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
public class PersonaController {
    
    //inyeccion de dependencias
    @Autowired
    //implementacion de la interface
    private IpersonaService persoServ;
    
    @PostMapping ("/new/persona")
    public void agregarpersona (@RequestBody persona pers){
        persoServ.crearpersona(pers);
    }
    
    
    @GetMapping ("/ver/persona")
    @ResponseBody
    public List<persona> verpersonas (){
       return persoServ.verpersonas();
               
    }
    
    @DeleteMapping ("/delete/persona/{id}")
    public void borrarpersona (@PathVariable Long id) {
        persoServ.borrarpersona(id);
        
    }
      
    
    @PutMapping ("/editar/persona/{id}")
    public persona editpersona (@PathVariable Long id,
                                @RequestBody persona per){
        
        persona perso = persoServ.buscarpersona(id);
        
        
        perso.setNombres(per.getNombres());
        perso.setApellidos(per.getApellidos());
        perso.setDomicilio(per.getDomicilio());
        perso.setFecha_de_nac(per.getFecha_de_nac());
        perso.setTelefono(per.getTelefono());
        perso.setCorreo_electronico(per.getCorreo_electronico());
        perso.setUrl_foto(per.getUrl_foto());
        
        persoServ.crearpersona(perso);
        
        return perso;
       
    }
    
    @GetMapping ("/ver/persona/{id}")
    @ResponseBody
    public persona verpersona(@PathVariable Long id){
       return persoServ.buscarpersona(id);
               
    }
}










