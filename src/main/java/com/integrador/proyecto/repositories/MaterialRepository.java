package com.integrador.proyecto.repositories;


import com.integrador.proyecto.entities.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Integer> { // Cambiado a Integer
}