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
public class Lloc {
    private int lloc_id;
    private int num_bloc;
    private int num_passadis;
    private int num_lleixa;

    public Lloc() {
    }

    public Lloc(int lloc_id, int num_bloc, int num_passadis, int num_lleixa) {
        this.lloc_id = lloc_id;
        this.num_bloc = num_bloc;
        this.num_passadis = num_passadis;
        this.num_lleixa = num_lleixa;
    }

    public int getLloc_id() {
        return lloc_id;
    }

    public void setLloc_id(int lloc_id) {
        this.lloc_id = lloc_id;
    }

    public int getNum_bloc() {
        return num_bloc;
    }

    public void setNum_bloc(int num_bloc) {
        this.num_bloc = num_bloc;
    }

    public int getNum_passadis() {
        return num_passadis;
    }

    public void setNum_passadis(int num_passadis) {
        this.num_passadis = num_passadis;
    }

    public int getNum_lleixa() {
        return num_lleixa;
    }

    public void setNum_lleixa(int num_lleixa) {
        this.num_lleixa = num_lleixa;
    }
    
        
       
    
}
