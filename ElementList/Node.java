/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ElementList;

/**
 *
 * @author bhadr
 */
public class Node {
    private int nilai;
    private Node next;
    private String nama;
    
    public Node(int nilai){
        this.nilai = nilai;
    }
    
    
//    Setter dan getter
    public void SetNilai(int nilai){
        this.nilai = nilai;
    }

    public int GetNIlai(){
        return nilai;
    }
    
    public void SetNext(Node next){
        this.next = next;
    }
    
    public Node GetNext(){
        return next;
    }
}
