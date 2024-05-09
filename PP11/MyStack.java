/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP11;

/**
 *
 * @author bhadr
 */
public class MyStack extends AbstractStack{
    
    // constructor pada class mystack
    public MyStack(int capacity){
        // memanggil constructor pada class utama dengan paramater capacity
        super(capacity);
    }
    
    // procedure displaystack
    public void displayStack(String s){
        System.out.println(s);
        // menampilkan stack bawah
        System.out.print("Stack (bottom-->) :");
        // pengulangan untuk memberikan nilai pada array ke i
        for(int i = 0; i < size(); i++){
            System.out.print(peekN(i) + " ");
        }
        System.out.println("");
    }
    
    // function peek N berfungsi sebagai menampilkan data pada array
    public  int peekN(int n){
        return arr[n];
    }
    
}
