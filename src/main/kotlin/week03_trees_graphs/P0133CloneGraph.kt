package week03_trees_graphs

/*
 * Problem: 133. Clone Graph (LeetCode)
 *
 * Given a reference of a node in a connected undirected graph, return a
 * DEEP COPY (clone) of the graph. Each node contains a value and a list
 * of its neighbors.
 *
 * All nodes with value `n` are indexed starting from 1 (so node 1 has
 * val = 1, node 2 has val = 2, and so on).
 *
 * The clone must have the same structure BUT with entirely new objects.
 */
class P0133CloneGraph {
  fun cloneGraph(node: GraphNode?): GraphNode? {
        if (node == null) return null

        // Maps original nodes to their cloned copies
        val visited = HashMap<GraphNode, GraphNode>()

        fun dfs(current: GraphNode): GraphNode {
            // Return the clone if this node has already been visited
            visited[current]?.let { return it }

            // Create a clone and register it immediately to handle cycles
            val copy = GraphNode(current.`val`)
            visited[current] = copy

            // Recursively clone all neighbors
            for (neighbor in current.neighbors) {
                if (neighbor != null) {
                    copy.neighbors.add(dfs(neighbor))
                }
            }

            return copy
        }

        return dfs(node)
    }
}
