package org.example.facturacion.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.facturacion.Entities.DetallesFacturaEntity;
import org.example.facturacion.Entities.FacturaEntity;

import java.util.List;

public interface DetallesFacturaRepository extends JpaRepository<DetallesFacturaEntity, Integer> {
    List<DetallesFacturaEntity> getDetallesFacturaEntitiesByFactura(FacturaEntity factura);
}