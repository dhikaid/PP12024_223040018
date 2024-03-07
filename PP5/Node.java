/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP5;

import PP4.*;
import ListAdd.*;

/**
 *
 * @author bhadr
 */
public class Node {
    private double data;
    Node next;
    
    
//    inisialisasi
    public Node(double data) {
        this.data = data;
    }
    
   
//    Setter dan getter
    public void SetData(double data){
        this.data = data;
    }

    public double GetData(){
        return data;
    }
    
    public void SetNext(Node next){
        this.next = next;
    }
    
    public Node GetNext(){
        return next;
    }
    
}
