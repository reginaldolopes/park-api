package br.net.silvalopes.park_api.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioSenhaDto {

    @NotBlank
    @Size(min = 6, max = 8)
    private String senhaAtual;
    @NotBlank
    @Size(min = 6, max = 8)
    private String senhaNova;
    @NotBlank
    @Size(min = 6, max = 8)
    private String confirmaSenha;

}
