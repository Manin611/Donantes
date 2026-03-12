package com.Cesde.donantes.Repositorio;

import com.Cesde.donantes.Modelo.MDonante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RDonante extends JpaRepository<MDonante, Integer> {
}
