// import java.util.HashSet;
// import java.util.LinkedList;
// import java.util.Queue;

/**
 * Representation
 */
class Graph{
    int vertex ;
    static int [] [] matrix;

    Graph (int vertex ){

    this.vertex = vertex;
    matrix= new int[vertex][vertex];
    
    }


   void addEdges(int source , int dest){
        matrix[source][dest]=1;
        matrix [dest][source]=1; // we can remove this to make it ordered.


    }


    public void print(){
        for(int i =0; i<vertex;i++){
            for(int j =0;j<vertex;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdges(0,1);
        g.addEdges(0,2);
        g.addEdges(1,3);
        g.addEdges(1,4);
        g.addEdges(2,3);
        g.addEdges(3,4);

        g.print();

        
        
    }
    
}