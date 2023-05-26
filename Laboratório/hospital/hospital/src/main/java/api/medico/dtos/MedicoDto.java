package api.medico.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class MedicoDto {
    @NotBlank
    private String nome;
    @NotNull
    private String especializacao;
    @NotBlank
    private String telefone;
    @NotBlank
    private String sexo;

}
