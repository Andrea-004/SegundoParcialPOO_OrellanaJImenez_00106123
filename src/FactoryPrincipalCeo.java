import Depa.Principal;
import Depa.Secundario;

//manejadas por el ceo
public class FactoryPrincipalCeo implements AbstractFactory{

    @Override
    public Principal crearPrincipal(String nombre, int numeroDepa, String manejador) {
        return new Principal();
    }

    @Override
    public Secundario crearSecundario(String nombre, int numeroDepa, String manejador) {
        return new Secundario();
    }
}
