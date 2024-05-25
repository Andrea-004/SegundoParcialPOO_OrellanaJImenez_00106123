import Depa.Principal;
import Depa.Secundario;

public interface AbstractFactory {
    public Principal crearPrincipal(String nombre, int numeroDepa, String manejador);
    public Secundario crearSecundario(String nombre, int numeroDepa, String manejador);
}
