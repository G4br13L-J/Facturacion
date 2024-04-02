package org.example.facturacion.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.facturacion.Entities.ClienteEntity;
import org.example.facturacion.Entities.FacturaEntity;
import org.example.facturacion.Entities.UsuarioEntity;

import java.util.List;

public interface FacturaRepository extends JpaRepository<FacturaEntity, Integer> {
    List<FacturaEntity> findAllByIdProveedorAndIdCliente(UsuarioEntity proveedor, ClienteEntity cliente);

    List<FacturaEntity> findAllByIdProveedor(UsuarioEntity proveedor);
}
