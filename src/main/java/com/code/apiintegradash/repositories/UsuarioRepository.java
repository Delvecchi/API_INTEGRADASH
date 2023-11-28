package com.code.apiintegradash.repositories;

import com.code.apiintegradash.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {
   UsuarioModel findByEmail(String email);
}
