package core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus K555L
 */
public class Pair {
    
    int node;
    int trans;

    public Pair(int node, int trans) {
        this.node = node;
        this.trans = trans;
    }

    public int getNode() {
        return node;
    }

    public int getTrans() {
        return trans;
    }
    
    @Override
    public String toString(){
        return "Al nodo " + node + " con transicion " + trans + ". ";
    }
}
