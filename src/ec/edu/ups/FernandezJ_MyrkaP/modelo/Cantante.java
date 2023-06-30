package ec.edu.ups.FernandezJ_MyrkaP.modelo;

import java.util.List;
import java.util.Objects;

public class Cantante extends Persona{
    private String nombreArtistico;
    private String generoMusical;
    private int numeroDeSencillos;
    private int numeroDeConciertos;
    private int numeroDeGiras;
    private List<Disco> discografia;

    public Cantante(String nombreArtistico, String generoMusical, int numeroDeSencillos, 
            int numeroDeConciertos, int numeroDeGiras, int codigo, 
            String nombre, String apellido, int edad, String nacionalidad, double salario, List<Disco> discografia) {
        
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.nombreArtistico = nombreArtistico;
        this.generoMusical = generoMusical;
        this.numeroDeSencillos = numeroDeSencillos;
        this.numeroDeConciertos = numeroDeConciertos;
        this.numeroDeGiras = numeroDeGiras;
        this.discografia = discografia;
        super.setSalario(calcularSalario());
    }

    public double calcularSalario(){
        double s=getSalario();
        if(numeroDeSencillos>10 && numeroDeGiras>3){
            s+=1000;
        }
        if(discografia.size()>4){
            s+=2000;
        }
        if(numeroDeSencillos>0 && numeroDeGiras<11){
            s*=1.05;
        }
        if(numeroDeGiras>0 && numeroDeGiras<4){
            s*=1.03;
        }
        return s;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public int getNumeroDeSencillos() {
        return numeroDeSencillos;
    }

    public void setNumeroDeSencillos(int numeroDeSencillos) {
        this.numeroDeSencillos = numeroDeSencillos;
    }

    public int getNumeroDeConciertos() {
        return numeroDeConciertos;
    }

    public void setNumeroDeConciertos(int numeroDeConciertos) {
        this.numeroDeConciertos = numeroDeConciertos;
    }

    public int getNumeroDeGiras() {
        return numeroDeGiras;
    }

    public void setNumeroDeGiras(int numeroDeGiras) {
        this.numeroDeGiras = numeroDeGiras;
    }

    public List<Disco> getDiscografia() {
        return discografia;
    }

    public void setDiscografia(List<Disco> discografia) {
        this.discografia = discografia;
    }
    
    public void agregarDisco(int codigo, String nombre, int anioDeLanza) {
        Disco disco = new Disco(codigo, nombre, anioDeLanza);
        this.discografia.add(disco);//Se agrega los discos  a la lista discografia
    }

    @Override
    public String toString() {
        return "Cantante:"+super.toString()+ "\nNombre Artistico: " + nombreArtistico + "\nGenero Musical: " + generoMusical 
                + "\n Numero de Sencillos: " + numeroDeSencillos + "\n Numero de Conciertos: " + numeroDeConciertos 
                + "\n Numero de Giras: " + numeroDeGiras + "\n Discografia: \n" + discografia + "\nSalario: "+calcularSalario()+"\n";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombreArtistico);
        hash = 79 * hash + Objects.hashCode(this.generoMusical);
        hash = 79 * hash + this.numeroDeSencillos;
        hash = 79 * hash + this.numeroDeConciertos;
        hash = 79 * hash + this.numeroDeGiras;
        hash = 79 * hash + Objects.hashCode(this.discografia);
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
        final Cantante other = (Cantante) obj;
        if (this.numeroDeSencillos != other.numeroDeSencillos) {
            return false;
        }
        if (this.numeroDeConciertos != other.numeroDeConciertos) {
            return false;
        }
        if (this.numeroDeGiras != other.numeroDeGiras) {
            return false;
        }
        if (!Objects.equals(this.nombreArtistico, other.nombreArtistico)) {
            return false;
        }
        if (!Objects.equals(this.generoMusical, other.generoMusical)) {
            return false;
        }
        return Objects.equals(this.discografia, other.discografia);
    }
    
    
    
}
