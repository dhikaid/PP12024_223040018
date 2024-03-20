/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP7;

import PP6.*;
import PP5.*;
import PP4.*;
import ListAdd.*;

/**
 *
 * @author bhadr
 */
public class Node {
    private MataKuliah data;
    Node next;
    
    
//    inisialisasi
    public Node(MataKuliah data) {
        this.data = data;
    }
    
   
//    Setter dan getter
    public void SetData(MataKuliah data){
        this.data = data;
    }

    public MataKuliah GetData(){
        return data;
    }
    
    public void SetNext(Node next){
        this.next = next;
    }
    
    public Node GetNext(){
        return next;
    }
    
}
