/* HW9
 * Due: 3 December 2017
 * Problem Header Hash Code: 81dd79160310b8cddaadc4c3c27c23bc
*/ 
package hw9;

/**
 *
 * @author Patiwet
 */
public class Queue {
    Node head;
    Node tail;
    
    public Queue(Vertex v){
        head = new Node(v);
        tail = head;
    }
    
    public void enqueue(Vertex v){
        if (tail!=null){
            tail.next = new Node(v);
            tail = tail.next;
        }else{
            head = new Node(v);
            tail = head;
        }    
    }
    
    public Vertex dequeue(){
        Node node = head;
        head = head.next;
        if (head==null){
            tail = null;
        }
        return node.vertex;
    }

    public boolean isEmpty(){
        if (head == null) {
            return true;
        }
        else {
            return false;
        }
    }
}
