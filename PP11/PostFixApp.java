/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP11;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author bhadr
 */
public class PostFixApp {
    
    // buat class main dan tampilkan error
    public static void main(String[] args) throws IOException {
        // deklarasi variable serta tipe data
        String input;
        int output;
        
        
        // lakukan pengulangan
        while(true){
            // masukan postfix
            System.out.println("Enter postfix: ");
            System.out.flush();
            //  ambil data yang telah diketikan
            input = getString();
            
            // ketikan input kosong, keluar dari while
            if(input.equals("")){
                break;
            }
            // deklarasi objek parseposr
            ParsePost aParser = new ParsePost(input);
            
            // lakukan parse pada data
            output = aParser.doParse();
            // kembalikan hasil data
            System.out.println("Hasil operasi: " + output);
        }   
            
    }
    
    // buat procedure getString untuk input data
    public static String getString() throws IOException{
        // panggil object scanner
        Scanner scanner = new Scanner(System.in);
        // ambil data yang diketikan
        String s  = scanner.nextLine();
        // kembalikan data yang diketikan
        return s;
    }
}
