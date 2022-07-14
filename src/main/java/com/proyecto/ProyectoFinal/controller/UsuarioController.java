package com.proyecto.ProyectoFinal.controller;

import com.proyecto.ProyectoFinal.model.usuario;
import com.proyecto.ProyectoFinal.service.IusuarioService;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import java.util.stream.Collectors;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UsuarioController {
    
    @Autowired
    private IusuarioService usuServ;
   
    @CrossOrigin(origins = "*")
    @PostMapping("/iniciar-sesion")
    public String login(@RequestBody usuario u) {	
        String token = "";
        JSONObject json = new JSONObject();
        usuario usu = usuServ.buscarusuario(u.getEmail());
        if(usu == null)
        {
            //Usuario No encontrado
            token = "{\"token\":\"Usuario no encontrado\"}";
        }
        else
        {
             if(usu.getPassword().equals(u.getPassword()))
            {
                token = getJWTToken(usu.getEmail());
                token = "{\"token\":\""+getJWTToken(usu.getEmail())+"\"}";
            }
            else
            {
                token = "{\"token\":\"Contraseña incorrecta\"}";
            }        	
        }
        json = new JSONObject(token);
	return json.toString();
    }

	private String getJWTToken(String email) {
		String secretKey = "mySecretKey";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_USER");
		
		String token = Jwts
				.builder()
				.setId("softtekJWT")
				.setSubject(email)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 86400000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return "Bearer " + token;
	}
    
}

