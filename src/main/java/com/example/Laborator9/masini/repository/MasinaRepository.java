package com.example.laborator9.masini.repository;

import com.example.laborator9.masini.Masina;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MasinaRepository extends CrudRepository<Masina, Long> {
    Optional<Masina> findByNrInmatriculare(String nrInmatriculare);
    int countByMarca(String marca);
    List<Masina> findByNrKmLessThan(int km);
    List<Masina> findByAnGreaterThan(int an);
}

