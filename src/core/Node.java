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
public class Node {
    
    int number;
    Pair node1;
    Pair node2;
    
    public Node(int number){
        this.number = number;
        this.node1 = null;
        this.node2 = null;
    }

    public int getNumber() {
        return number;
    }

    public Pair getNode1() {
        return node1;
    }

    public void setNode1(Pair node1) {
        this.node1 = node1;
    }

    public Pair getNode2() {
        return node2;
    }

    public void setNode2(Pair node2) {
        this.node2 = node2;
    }
    
    @Override
    public String toString(){
        String a, b;
        if(node1 != null){
            a = node1.toString();
        }else{
            a = "";
        }
        if(node2 != null){
            b = node2.toString();
        }else{
            b = "";
        }
        return "Del Nodo " + number + ": " + a + b;
    }
    
}
