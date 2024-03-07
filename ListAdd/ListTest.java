/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListAdd;

/**
 *
 * @author bhadr
 */
public class ListTest {
    public static void main(String[] args) {
        StrukturList a = new StrukturList();
        
        a.AddTail(3);
        a.AddTail(2);
        a.AddTail(1);
        a.AddTail(7);
        
        a.displayElement();
    }
}
