package edu.comillas.icai.gitt.pat.spring.mvc.destino;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Destino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private  String pais;
    private String dificultad;
    private int maxDepth;

    public Destino(){
    }

    public Destino(long id, String nombre, String pais, String dificultad, int maxDepth) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.dificultad = dificultad;
        this.maxDepth = maxDepth;
    }

    public Destino(String nombre, String pais, String dificultad, int maxDepth) {
        this.nombre = nombre;
        this.pais = pais;
        this.dificultad = dificultad;
        this.maxDepth = maxDepth;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public int getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(int maxDepth) {
        this.maxDepth = maxDepth;
    }
}
