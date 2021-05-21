package examen.pkg1p2_pabloguevara;

import java.util.ArrayList;
import java.util.Date;

public class Usuarios {
    private String nombreUsuario;
    private String contraseña;
    private Date fechaNacimiento;
    private int numeroTelefonico;
    private String correoElec;
    private String nombreCompleto;
    private String generoFavoritoLec;
    private ArrayList<Usuarios> ListaAmigos=new ArrayList();
    private ArrayList<Libros> ListaLibros=new ArrayList();

    public Usuarios() {
    }

    public Usuarios(String nombreUsuario, String contraseña, Date fechaNacimiento, int numeroTelefonico, String correoElec, String nombreCompleto, String generoFavoritoLec) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefonico = numeroTelefonico;
        this.correoElec = correoElec;
        this.nombreCompleto = nombreCompleto;
        this.generoFavoritoLec = generoFavoritoLec;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(int numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getCorreoElec() {
        return correoElec;
    }

    public void setCorreoElec(String correoElec) {
        this.correoElec = correoElec;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getGeneroFavoritoLec() {
        return generoFavoritoLec;
    }

    public void setGeneroFavoritoLec(String generoFavoritoLec) {
        this.generoFavoritoLec = generoFavoritoLec;
    }

    public ArrayList<Usuarios> getListaAmigos() {
        return ListaAmigos;
    }

    public void setListaAmigos(ArrayList<Usuarios> ListaAmigos) {
        this.ListaAmigos = ListaAmigos;
    }

    public ArrayList<Libros> getListaLibros() {
        return ListaLibros;
    }

    public void setListaLibros(ArrayList<Libros> ListaLibros) {
        this.ListaLibros = ListaLibros;
    }
    
    
}
