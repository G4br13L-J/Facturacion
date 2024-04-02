package org.example.facturacion.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.facturacion.Entities.UsuarioEntity;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {
    Optional<UsuarioEntity> findByEmail(String correo);
    List<UsuarioEntity> findAllByRol(String rol);
}
