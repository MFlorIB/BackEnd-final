package com.proyecto.ProyectoFinal.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class persona{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String domicilio;
    private String correo_electronico;
    private Date fecha_de_nac;
    private String url_foto;
    
    @OneToMany(mappedBy = "persona",
            cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REMOVE},
	    orphanRemoval=true
)
    @JsonIgnore
    private List<estudios> listado_estudios;
    
    
    @OneToMany(mappedBy = "persona",
            cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REMOVE},
	    orphanRemoval=true
)
    @JsonIgnore
    private List<experiencia_laboral> listado_experiencias;    
    
  
    @OneToMany(mappedBy = "persona",
            cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REMOVE},
	    orphanRemoval=true
)
    @JsonIgnore
    private List<hard_and_soft> listado_hard; 
    
    @OneToMany(mappedBy = "persona",
            cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REMOVE},
	    orphanRemoval=true
)
    @JsonIgnore
    private List<proyectos> listado_proyectos;   
    

    
    public persona(){       
    }

    public persona(Long id, String nombres, String apellidos, String telefono, String domicilio, String correo_electronico, Date fecha_de_nac, String url_foto, List<estudios> listado_estudios, List<experiencia_laboral> listado_experiencias, List<hard_and_soft> listado_hard, List<proyectos> listado_proyectos) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.correo_electronico = correo_electronico;
        this.fecha_de_nac = fecha_de_nac;
        this.url_foto = url_foto;
        this.listado_estudios = listado_estudios;
        this.listado_experiencias = listado_experiencias;
        this.listado_hard = listado_hard;
        this.listado_proyectos = listado_proyectos;
    }
    
    

}














