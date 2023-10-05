package com.utn.MiPrimeraAPIRest.Servicios;


import com.utn.MiPrimeraAPIRest.Entidades.Persona;
import com.utn.MiPrimeraAPIRest.Repositorios.BaseRepositorio;
import com.utn.MiPrimeraAPIRest.Repositorios.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServicioImp extends BaseServicioImpl<Persona,Long> implements PersonaServicio {
    @Autowired
    private PersonaRepositorio personaRepositorio;

    public PersonaServicioImp(BaseRepositorio<Persona, Long> baseRepositorio, PersonaRepositorio personaRepositorio) {
        super(baseRepositorio);
        this.personaRepositorio = personaRepositorio;
    }
}
