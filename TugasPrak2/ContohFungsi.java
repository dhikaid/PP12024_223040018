/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak2;

/**
 *
 * @author bhadr
 */
public class ContohFungsi {
    
//    fungsi tambah yang mengembalikan nilai tambah dari paramater a dan b
    public static int tambah(int a, int b){
        return a + b;
    }
    
    
//    fungsi kali yang mengembalikan nilai perkalian dari paramater a dan b
    public static int kali(int a, int b){
        return a * b;
    }
    
    public static void main(String[] args) {
        
//      membuat variable hasil penjumlahan yang berisikan memanggil fungsi tambah dari 5 + 3
        int hasilPenjumlahan = tambah(5,3);
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);   
//      output : Hasil penjumlahan: 8
        
        
//      membuat variable hasil perkalian yang berisikan memanggil fungsi perkalian dari 4 * 6      
        int hasilPerkalian = kali(4,6);
        System.out.println("Hasil perkalian: " + hasilPerkalian);
//      output : Hasil perkalian: 24
    }
}
