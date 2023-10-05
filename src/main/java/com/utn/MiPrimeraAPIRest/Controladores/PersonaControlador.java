package com.utn.MiPrimeraAPIRest.Controladores;


import com.utn.MiPrimeraAPIRest.Entidades.Persona;
import com.utn.MiPrimeraAPIRest.Servicios.PersonaServicioImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")

public class PersonaControlador extends BaseControladorImpl<Persona, PersonaServicioImp>{


}
