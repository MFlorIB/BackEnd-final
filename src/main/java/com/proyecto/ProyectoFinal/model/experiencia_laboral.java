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
public class experiencia_laboral {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre_empresa;
    private Boolean es_trabajo_actual;
    @Column(name = "fecha_inicio")
    private Date fechaInicio;
    private Date fecha_fin;
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name="persona_id")
    private persona persona;
    
    
    @ManyToOne
    @JoinColumn(name="tipo_empleo_id")
    private tipo_empleo tipo_empleo;
   
    
    public experiencia_laboral() {
    }

    public experiencia_laboral(Long id, String nombre_empresa, Boolean es_trabajo_actual, Date fecha_inicio, Date fecha_fin, String descripcion, persona persona, tipo_empleo tipo_empleo) {
        this.id = id;
        this.nombre_empresa = nombre_empresa;
        this.es_trabajo_actual = es_trabajo_actual;
        this.fechaInicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.persona = persona;
        this.tipo_empleo = tipo_empleo;
    }

    

    
    
     
       
    }
    


