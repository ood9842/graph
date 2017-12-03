/* HW9
 * Due: 3 December 2017
 * Problem Header Hash Code: 81dd79160310b8cddaadc4c3c27c23bc
*/
package hw9;

/**
 *
 * @author patiw
 */
public class HashGraph extends Graph{

    long p; // Big Prime
    long x; // Small number

    public HashGraph(int cap, long p, long x){
        super(cap);
        this.p = p;
        this.x = x;
    }

    public void addVertex(String key){
        if (size==cap){
            System.out.println("Vertex list is full. You need to rehash");
            return;
        }
        int index = hashMapWithQuadraticProbing(key);
        vertexList[index] = new hw9.Vertex(index); // an Array of list contains many Lists
        vertexList[index].str = key;
        size++;
    }

    public void addEdge(String source, String destination){
        int sourceIndex = hashMapWithQuadraticProbing(source);
        int destinationIndex = hashMapWithQuadraticProbing(destination);
        super.addEdge(sourceIndex, destinationIndex);
    }

    public void BFS(String s){
        // Fix this
        int index = hashMapWithQuadraticProbing(s);///copy

        super.BFS(index);
    }

    public Stack getShortestPathList(String s, String u){
        // Fix this
        int F_key = hashMapWithQuadraticProbing(s);///copy
        int T_key = hashMapWithQuadraticProbing(u);

        return super.getShortestPathList(F_key, T_key);
    }

    public int hashMapWithQuadraticProbing(String s){
        int index = (int)(HashGraph.polyHash(s,p,x) % cap);
        // Check if the index leads collision, if yes, use the quadratic probing
        //
        if(vertexList[index] != null) {///copy
            if (vertexList[index].str == s) {
                return index;
            }
            else{
                for (int i = 0; i <= cap; ++i) {
                    index = (index+i*i)%cap;
                }
            }
        }
        return index;
    }

    public static long polyHash(String s, long p, long x){
        long hash = 0;
        // Implement the poly hash here
        for (int i = s.length()-1;i>=0;i--) ///copy
        {
            hash=(hash*x + (int) s.charAt(i)) % p;
        }
        return hash;
    }

    public void printShortestPart(String s, String u){
        // Fix this
        int F_key = hashMapWithQuadraticProbing(s);///copy
        int T_key = hashMapWithQuadraticProbing(u);
        super.printShortestPart(F_key, T_key);
    }
}
