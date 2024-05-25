import Depa.Principal;
import Depa.Secundario;

public class FactorySecundarioTrabajador implements AbstractFactory{

    @Override
    public Principal crearPrincipal(String nombre, int numeroDepa, String manejador) {
        return new Principal();
    }

    @Override
    public Secundario crearSecundario(String nombre, int numeroDepa, String manejador) {
        return new Secundario();
    }
}
