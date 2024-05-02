/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP10;

/**
 *
 * @author bhadr
 */
public class StakTest {
    public static void main(String[] args) {
        
        // memanggil objek stak
        StrukturStack stack = new StrukturStack(3);
        
        // SEBELUM PUSH
        // CEK SIZE
        System.out.println("size: " + stack.size());
        // CEK EMPTY
        System.out.println("empty: " + stack.isEmpty());
        // CEK FULL
        System.out.println("full: " + stack.isFull());
        // CEK TOP
        System.out.println("top: " + stack.getTop());
        // CEK ELEMENT FROM TOP
        System.out.print("element from top: ");
        stack.displayElement();
        System.out.println(" ");
        
        //push  
        stack.push(2);
        stack.push(4);
        stack.push(1);
        
        // SESUDAH PUSH 3X
        System.out.println(" ");
        // CEK SIZE
        System.out.println("size: " + stack.size());
        // CEK EMPTY
        System.out.println("empty: " + stack.isEmpty());
        // CEK FULL
        System.out.println("full: " + stack.isFull());
        // CEK TOP
        System.out.println("top: " + stack.getTop());
        // CEK ELEMENT FROM TOP
        System.out.print("element from top: ");
        stack.displayElement();
        System.out.println(" ");
        
        // POP
        stack.pop();
        
        // SESUDAH POP
         System.out.println(" ");
        // CEK SIZE
        System.out.println("size: " + stack.size());
        // CEK EMPTY
        System.out.println("empty: " + stack.isEmpty());
        // CEK FULL
        System.out.println("full: " + stack.isFull());
        // CEK TOP
        System.out.println("top: " + stack.getTop());
        // CEK ELEMENT FROM TOP
        System.out.print("element from top: ");
        stack.displayElement();
        System.out.println(" ");
    }
}
