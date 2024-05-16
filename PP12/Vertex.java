/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP12;

/**
 *
 * @author bhadr
 */
public class Vertex {
    // properti pada class vertex
    private char label; 
    private boolean wasVisited;
    
    
    // konstruktor dengan paramater lab
    public Vertex(char lab){
        // mememberikan nilai default sesuai nilai paramater yang diisikan
        label = lab;
        wasVisited = false;
    }
    
    // SETTER DAN GETTER

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public boolean isWasVisited() {
        return wasVisited;
    }

    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
    
}
