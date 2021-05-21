package examen.pkg1p2_pabloguevara;

public class Libros {
    private String titulo;
    private String descripcion;
    private int puntaje;
    private int copiasDisponible;
    private String genero;
    private float precio;
    private String edicion;
    private String autor;
    private int añoPublicacion;

    public Libros() {
    }

    public Libros(String titulo, String descripcion, int puntaje, int copiasDisponible, String genero, float precio, String edicion, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.puntaje = puntaje;
        this.copiasDisponible = copiasDisponible;
        this.genero = genero;
        this.precio = precio;
        this.edicion = edicion;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getCopiasDisponible() {
        return copiasDisponible;
    }

    public void setCopiasDisponible(int copiasDisponible) {
        this.copiasDisponible = copiasDisponible;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
    
    
}
