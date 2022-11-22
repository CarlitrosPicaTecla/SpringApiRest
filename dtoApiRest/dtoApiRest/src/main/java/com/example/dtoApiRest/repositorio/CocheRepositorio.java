package com.example.dtoApiRest.repositorio;
import java.util.List;

import com.example.dtoApiRest.modelo.Coche;
import org.springframework.data.repository.CrudRepository;

public interface CocheRepositorio extends CrudRepository<Coche, String> {

    public List<Coche> findAllByPlaca(String placa);

    public List<Coche> findAllByPropietario(String placa);

}
