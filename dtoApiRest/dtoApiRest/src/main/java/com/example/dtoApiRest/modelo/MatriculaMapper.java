package com.example.dtoApiRest.modelo;

import org.springframework.stereotype.Component;

@Component

public class MatriculaMapper {

    public Coche toCoche(Matricula matricula){
        return Coche.builder()
                .marca(matricula.getMarca())
                .modelo(matricula.getModelo())
                .placa(matricula.getPlaca())
                .propietario(matricula.getId())
                .build();
    }
    public Persona toPersona(Matricula matricula){
        return Persona.builder()
                .id(matricula.getId())
                .nombre(matricula.getPropietario())
                .build();
    }
}
