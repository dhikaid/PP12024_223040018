/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP10;

/**
 *
 * @author bhadr
 */
public class StrukturStack {
    
    // properti internal pada class
    private int[] array;
    private int capacity;
    private int TOP;
    
    // data yang tidak bisa diubah
    public final int MIN  = -1;
   
    
    //construktor strukturtack dengan paramater capacity
    public StrukturStack(int capacity){
        // untuk mengambil construktor induk
        super();
        // untuk membuat array dengan memanggil objek int sesuai dengan panjang capacity
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }
    
    // operasi untuk cek apakah stak full atau tidak
    public boolean isEmpty(){
        return (TOP == MIN);
    }
    
    // operasi jika stak itu full
    public boolean isFull(){
       // capacity - 1 karena array dimulai dari 0
        return (TOP == (capacity - 1));
    }
    
    // operasi untuk cek size pada stack
    public int size(){
       // top + 1 karena array dimulai dari 0
       return TOP + 1;
    }
    
    // operasi getter untuk top
    public int getTop(){
        // cek apakah empty 
        if(isEmpty()){
         System.out.println("Stack kosong");
         // jika iya kembalikan nilai min
         return MIN;   
        } else{
         // jika tidak tampilkan array sesuai dengan top
         return array[TOP];
        }
    }
    
    // operasi display
      public void displayElement(){
         // Cek apakah elemen kosong atau tidak
         if(isEmpty()){
             System.out.print("Stack kosong");
         } else{
            // jika ada tampilkan
            for(int i = TOP; i >=  0; i--){
                System.out.print(array[i] + " ");
           
            }
             System.out.println("");
         }
      
     }
    
    // OPERASI PUSH digunakan untuk menambahkan data pada stack
    public void push(int data){
        // kondisi jika stack itu penuh
        if(isFull()){
            System.out.println("STACK PENUH");
        }else{   
            // jika stack itu masih ada
            TOP++;
            // memasukan data stack pada array
            array[TOP] = data;
            
        }
    }
    
    
    // OPERASI pop untuk menghapus elemen akhir yang ditambahkan
    public int pop(){
        // inisialisasi temp
        int temp = 0; 
        
        // jika empty maka tampilkan stok kosong
        if(isEmpty()){
            System.out.println("Stak kosong");
        } else {
            // jika tidak simpan data ke variable temp
            temp = array[TOP];
            TOP = TOP - 1;
        }
        // kembalikan data
        return temp;
    }
}
