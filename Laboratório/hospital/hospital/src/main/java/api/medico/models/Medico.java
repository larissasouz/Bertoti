package api.medico.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;
@Data
@Entity
@Table(name = "medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, length = 50)
    private String nome;
    @Column(nullable = false, length = 50)
    private String especializacao;
    @Column(nullable = false, length = 50)
    private String telefone;
    @Column(nullable = false, length = 50)
    private String sexo;
}
