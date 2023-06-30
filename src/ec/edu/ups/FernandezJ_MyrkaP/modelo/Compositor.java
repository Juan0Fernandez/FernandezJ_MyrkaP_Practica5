package ec.edu.ups.FernandezJ_MyrkaP.modelo;

import java.util.List;
import java.util.Objects;

public class Compositor extends Persona{
    private int numeroDeComposiciones;
    private List<Cancion> cancionesTop100Billboard;
    private List<Cantante> clientes;

    public Compositor(int numeroDeComposiciones, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario, List<Cancion> cancionesTop100Billboard, List<Cantante> clientes) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.numeroDeComposiciones = numeroDeComposiciones;
        this.cancionesTop100Billboard = cancionesTop100Billboard;
        this.clientes = clientes;
        super.setSalario(calcularSalario());
    }
    
    public double calcularSalario(){
        double s=getSalario();
        if(numeroDeComposiciones>5){
            s+=300;
        }
        if(cancionesTop100Billboard.size()>0 && cancionesTop100Billboard.size()<4){
            s*=1.1;
        }
        if(cancionesTop100Billboard.size()>3 && cancionesTop100Billboard.size()<7){
            s*=1.2;
        }
        if(cancionesTop100Billboard.size()>6){
            s*=1.2;
        }
        return s;
    }
    
    public void agregarCancion(int codigo, String titulo, String letra, double tiempoEnMinutos){
        cancionesTop100Billboard.add(new Cancion(codigo, titulo, letra, tiempoEnMinutos));
    }
    
    public void agregarCliente(Cantante cliente){
        clientes.add(cliente);
    }

    public int getNumeroDeComposiciones() {
        return numeroDeComposiciones;
    }

    public void setNumeroDeComposiciones(int numeroDeComposiciones) {
        this.numeroDeComposiciones = numeroDeComposiciones;
    }

    public List<Cancion> getCancionesTop100Billboard() {
        return cancionesTop100Billboard;
    }

    public void setCancionesTop100Billboard(List<Cancion> cancionesTop100Billboard) {
        this.cancionesTop100Billboard = cancionesTop100Billboard;
    }

    public List<Cantante> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cantante> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Compositor: "+super.toString()+"\nNumero de Composiciones: " + numeroDeComposiciones + 
                "\nCanciones Top 100 Billboard: " + cancionesTop100Billboard + "\nClientes:" + 
                clientes + "\nSalario: "+calcularSalario() +"\n";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.numeroDeComposiciones;
        hash = 41 * hash + Objects.hashCode(this.cancionesTop100Billboard);
        hash = 41 * hash + Objects.hashCode(this.clientes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compositor other = (Compositor) obj;
        if (this.numeroDeComposiciones != other.numeroDeComposiciones) {
            return false;
        }
        if (!Objects.equals(this.cancionesTop100Billboard, other.cancionesTop100Billboard)) {
            return false;
        }
        return Objects.equals(this.clientes, other.clientes);
    }
    
    
}
