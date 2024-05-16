/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP12;

/**
 *
 * @author bhadr
 */
public class Graph {
    
    // properti array objek vertex
    private Vertex vertexList[];
    // properti array 2 dimensi adjMat 
    private int adjMat[][];
    // properti nVerts
    private int nVerts;
    
    // konstruktor paramater ma
    public Graph(int maxVerts){
        // objek vertex disimpan dalam variable vertexList
        vertexList = new Vertex[maxVerts];
        adjMat = new int[maxVerts][maxVerts];
        nVerts = 0;
     
        //membuat forloop untuk  mengetahui isi dalam array
        for(int i = 0; i < maxVerts; i++){
            for(int j=0; j < maxVerts; j++){
                adjMat[i][j] = 0;
            }
        }
        
    }
    
    // menambahkan array pada vertex
    public void addVertex(char lab){
        // panggil object vertex
        vertexList[nVerts++] = new Vertex(lab);
    }
    
    //menambahkan edge antar vertex
    public void addEdge(int start, int end){
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }
    
    
    //operasi adjancyMatrix berfungsi sebagai mengentahui
    //relasi antara dua vertex
   public void adjacencyMatrix(){
    //loop untuk untuk menampilkan isi array
    for(int i = 0; i < adjMat.length; i++){
        for(int j = 0; j < adjMat[0].length; j++){
            System.out.print(adjMat[i][j] + " ");
        }
        System.out.println(" ");
    }    
   }
}
