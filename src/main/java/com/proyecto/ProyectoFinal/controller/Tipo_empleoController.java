package com.proyecto.ProyectoFinal.controller;

import com.proyecto.ProyectoFinal.model.tipo_empleo;
import com.proyecto.ProyectoFinal.service.Itipo_empleoService;
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
public class Tipo_empleoController {
    
    @Autowired
    private Itipo_empleoService tipoServ;
    
    
    @PostMapping("/new/tipo_empleo")
    public void agregartipo_empleo (@RequestBody tipo_empleo tip){
        tipoServ.creartipo_empleo(tip);
    }
    
    
    @GetMapping ("/ver/tipo_empleo")
    @ResponseBody
    public List <tipo_empleo> vertipos_empleo(){
        return tipoServ.vertipos_empleo();
    }
    
    
    @DeleteMapping ("/delete/tipo_empleo/{id}")
    public void borrartipo_empleo (@PathVariable Long id ){
    tipoServ.borrartipo_empleo(id);
    }
    
    
    @PutMapping ("/editar/tipo_empleo/{id}")
    public tipo_empleo edittipo_empleo (@PathVariable Long id,
                                        @RequestBody tipo_empleo tip){
        
        tipo_empleo tipo = tipoServ.buscartipo_empleo(id);
        
        tipo.setNombre_tipo(tip.getNombre_tipo());
        tipo.setDescripcion(tip.getDescripcion());
        
        tipoServ.creartipo_empleo(tipo);
        
        return tipo;
        
        
    }
}
