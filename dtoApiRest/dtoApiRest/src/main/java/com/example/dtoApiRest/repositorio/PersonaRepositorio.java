package com.example.dtoApiRest.repositorio;

import com.example.dtoApiRest.modelo.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepositorio extends CrudRepository<Persona, String> {
}
