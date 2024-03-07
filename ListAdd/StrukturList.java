/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListAdd;

/**
 *
 * @author bhadr
 */
public class StrukturList {
    Node HEAD;

    
    public void AddTail(int data){
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
}
