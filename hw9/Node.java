/* HW9
 * Due: 3 December 2017
 * Problem Header Hash Code: 81dd79160310b8cddaadc4c3c27c23bc
*/ 
package hw9;

/**
 *
 * @author Patiwet
 */
public class Node {
    // Node properties
    Vertex vertex; // Point to Vertex in the Vertex list
    Node next; // Point to next node in the list
    
    public Node(Vertex vertex){
        this.vertex = vertex;
    }
}
