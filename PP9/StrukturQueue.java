/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP9;

/**
 *
 * @author bhadr
 */
public class StrukturQueue {

//Atribut Node
Node HEAD;

//Atribut Front dan REAR dengan tipe data Node
//untuk menambahkan dan menggantikan node sebelum node dan sesudah nodenya
Node REAR;
Node FRONT;

// OPERASI ENQUEUE, memasukan elemen kedalam queue
    public void enqueque(int data){
//      OBJECT, memanggil object node dengan paramater data kedalam object
        Node newNode = new Node(data);
        
//      isEmpty Cek head apakah ada atau tidak  
        if(isEmpty()){
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.SetNext(newNode);
            REAR = newNode;
        }
    }
    
//  FUNCTION Empty cek isi elemen/node kosong atau tidak, jika iya = true
     public boolean isEmpty() {
        return FRONT == null;
     }
     
// FUCTION Size berfungsi sebagai mengembalikan jumlah elemen yang ada di queue
     public int size(){
         int size = 0;
//       menginsialisasi curNode sebagai front;
         Node curNode = FRONT;
//       mengulangi hinggal curNode selesai
         while(curNode != null) {
            size++;   
            curNode = curNode.GetNext();
         }
         
//       mengembalikan jumlah size
         return size;
     }
        
// Function front berfungsi sebagai mengembalikan elemen yang ditunjuk oleh penunjuk FRONT
     public int front(){
        return FRONT != null ? FRONT.GetData() : -1;
     }
 
     
// Procedure displayElement yang berfungsi untuk
//menampilkan elemen yang ada di queue  
     public void displayElement(){
         // Cek apakah elemen kosong atau tidak
         if(isEmpty()){
             System.out.print("Element kosong");
         } else{
            // jika ada tampilkan
            Node curNode = FRONT;
            while(curNode != null){
                System.out.print(curNode.GetData() + " ");
                curNode = curNode.GetNext();
            }
         }
      
     }
     
// OPERASI DEQUEUE, Untuk menghapus elemen awal / FIFO
     public void dequeue(){
         if(isEmpty()){
             System.out.println("Data masih kosong");
         } else {
             Node tempFRONT = FRONT;
             FRONT = FRONT.GetNext();
             REAR = null;
             tempFRONT = null;
         }
         
         
     }
     
}
