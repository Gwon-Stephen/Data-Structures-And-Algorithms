import java.io.*;
import java.util.*;

public class Chapter18_Graphs {
    /*
    Graphs
        specialize in relationships and connections within data
        All trees are graphs, but not all graphs are trees
        for a graph to be a tree, it can't have cycles and all nodes must be connected
        Each node is called a vertex and lines between nodes are edges

    Search:
        if we have access to one vertex in the graph, we must find another particular vertex that is somehow connected to this vertex
        Depth-First search
            start at any random vertex
            add current vertex to hash table to mark it as "visited"
            iterate through the current vertex's adjacent vertices
            for each adjacent vertex, if alr visited, ignore
            if not visited, recursively perform depth first search on vertex
        Breadth-First search
            doesn't use recursion, instead a queue
            uses graph traversal, visiting each vertex
            start vertex within the graph
            add the starting vertex to the hash table to mark it as having been visited
            add starting vertex to queue
            start a loop that runs while the queue isn't empty
                remove first vertex from queue, called current vertex
            iterate over adjacent vertices of current vertex
            if alr visited, ignore
            if not visited, mark it as visited and add to queue
            repeat this loop until queue is empty
        O(V+E) efficiency, where V = # of vertices and E = # of edges

        DFS VS BFS
            bfs traverses all the vertices closest to the starting vertex, expanding out
            dfs moves as far away from starting vertex and returns in
            which search to use depends on if you want to start far away or close to the starting vertex

        Weighted Graphs
            adds additional info on the edges of the graph
            useful for finding shortest path, cheapest price, etc

        Dijkstra's Algorithm
            finds shortest path
            visit starting city, and mark it at current city
            check prices from current city to adjacent ones
            if price of adjacent city is cheaper than price currently
                update cheapest prices table
                make adjacent city the key and current city the value
            visit whichever unvisited city has the cheapest price from the starting city and make it current city
            repeat until every known city is visited
            (replace city with vertex for broader steps)


     */

    //breadth first search and depth first search
    static class Graph {
        private int V;   // No. of vertices
        private LinkedList<Integer> adj[]; //Adjacency Lists

        // Constructor
        Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adj[i] = new LinkedList();
        }

        // Function to add an edge into the graph
        void addEdge(int v, int w) {
            adj[v].add(w);
        }

        // prints BFS traversal from a given source s
        void BFS(int s) {
            // Mark all the vertices as not visited(By default
            // set as false)
            boolean visited[] = new boolean[V];

            // Create a queue for BFS
            LinkedList<Integer> queue = new LinkedList<Integer>();

            // Mark the current node as visited and enqueue it
            visited[s] = true;
            queue.add(s);

            while (queue.size() != 0) {
                // Dequeue a vertex from queue and print it
                s = queue.poll();
                System.out.print(s + " ");

                // Get all adjacent vertices of the dequeued vertex s
                // If a adjacent has not been visited, then mark it
                // visited and enqueue it
                Iterator<Integer> i = adj[s].listIterator();
                while (i.hasNext()) {
                    int n = i.next();
                    if (!visited[n]) {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }

        // A function used by DFS
        void DFSUtil(int v, boolean visited[]) {
            // Mark the current node as visited and print it
            visited[v] = true;
            System.out.print(v + " ");

            // Recur for all the vertices adjacent to this
            // vertex
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n])
                    DFSUtil(n, visited);
            }
        }

        // The function to do DFS traversal.
        // It uses recursive
        // DFSUtil()
        void DFS(int v) {
            // Mark all the vertices as
            // not visited(set as
            // false by default in java)
            boolean visited[] = new boolean[V];

            // Call the recursive helper
            // function to print DFS
            // traversal
            DFSUtil(v, visited);
        }

        // Driver method to
        public static void main(String args[]) {
            Graph g = new Graph(4);

            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(1, 2);
            g.addEdge(2, 0);
            g.addEdge(2, 3);
            g.addEdge(3, 3);

            System.out.println("Following is Breadth First Traversal " +
                    "(starting from vertex 2)");

            g.BFS(2);
            g.DFS(2);
        }
    }

    //dijkstra's algorithm
    static class ShortestPath {
        // A utility function to find the vertex with minimum distance value,
        // from the set of vertices not yet included in shortest path tree
        static final int V = 9;
        int minDistance(int dist[], Boolean sptSet[])
        {
            // Initialize min value
            int min = Integer.MAX_VALUE, min_index = -1;

            for (int v = 0; v < V; v++)
                if (sptSet[v] == false && dist[v] <= min) {
                    min = dist[v];
                    min_index = v;
                }

            return min_index;
        }

        // A utility function to print the constructed distance array
        void printSolution(int dist[])
        {
            System.out.println("Vertex \t\t Distance from Source");
            for (int i = 0; i < V; i++)
                System.out.println(i + " \t\t " + dist[i]);
        }

        // Function that implements Dijkstra's single source shortest path
        // algorithm for a graph represented using adjacency matrix
        // representation
        void dijkstra(int graph[][], int src)
        {
            int dist[] = new int[V]; // The output array. dist[i] will hold
            // the shortest distance from src to i

            // sptSet[i] will true if vertex i is included in shortest
            // path tree or shortest distance from src to i is finalized
            Boolean sptSet[] = new Boolean[V];

            // Initialize all distances as INFINITE and stpSet[] as false
            for (int i = 0; i < V; i++) {
                dist[i] = Integer.MAX_VALUE;
                sptSet[i] = false;
            }

            // Distance of source vertex from itself is always 0
            dist[src] = 0;

            // Find shortest path for all vertices
            for (int count = 0; count < V - 1; count++) {
                // Pick the minimum distance vertex from the set of vertices
                // not yet processed. u is always equal to src in first
                // iteration.
                int u = minDistance(dist, sptSet);

                // Mark the picked vertex as processed
                sptSet[u] = true;

                // Update dist value of the adjacent vertices of the
                // picked vertex.
                for (int v = 0; v < V; v++)

                    // Update dist[v] only if is not in sptSet, there is an
                    // edge from u to v, and total weight of path from src to
                    // v through u is smaller than current value of dist[v]
                    if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                        dist[v] = dist[u] + graph[u][v];
            }

            // print the constructed distance array
            printSolution(dist);
        }

        // Driver method
        public static void main(String[] args)
        {
            /* Let us create the example graph discussed above */
            int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                    { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                    { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                    { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                    { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                    { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                    { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                    { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                    { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
            ShortestPath t = new ShortestPath();
            t.dijkstra(graph, 0);
        }
    }
}