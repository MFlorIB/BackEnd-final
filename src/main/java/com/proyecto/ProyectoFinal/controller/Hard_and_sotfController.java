package com.proyecto.ProyectoFinal.controller;

import com.proyecto.ProyectoFinal.model.hard_and_soft;
import com.proyecto.ProyectoFinal.service.Ihard_and_softService;
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
public class Hard_and_sotfController {
    
    @Autowired
    private Ihard_and_softService hardServ;
    
    
    @PostMapping ("/new/hard_and_soft")
    public void agregarhard_and_soft (@RequestBody hard_and_soft har){
        hardServ.crearhard_and_soft(har);
    }

    @GetMapping ("/ver/hard_and_soft")
    @ResponseBody
    public List<hard_and_soft> verhards_and_soft (){
    return hardServ.verhards_and_soft();
    }
      
    
    
   @DeleteMapping ("/borrar/hard_and_soft/{id}")
   public void borrarhard_and_soft (@PathVariable Long id){
   hardServ.borrarhard_and_soft(id);
   }
   
   
   @PutMapping ("/editar/hard_and_soft/{id}")
   public hard_and_soft edithard_and_soft (@PathVariable Long id,
                                           @RequestBody hard_and_soft har){
       
       hard_and_soft hard = hardServ.buscarhard_and_soft(id);
       
       hard.setTipo(har.getTipo());
       hard.setPorcentaje(har.getPorcentaje());
       
       hardServ.crearhard_and_soft(hard);
       
       return hard;
       
   }
   
   @GetMapping ("/ver/hard_and_soft_persona/{idPers}")
    public List<hard_and_soft> verhards_and_softXpersona (@PathVariable Long idPers){
        return hardServ.verhards_and_soft_persona(idPers);
    }
   
}
