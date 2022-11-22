package com.example.dtoApiRest.modelo;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Coche {

    @Id
    private String placa;
    private String marca;
    private String modelo;
    private String propietario;
}
