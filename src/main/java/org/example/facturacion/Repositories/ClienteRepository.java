package org.example.facturacion.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.facturacion.Entities.ClienteEntity;
import org.example.facturacion.Entities.UsuarioEntity;

import java.util.List;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {
    List<ClienteEntity> findAllByIdProveedor(UsuarioEntity idProveedor);
    // para buscar por nombre
    List<ClienteEntity> findAllByIdProveedorAndNombreContaining(UsuarioEntity idProveedor, String searchName);
}
