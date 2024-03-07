/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ElementList;

/**
 *
 * @author bhadr
 */
public class NodeMain {
    public static void main(String[] args) {
        
//      2 Buah node n1 dan n2
        Node n1 = new Node(5);
        Node n2 = new Node(7);
        
//      Membuat relasi node n1 dan n2
        n1.SetNext(n2);

//      Menampilan node n1 sampai n5 dengan pointer P
        Node p = n1;
        while(p != null){
            System.out.printf("%d ", p.GetNIlai());
            p = p.GetNext();
        }
        
    }
}
