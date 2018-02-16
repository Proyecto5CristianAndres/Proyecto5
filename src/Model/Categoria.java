package model;
/**
 *
 * @author Cristian
 */
public class Categoria {
    private int categoria_id;
    private String categoria_nom;

    public Categoria() {
    }

    public Categoria(int categoria_id, String categoria_nom) {
        this.categoria_id = categoria_id;
        this.categoria_nom = categoria_nom;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getCategoria_nom() {
        return categoria_nom;
    }

    public void setCategoria_nom(String categoria_nom) {
        this.categoria_nom = categoria_nom;
    }
    
    
}