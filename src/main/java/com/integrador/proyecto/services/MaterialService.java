package com.integrador.proyecto.services;


import com.integrador.proyecto.entities.Material;
import com.integrador.proyecto.repositories.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialService {

    @Autowired
    private MaterialRepository materialRepository;

    public List<Material> getAllMaterials() {
        return materialRepository.findAll();
    }

    public Optional<Material> getMaterialById(Integer id) { // Cambiado a Integer
        return materialRepository.findById(id);
    }

    public Material saveMaterial(Material material) {
        return materialRepository.save(material);
    }

    public void deleteMaterial(Integer id) { // Cambiado a Integer
        materialRepository.deleteById(id);
    }
}