/* HW9
 * Due: 3 December 2017
 * Problem Header Hash Code: 81dd79160310b8cddaadc4c3c27c23bc
*/ 
package hw9;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patiw
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Graph graph = new Graph(32);
        for (int i=0; i<16; i++)
            graph.addVertex(i);
        graph.addEdge(0, 1);
        graph.addEdge(0, 5);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(2, 5);
        graph.addEdge(2, 3);
        graph.addEdge(3, 6);
        graph.addEdge(4, 8);
        graph.addEdge(5, 9);
        graph.addEdge(6, 7);
        graph.addEdge(6, 10);
        graph.addEdge(6, 9);
        graph.addEdge(7, 14);
        graph.addEdge(8, 9);
        graph.addEdge(8, 13);
        graph.addEdge(8, 12);
        graph.addEdge(10, 14);
        graph.addEdge(11, 15);
        graph.addEdge(13, 14);
        graph.addEdge(14, 15);

        graph.vertexList[0].showList();
        graph.vertexList[1].showList();
        graph.vertexList[5].showList();
        graph.vertexList[14].showList();
        graph.vertexList[11].showList();

        
        //graph.DFS();
        graph.printShortestPart(0,6);

        /*Graph graph = new Graph(32);
        for (int i=0; i<16; i++)
            graph.addVertex(i);
        graph.addEdge(0, 1);
        graph.addEdge(0, 5);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(2, 5);
        graph.addEdge(2, 3);
        graph.addEdge(3, 6);
        graph.addEdge(5, 9);
        graph.addEdge(6, 9);
        graph.addEdge(7, 14);
        graph.addEdge(8, 13);
        graph.addEdge(8, 12);
        graph.addEdge(10, 14);
        graph.addEdge(11, 15);
        graph.addEdge(14, 15);
        
        graph.DFS();
        
        System.out.println("\nNumber of connected component = " + (graph.cc));

        for (int i=0; i<16; i++)
            graph.vertexList[i].showList();
        
        /*
        long p = 101111; // Big Prime (Hash key1)
        long x = 101; // Small number (Hash key2)
        HashGraph graph = new HashGraph(32, p, x); 
        String[] cities = new String[]{"Dublin", "Edinburgh", "Manchester", 
            "Copenhagen", "Lisbon", "London", "Berlin", "Prague", "Madrid", 
            "Paris", "Vienna", "Budapest", "Geneva", "Milan", "Zurich", "Rome"};
        for (int i=0; i<16; i++){
            graph.addVertex(cities[i]);
        }
        
        graph.addEdge("Dublin", "Edinburgh");
        graph.addEdge("Dublin", "London");                
        graph.addEdge("Dublin", "Lisbon");
        graph.addEdge("Edinburgh", "Manchester");
        graph.addEdge("Manchester", "London");
        graph.addEdge("Manchester", "Copenhagen");
        graph.addEdge("Copenhagen", "Berlin");
        graph.addEdge("Lisbon", "Madrid");
        graph.addEdge("London", "Paris");
        graph.addEdge("Berlin", "Prague");
        graph.addEdge("Berlin", "Vienna");
        graph.addEdge("Berlin", "Paris");
        graph.addEdge("Prague", "Zurich");
        graph.addEdge("Madrid", "Paris");
        graph.addEdge("Madrid", "Milan");
        graph.addEdge("Madrid", "Geneva");
        graph.addEdge("Vienna", "Zurich");
        graph.addEdge("Budapest", "Rome");
        graph.addEdge("Milan", "Zurich");
        graph.addEdge("Zurich", "Rome");
        
        
        graph.vertexList[graph.hashMapWithQuadraticProbing("Paris")].showList();
        graph.vertexList[graph.hashMapWithQuadraticProbing("Zurich")].showList();
        graph.vertexList[graph.hashMapWithQuadraticProbing("Geneva")].showList();
        
        graph.printShortestPart("London", "Budapest");
        graph.printShortestPart("Berlin", "Dublin");
        */
    }
    
}

