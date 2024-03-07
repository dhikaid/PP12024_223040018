/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP4;

import ListAdd.*;

/**
 *
 * @author bhadr
 */ 
public class StrukturList {
    Node HEAD;

    
    public void AddTail(double data){
     Node posNode = null, curNode;
     
     Node newNode = new Node(data);
     
     if(HEAD == null){
         HEAD = newNode;
     }else {
      curNode= HEAD;
      while(curNode != null){
          posNode = curNode;
          curNode = curNode.GetNext();
      }
      posNode.next = newNode;
     }
    }
    
    public void displayElement(){
        Node curNode = HEAD;
        while(curNode != null){
            System.out.print(curNode.GetData() + " ");
            curNode = curNode.GetNext();
        }
    }
    
    public void addMid(double data, int position){
        Node curNode,posNode = null;
        int i;
        Node newNode = new Node(data);
        if(HEAD == null) {
            HEAD = newNode;
        }else{
           curNode = HEAD;   
           if(position == 1){
               newNode.next = curNode;
               HEAD = newNode;
           }else {
                i = 1;
                while(curNode != null && i < position){
                    posNode = curNode;
                    curNode = curNode.next;
                    i++;
                }
                posNode.next = newNode;
                newNode.next = curNode;
                
           }
        }
        
    }
    
    public void addHead(double data) {
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            newNode.SetNext(HEAD);
            HEAD = newNode;
        }
    }
}
