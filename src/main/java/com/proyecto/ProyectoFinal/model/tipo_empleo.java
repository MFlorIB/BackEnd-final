package com.proyecto.ProyectoFinal.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class tipo_empleo {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String nombre_tipo;
    private String descripcion;
    
    @OneToMany(mappedBy = "tipo_empleo",
            cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REMOVE},
	    orphanRemoval=true
)
    @JsonIgnore
    private List<experiencia_laboral> listado_experiencia;

    public tipo_empleo() {
    }

    public tipo_empleo(Long id, String nombre_tipo, String descripcion, List<experiencia_laboral> listado_experiencia) {
        this.id = id;
        this.nombre_tipo = nombre_tipo;
        this.descripcion = descripcion;
        this.listado_experiencia = listado_experiencia;
    }

    
    
    
}

