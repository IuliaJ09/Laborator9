package com.example.laborator9.masini;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Masina {
    private String nrInmatriculare;
    private String marca;
    private int an;
    private String culoare;
    private int nrKm;

    public Masina() {}
    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "nrInmatriculare='" + nrInmatriculare + '\'' +
                ", marca='" + marca + '\'' +
                ", an=" + an +
                ", culoare='" + culoare + '\'' +
                ", nrKm=" + nrKm +
                '}';
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getNrKm() {
        return nrKm;
    }

    public void setNrKm(int nrKm) {
        this.nrKm = nrKm;
    }
}
