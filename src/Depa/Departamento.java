package Depa;

public class Departamento {
    private String nombre;
    private int numeroDepa;
    private String manejador;

    public Departamento(String nombre, int numeroDepa, String manejador) {
        this.nombre = nombre;
        this.numeroDepa = numeroDepa;
        this.manejador = manejador;
    }

    public Departamento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDepa() {
        return numeroDepa;
    }

    public void setNumeroDepa(int numeroDepa) {
        this.numeroDepa = numeroDepa;
    }

    public String getManejador() {
        return manejador;
    }

    public void setManejador(String manejador) {
        this.manejador = manejador;
    }
}
