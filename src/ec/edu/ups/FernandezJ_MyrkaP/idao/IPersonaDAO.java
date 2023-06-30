
package ec.edu.ups.FernandezJ_MyrkaP.idao;
import java.util.List;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Persona;


public interface IPersonaDAO {
    public void create(Persona p);
    public Persona read(int id);
    public void update(Persona p);
    public void delete(Persona p);
    public Persona buscarCantantePorDisco(String n);
    public Persona buscarCompositorPorCancion(String n);
    public List<Persona> findAll();
}
