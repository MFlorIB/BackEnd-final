package com.proyecto.ProyectoFinal.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class hard_and_soft {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String tipo;
    private int porcentaje;  
    
    @ManyToOne
    @JoinColumn(name="persona_id")
    private persona persona;

    
    public hard_and_soft() {
    }

    public hard_and_soft(Long id, String tipo, int porcentaje, persona persona) {
        this.id = id;
        this.tipo = tipo;
        this.porcentaje = porcentaje;
        this.persona = persona;
    }

   
    
    
            
}
