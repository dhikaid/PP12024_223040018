/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP10;

import PP9.*;

/**
 *
 * @author bhadr
 */
public class Node {
    private int data;
    Node next;
    
    
//    inisialisasi
    public Node(int data) {
        this.data = data;
    }
    
   
//    Setter dan getter
    public void SetData(int data){
        this.data = data;
    }

    public int GetData(){
        return data;
    }
    
    public void SetNext(Node next){
        this.next = next;
    }
    
    public Node GetNext(){
        return next;
    }
    
}
