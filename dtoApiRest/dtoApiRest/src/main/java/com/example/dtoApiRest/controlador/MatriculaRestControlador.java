package com.example.dtoApiRest.controlador;

import com.example.dtoApiRest.modelo.Matricula;
import com.example.dtoApiRest.servicios.MatriculaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "ws/matricula/")
@CrossOrigin("*")
public class MatriculaRestControlador {
    @Autowired
    private MatriculaServicio servicio;

    @PostMapping(value = "/guardar")
    public Matricula guardar(@RequestBody Matricula auto) {
        return servicio.guardar(auto);
    }
}
