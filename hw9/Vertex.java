/* HW9
 * Due: 3 December 2017
 * Problem Header Hash Code: 81dd79160310b8cddaadc4c3c27c23bc
*/ 
package hw9;

/**
 *
 * @author patiwet.w
 */
public class Vertex {
    
    // Vertex properties
    String str;
    int key;
    int ccNum;
    boolean visited;
    int dist;
    
    // Vertex previous pointer for constructing shortest-path tree
    Vertex prev; // Do not get confused with Node prev pointer
    Vertex next; // Do not get confused with Node next pointr
    
    // List properties
    Node head;
    Node tail;

    public Vertex(int key){
        this.key = key;
        this.str = Integer.toString(key);
    }

    // This function will test if a vertex with the key is connected to the current vertex
    public boolean isConnected(int key){ 
        Node node = head;
            // Do something with the node
        while (node!=null)
        {
            if(node.vertex.key == key)
            {
                return true;
            }
            node = node.next;
        }
        return false;
    }


    // Create a list of nodes by adding a new node (containing a vertex) to the tail 
    public void append(Vertex linkedVertex){
        if (head==null){
            // Create a new node and add somewhere to the list
            head = new Node(linkedVertex);
            tail = head;
        }else{
            // Create a new node and add somewhere to the list
            Node temp = new Node(linkedVertex);
            tail.next = temp;
            tail = temp;
        }
    }
    
    public void showList(){
        Node node = head;
        System.out.print("Vertex " + str + " connected to the following vertices: ");
        while(node!=null){
            System.out.print(node.vertex.str + ", ");
            node = node.next;
        }
        System.out.println();
    }
}
