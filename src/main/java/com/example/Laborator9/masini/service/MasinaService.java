package com.example.laborator9.masini.service;

import com.example.laborator9.masini.Masina;
import com.example.laborator9.masini.repository.MasinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.List;
import java.util.Optional;

@Service
public class MasinaService {
    private final MasinaRepository repository;

    @Autowired
    public MasinaService(MasinaRepository repository) {
        this.repository = repository;
    }

    public Masina adaugaMasina(Masina masina) {
        return repository.save(masina);
    }

    public void stergeMasina(String nrInmatriculare) {
        repository.findByNrInmatriculare(nrInmatriculare)
                .ifPresent(repository::delete);
    }

    public Optional<Masina> cautaMasina(String nrInmatriculare) {
        return repository.findByNrInmatriculare(nrInmatriculare);
    }

    public List<Masina> toateMasinile() {
        return (List<Masina>) repository.findAll();
    }

    public int numarMasiniMarca(String marca) {
        return repository.countByMarca(marca);
    }

    public List<Masina> masiniSub100kKm() {
        return repository.findByNrKmLessThan(100000);
    }

    public List<Masina> masiniNoi(int ani) {
        int anCurent = Year.now().getValue();
        return repository.findByAnGreaterThan(anCurent - ani);
    }
}

