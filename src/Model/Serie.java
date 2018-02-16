/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Cristian
 */
public class Serie {
    private int serie_id;
    private String serie_nom;
    private int categoria_id;

    public Serie() {
    }

    public Serie(int serie_id, String serie_nom, int categoria_id) {
        this.serie_id = serie_id;
        this.serie_nom = serie_nom;
        this.categoria_id = categoria_id;
    }

    public int getSerie_id() {
        return serie_id;
    }

    public void setSerie_id(int serie_id) {
        this.serie_id = serie_id;
    }

    public String getSerie_nom() {
        return serie_nom;
    }

    public void setSerie_nom(String serie_nom) {
        this.serie_nom = serie_nom;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }
    
    
}
