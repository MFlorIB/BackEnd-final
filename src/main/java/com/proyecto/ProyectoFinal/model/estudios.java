package com.proyecto.ProyectoFinal.model;

import java.util.Date;
import javax.persistence.Column;
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
public class estudios{
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String nivel;
    private String descripcion;
    private String establecimiento;
    @Column(name = "fecha_inicio")
    private Date fechaInicio;
    private Date fecha_fin;
    
    @ManyToOne
    @JoinColumn(name="persona_id")
    private persona persona;
    

    
    
    public estudios (){
    }

    public estudios(Long id, String nivel, String descripcion, String establecimiento, Date fecha_inicio, Date fecha_fin, persona persona) {
        this.id = id;
        this.nivel = nivel;
        this.descripcion = descripcion;
        this.establecimiento = establecimiento;
        this.fechaInicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.persona = persona;
    }

    
    
    
}






