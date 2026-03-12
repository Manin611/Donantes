package com.Cesde.donantes.Repositorio;

import com.Cesde.donantes.Modelo.MSolicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSolicitud extends JpaRepository<MSolicitud, Integer> {
}
