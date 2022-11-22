package com.example.dtoApiRest.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Matricula implements Serializable {

    private String id;

    private String propietario;
    private String placa;
    private String marca;
    private String modelo;



}
