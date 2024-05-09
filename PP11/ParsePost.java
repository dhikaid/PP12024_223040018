/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP11;

/**
 *
 * @author bhadr
 */


public class ParsePost {
    // deklarasi variable objeck stack dan string input
    private MyStack stack;
    private String input;
    
    // konstruktor parse pot dengan paramater string input
    public ParsePost(String input){
        // menamggil kelas utama konstruktor
        super();
        // memasukan data ke variable input
        this.input = input;
    }
    
    
    // fungsi doparse
    // fungsi proses input berapa ekspresi artimatika pada postfix
    // menghasilkan nilai artimatika
    public int doParse(){
     // inisiasi object mystack dengan panjang 20
     stack = new MyStack(20);
     // inisiasi tipe data serta variable
     char ch;
     int i;
     int bill, bill2, hasilOps;

     // lakukan perulangan sesuai dengan panjang parsepost
     for(i = 0; i< input.length(); i++){
         ch = input.charAt(i);
         stack.displayStack(" "+ ch + " ");

         // kondisi jika ch lebih dari 10 serta kurang dari 9
         if(ch >= '0' && ch <= '9'){
             // tambahkan nilai pada array push 
             stack.push(Character.getNumericValue(ch));
         } else{
             // hapus stack pada element akhir
             bill2 = stack.pop();
             bill = stack.pop();
             // switch case apabila nilai terdapat operasi matematika 
             switch(ch){
                 case '+': hasilOps = bill + bill2; break;
                 case '-': hasilOps = bill - bill2 ; break;
                 case '*': hasilOps = bill * bill2 ; break;
                 case '/': hasilOps = bill / bill2 ; break;
                 default: hasilOps = 0;
             }
             // hasil artimatika kembalikan ke array
             stack.push(hasilOps);
         } 
     }

     hasilOps = stack.pop();
     // kembalikan hasil artimatika
     return hasilOps;
 }

    
}
