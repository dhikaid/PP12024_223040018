/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ElementList;

/**
 *
 * @author bhadr
 */
public class NodeMainB {
    public static void main(String[] args) {
        
//      2 Buah node n1 sampai n5
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(7);
        Node n5 = new Node(9);
        
//      Membuat relasi node n1 sampai n5
        n1.SetNext(n2);
        n2.SetNext(n3);
        n3.SetNext(n4);
        n4.SetNext(n5);
        
//      Menampilan node n1 sampai n5 dengan pointer P
        Node p = n1;
        while(p != null){
            System.out.printf("%d ", p.GetNIlai());
            p = p.GetNext();
        }
        
    }
}
