package com.proyecto.ProyectoFinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter @Setter
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String password;
    private String email;
    
    
    @OneToOne
    @JoinColumn(name="persona_id")
    private persona persona;

    
    
    public usuario() {
    }

    public usuario(Long Id, String password, String email, persona persona) {
        this.Id = Id;
        this.password = password;
        this.email = email;
        this.persona = persona;
    }
    
    
    
    
}
