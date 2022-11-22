package com.example.dtoApiRest.servicios;

import com.example.dtoApiRest.modelo.Coche;
import com.example.dtoApiRest.repositorio.CocheRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CocheServicio {

    @Autowired
    private CocheRepositorio repositorio;

    public Coche guardar(Coche entity) {
        return repositorio.save(entity);
    }

    public void eliminar(String id) {
        repositorio.deleteById(id);
    }

    public Optional<Coche> getValor(String id) {
        return repositorio.findById(id);
    }

    public List<Coche> getTodos() {
        return (List<Coche>) repositorio.findAll();
    }
}
