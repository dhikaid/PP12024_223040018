/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP6;

/**
 *
 * @author bhadr
 */
public class StrukturListTest {
    
    public static void main(String[] args) {
        StrukturList sl = new StrukturList();
        
//      isikan elemen
        sl.AddTail(4);
        sl.AddTail(3);
        sl.AddTail(7);
        sl.AddTail(8);
        sl.AddTail(1);
        sl.AddTail(9);

//      tampilkan
        System.out.println("SEBELUM");
        sl.displayElement();
        System.out.println("");        
        
//      hapus
        int size = sl.size();
        for(int i = 0; i < size; i++){
            sl.removeTail();
        }
     
//      tampilkan
        System.out.println("SESUDAH");
        sl.displayElement();
        System.out.println("");            
    }
}


// LAT
//      isikan elemen
//        sl.AddTail(7);
//        sl.AddTail(6);
//        sl.AddTail(4);
//        sl.AddTail(2);
//        sl.AddTail(3);
//
////      tampilkan
//        sl.displayElement();
//        
////      tampilkan ukuran elemen list
//        System.out.println("");
//        System.out.println(sl.size());