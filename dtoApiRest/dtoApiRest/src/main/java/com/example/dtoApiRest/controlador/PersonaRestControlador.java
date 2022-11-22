package com.example.dtoApiRest.controlador;

import com.example.dtoApiRest.modelo.Coche;
import com.example.dtoApiRest.servicios.CocheServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "ws/coche/")
@CrossOrigin("*")
public class PersonaRestControlador {
    @Autowired
    private CocheServicio servicio;

    @GetMapping(value = "/")
    public List<Coche> getTodos() {
        return servicio.getTodos();
    }

    @GetMapping(value = "/{placa}")
    public Optional<Coche> getById(@PathVariable String placa) {
        return servicio.getValor(placa);
    }

    @PostMapping(value = "/guardar")
    public Coche guardar(@RequestBody Coche Coche) {
        return servicio.guardar(Coche);
    }

    @GetMapping(value = "/eliminar/{placa}")
    public Optional<Coche> eliminar(@PathVariable String placa) {
        Optional<Coche> Coche = servicio.getValor(placa);
        servicio.eliminar(placa);
        return Coche;
    }
}
