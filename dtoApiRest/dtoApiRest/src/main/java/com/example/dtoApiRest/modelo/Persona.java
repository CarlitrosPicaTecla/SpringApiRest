package com.example.dtoApiRest.modelo;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.*;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Persona {

    @Id
    private String id;
    private String nombre;

}
