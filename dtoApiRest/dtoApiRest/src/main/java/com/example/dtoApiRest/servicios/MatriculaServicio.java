package com.example.dtoApiRest.servicios;

import com.example.dtoApiRest.modelo.Matricula;
import com.example.dtoApiRest.modelo.MatriculaMapper;
import com.example.dtoApiRest.repositorio.CocheRepositorio;
import com.example.dtoApiRest.repositorio.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class MatriculaServicio {

    @Autowired
    private MatriculaMapper mapper;

    @Autowired
    private CocheRepositorio repositorioAuto;

    @Autowired
    private PersonaRepositorio repositorioPersona;

    public Matricula guardar(Matricula entity) {
        repositorioPersona.save(mapper.toPersona(entity));
        repositorioAuto.save(mapper.toCoche(entity));
        return entity;
    }
}
