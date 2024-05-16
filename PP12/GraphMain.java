/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP12;

/**
 *
 * @author bhadr
 */
public class GraphMain {
    public static void main(String[] args) {
        // buat objek dari graph
        Graph graph = new Graph(4);
        
        // menambahkan vertex
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        
        // menambahkan edge
        graph.addEdge(0, 1);
        graph.addEdge(1, 3);
        graph.addEdge(0, 3);
        graph.addEdge(0, 2);
        graph.adjacencyMatrix();
        System.out.println(" ");
    }
}
