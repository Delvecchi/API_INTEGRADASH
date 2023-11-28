package com.code.apiintegradash.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UsuarioDto(
        @NotBlank String nome,

        @NotBlank String telefone,
        @NotBlank @Email(message = "O email deve estar em um formato válido") String email,
        @NotBlank String senha,
        String tipo_usuario



) {
}
