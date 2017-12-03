/* HW9
 * Due: 3 December 2017
 * Problem Header Hash Code: 81dd79160310b8cddaadc4c3c27c23bc
*/ 
package hw9;

/**
 *
 * @author Patiwet
 */
public class Stack {
    Node head;
    
    public void push(Vertex v){
        if (head!=null){
            Node node = new Node(v);
            node.next = head;
            head = node;            
        }else{
            head = new Node(v);
        }
    }
    
    public Vertex pop(){
        Node node = head;
        head = head.next;
        return node.vertex;
    }
    
    public boolean isEmpty(){
        if (head == null) {
            return true;
        }
        else
        {
            return false;
        }
    }
}
