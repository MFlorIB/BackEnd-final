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
public class proyectos {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String tipo;
    private String link_proyecto;
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name="persona_id")
    private persona persona;

    public proyectos() {
    }

    public proyectos(Long id, String tipo, String link_proyecto, String descripcion, persona persona) {
        this.id = id;
        this.tipo = tipo;
        this.link_proyecto = link_proyecto;
        this.descripcion = descripcion;
        this.persona = persona;
    }

    
     
    
}
