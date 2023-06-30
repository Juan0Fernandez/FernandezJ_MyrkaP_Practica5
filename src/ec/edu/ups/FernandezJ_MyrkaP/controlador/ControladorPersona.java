package ec.edu.ups.FernandezJ_MyrkaP.controlador;

import ec.edu.ups.FernandezJ_MyrkaP.idao.IPersonaDAO;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Cancion;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Cantante;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Compositor;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Disco;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Persona;

public class ControladorPersona {
    
    private Persona persona;
    
    private IPersonaDAO personaDAO;

    public ControladorPersona(IPersonaDAO personaDAO) {
        this.personaDAO = personaDAO;
        agregarParaPruebas();
    }
    
    public void agregarParaPruebas(){
        List<Disco> lstDisco = new ArrayList<>();
        lstDisco.add(new Disco(0, "En tus sueños", 1999));
        lstDisco.add(new Disco(1, "Musica", 2001));
        lstDisco.add(new Disco(2, "Atrapado", 2006));
        lstDisco.add(new Disco(3, "En tus sueños", 2015));
        
        personaDAO.create(new Cantante("Bauti", "Bachata", 2, 
                5, 0, 0, "Juan Esteban", "Zaruma", 
                25, "Ecuatoriano", 600, lstDisco));
        
       
        
        lstDisco = new ArrayList<>();
        lstDisco.add(new Disco (8, "Amar", 1999));
        personaDAO.create(new Cantante("Juanch0", "Salsa", 31, 
                20, 6, 1, "Juan Pedro", "Perez", 
                32, "Ecuatoriano", 7000, lstDisco));
        
        lstDisco = new ArrayList<>();
        lstDisco.add(new Disco (10, "Triste", 2020));
        lstDisco.add(new Disco (11, "Pais", 1985));
        lstDisco.add(new Disco (20, "Vida", 2005));
        personaDAO.create(new Cantante("Davss", "Reggae", 5, 
                5, 8, 2, "David", "Sas", 
                57, "Ecuatoriano", 2000, lstDisco));
        

        List<Cancion> lstCanciones = new ArrayList<>();
        lstCanciones.add(new Cancion(30, "Grave", "....", 4));
        lstCanciones.add(new Cancion(0, "Logica", "....", 4));
        lstCanciones.add(new Cancion(1, "Sustancia", "....", 4));
        lstCanciones.add(new Cancion(2, "Perturbador", "....", 4));
        lstCanciones.add(new Cancion(3, "Optimista", "....", 4));
        lstCanciones.add(new Cancion(4, "Comun", "....", 4));
        lstCanciones.add(new Cancion(5, "Accidente", "....", 4));
        lstCanciones.add(new Cancion(6, "Evitar", "....", 4));
        
         List<Cantante> lstCantantes = new ArrayList<>();
        lstCantantes.add((Cantante)personaDAO.findAll().get(0));
        lstCantantes.add((Cantante)personaDAO.findAll().get(1));
        
        personaDAO.create(new Compositor(50, 4, "Fernando", 
                "Ros", 21, "Argentina", 2500, lstCanciones, lstCantantes));
        
        lstCanciones = new ArrayList<>();
        lstCanciones.add(new Cancion(0, "Talento", "....", 4));
        lstCanciones.add(new Cancion(1, "Oculto", "....", 4));
        lstCanciones.add(new Cancion(2, "Sesgo", "....", 4));
        
        personaDAO.create(new Compositor(50, 5, "Julio", 
                "Tro", 45, "Brasil", 3562, lstCanciones, lstCantantes));
        
        personaDAO.create(new Compositor(50, 6, "Vicente", 
                "Mur", 33, "Suecia", 9601, lstCanciones, lstCantantes));
    }
    
    public void crear(Persona persona){
        this.persona = persona;
        personaDAO.create(persona);
    }
    
    public List<Persona> listar(){
        return personaDAO.findAll();
    }
    
    public void agregarCliente(Compositor compositor, Cantante cliente){
        compositor.agregarCliente(cliente);
    }
    
    public Persona buscarPorCodigo(int codigo){
        persona = personaDAO.read(codigo);
        return persona;
    }
    
    public Cantante buscarPorNombreDeDisco(String nombreDisco){
        persona = personaDAO.buscarCantantePorDisco(nombreDisco);
        return (Cantante) persona;
    }
    
    public Persona buscarPorNombreCancion(String nombreCancion){
        persona = personaDAO.buscarCompositorPorCancion(nombreCancion);
        return persona;
    }
    
}
