
package Biblioteca;


public class Libro {
    
    private String tituloDelLibro;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    // Constructor por defecto
    public Libro() {
        this.tituloDelLibro = "";
        this.autor = "";
        this.numEjemplares = 0;
        this.numEjemplaresPrestados = 0;
    }

    // Constructor con parametros
    public Libro(String tituloDelLibro, String autor, int numEjemplares, int numEjemplaresPrestados) {
        this.tituloDelLibro = tituloDelLibro;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    // Metodos Setters/getters
    public String getTituloDelLibro() {
        return tituloDelLibro;
    }

    public void setTituloDelLibro(String titulo) {
        this.tituloDelLibro = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    // Metodo prestamo
    public boolean prestamo() {
        if (numEjemplaresPrestados < numEjemplares) {
            numEjemplaresPrestados++;
            return true;
        } else {
            return false;
        }
    }

    // Metodo devolucion
    public boolean devolucion() {
        if (numEjemplaresPrestados > 0) {
            numEjemplaresPrestados--;
            return true;
        } else {
            return false;
        }
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + tituloDelLibro + '\'' +
                ", autor='" + autor + '\'' +
                ", numEjemplares=" + numEjemplares +
                ", numEjemplaresPrestados=" + numEjemplaresPrestados +
                '}';
    }
}

    
