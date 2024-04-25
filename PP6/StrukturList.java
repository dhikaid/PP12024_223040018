/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP6;


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
    
    
    public void removeMid(int e){
        Node preNode = new Node(0);
        Node tempNode;
        int i;
        boolean ketemu;
        
        if (isEmpty()){
            System.out.println("Element list kosong");
        } else {
            ketemu = false;
            i = 1;
            tempNode = HEAD;
            while(tempNode.GetNext() != null && !ketemu){
                if(tempNode.GetData() == e){
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.GetNext();
                    i++;
                }
            }
            if(ketemu == true){
                if(i == 1){
                    HEAD = null;
                } else {
                    preNode.SetNext(tempNode.GetNext());
                    dispose(tempNode);
                }
            }
        }
    }

    public void removeHead(){
        if(isEmpty()){
            System.out.println("List kosong");
        } else {
            Node temp = HEAD;
            HEAD = HEAD.GetNext();
            dispose(temp);
        }
    }
    
    public void removeTail(){
        Node preNode = null, lastNode;
        if(HEAD != null){
            if(HEAD.GetNext() == null){
                HEAD = null;
            } else {
                lastNode = HEAD;
                while(lastNode.GetNext() != null){
                    preNode = lastNode;
                    lastNode = lastNode.GetNext();
                }
                preNode.SetNext(null);
                dispose(lastNode);
            }
        }     
    }
    
    public boolean find (int x) {    
        Node curNode = HEAD;
        boolean ketemu = false;
        
        while(curNode != null && !ketemu) {
            
            if(curNode.GetData() == x) {
                ketemu = true;
            } else {
               curNode = curNode.GetNext();
            }

        }
        
        return ketemu;
    }
    
    public int size(){
        
        Node curNode = HEAD;
        int jumlah = 0;
        
        while(curNode != null){
         jumlah = jumlah + 1;
         curNode = curNode.GetNext();
        }
        
        return jumlah;
 
    }
    
    
    
    public boolean isEmpty() {
        return HEAD == null;
    }
    private void dispose(Node node) {
        node.SetNext(null);
    }


}
