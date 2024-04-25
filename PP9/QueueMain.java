/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP9;

/**
 *
 * @author bhadr
 */
public class QueueMain {
    
    public static void main(String[] args) {
        //  Memanggil object queque
        StrukturQueue queue = new StrukturQueue();
    
        // Tampilkan size dan isEmpty
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.print("Elemen queue: " ); queue.displayElement();
        System.out.println("\n");
        
        
        // Tambah queue
        queue.enqueque(1);
        queue.enqueque(2);
        queue.enqueque(3);
        
        // Tampilkan size dan isEmpty
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.print("Elemen queue: " ); queue.displayElement();
        System.out.println("");
        System.out.println("Front: " + queue.front());
        System.out.println("");
        
        // DEQUEUE
        queue.dequeue();
        
        // Tampilkan size dan isEmpty
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.print("Elemen queue: " ); queue.displayElement();
        System.out.println("");
        System.out.println("Front: " + queue.front());
        
    }
    
}   
