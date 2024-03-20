/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP7;

/**
 *
 * @author bhadr
 */
public class ListMkTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
       
       list.AddTail(new MataKuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
       list.addMid(new MataKuliah("IF003", "Struktur Diskrit", 3),2);
       list.addMid(new MataKuliah("IF002", "Pemograman Web", 3),3);
       list.AddTail(new MataKuliah("IF001", "Dasar Pemograman", 4));
       list.displayElement();
    }
}
