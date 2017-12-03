/* HW9
 * Due: 3 December 2017
 * Problem Header Hash Code: 81dd79160310b8cddaadc4c3c27c23bc
*/ 
package hw9;

/**
 *
 * @author patiwet.w
 */
public class Graph {
    Vertex[] vertexList;
    int cap;
    int size;
    int cc;
    public static final int INFINITY = -1;
    public Graph(int cap){
        this.cap = cap;
        size = 0;
        vertexList = new Vertex[cap];
    }
    
    public void addVertex(int key){
        if (size==cap){
            System.out.println("Vertex list is full. You need to recreate the Graph");
            return;
        }
        // Create a new vertex and place it at the appropriate location of the vertexList
        Vertex temp = new Vertex(key);
        vertexList[temp.key] = temp;
        size++;
    }
    
    // Two way edge
    // If you make a path from source to destination, you must make a path from the destination to the source
    public void addEdge(int source, int destination){
        if (vertexList[source]==null){
            System.out.println("Source node does not exist");
            return;
        } if (vertexList[destination]==null){
            System.out.println("Destination node does not exist");
            return;
        }
        // Check if there is already a path from source to destination
        if (!vertexList[source].isConnected(destination) && !vertexList[destination].isConnected(source)){
            // Call a function to connect the source vertex to the destination vertex
            //
            // Call a function to connect the destination vertex to the source vertex
            //
            vertexList[source].append(vertexList[destination]);
            vertexList[destination].append(vertexList[source]);
        }else{
            System.out.println("There are already a path conntecting "+source+" and "+destination);
        }
    }
    
    public void DFS(){
        // Do something
        cc = 0;
        for(int i=0;i<size;i++)
        {
            if(vertexList[i].visited)
            {
                continue;
            }
            else
            {
                cc++;
                Explore(vertexList[i]);
            }
        }
    }
    public void Explore(Vertex v){
        // Do something here
        v.ccNum = cc;
        Stack stack = new Stack();
        stack.push(v);
        stack.head.vertex.visited = true;
        // Print vertex
        System.out.print(v.key +"/"+ v.ccNum +"->");

        // Also Do something here
        while (!stack.isEmpty()) {
            Node curl = stack.head.vertex.head;
            while (true) {
                if (curl == null) {
                    stack.pop();
                    break;
                } else if (!curl.vertex.visited) {
                    curl.vertex.visited = true;
                    curl.vertex.ccNum = cc;
                    System.out.print(curl.vertex.key + "/" + curl.vertex.ccNum + "->");
                    stack.push(curl.vertex);
                    break;
                } else {
                    curl = curl.next;
                }
            }
        }
        System.out.println("");
    }
    public void BFS(int s) {
        for (int i = 0; i < cap; i++) {
            if (vertexList[i] != null) {
                // Do something inside here (Hint: Initialization)
                vertexList[i].visited = false;
                vertexList[i].dist = 0;
            }
        }

        // Do something here
        Queue queue = new Queue(vertexList[s]);
        queue.head.vertex.visited = true;
        while (!queue.isEmpty())
        {
            Node curl = queue.head.vertex.head;
            Vertex mem = queue.head.vertex;
            while (curl!=null){
                if(!curl.vertex.visited)
                {
                    curl.vertex.dist = mem.dist + 1;
                    curl.vertex.visited = true;
                    mem.next = curl.vertex;
                    curl.vertex.prev = mem;
                    queue.enqueue(curl.vertex);
                }
                curl = curl.next;
            }
            queue.dequeue();
        }
    }
    
    public Stack getShortestPathList(int s_key, int u_key){
        Stack s = new Stack();//integer
        // Do something here
        Vertex temp = vertexList[u_key];
        while (true)
        {
            if(temp.prev == null)
            {
                break;
            }
            else
            {
                s.push(temp);
                temp = temp.prev;
            }
        }
        s.push(vertexList[s_key]);
        return s;
    }
    public void printShortestPart(int s, int u){
        BFS(s);
        Stack stack = getShortestPathList(s, u);
        // Print something here
        while (!stack.isEmpty())
        {
            System.out.print(stack.pop().key + " ");
        }
    }
}
