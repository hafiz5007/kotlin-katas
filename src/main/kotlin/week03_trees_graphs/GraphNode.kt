package week03_trees_graphs

/*
 * Shared GraphNode class used by Clone Graph (Problem 133).
 *
 * Each node has a value and a list of neighbor references.
 */
class GraphNode(var `val`: Int) {
    var neighbors: ArrayList<GraphNode?> = ArrayList()
}

/**
 * Build a graph from an adjacency list — LeetCode's format for Clone Graph.
 *
 *   Node 1's neighbors: [2, 4]
 *   Node 2's neighbors: [1, 3]
 *   Node 3's neighbors: [2, 4]
 *   Node 4's neighbors: [1, 3]
 *
 * Returns the GraphNode with value 1 (the "entry" node).
 */
fun graphFromAdjacency(adjList: List<List<Int>>): GraphNode? {
    if (adjList.isEmpty()) return null
    val nodes = (1..adjList.size).associateWith { GraphNode(it) }

    for ((i, neighbors) in adjList.withIndex()) {
        val currentNode = nodes[i + 1]!!
        for (neighborValue in neighbors) {
            currentNode.neighbors.add(nodes[neighborValue])
        }
    }
    return nodes[1]
}

/**
 * Convert a graph back to adjacency list format for test assertions.
 * Uses BFS from the given start node.
 */
fun GraphNode?.toAdjacencyList(): List<List<Int>> {
    if (this == null) return emptyList()
    val visited = mutableMapOf<Int, GraphNode>()
    val queue = ArrayDeque<GraphNode>()
    queue.addLast(this)
    visited[this.`val`] = this

    while (queue.isNotEmpty()) {
        val node = queue.removeFirst()
        for (neighbor in node.neighbors) {
            if (neighbor != null && !visited.containsKey(neighbor.`val`)) {
                visited[neighbor.`val`] = neighbor
                queue.addLast(neighbor)
            }
        }
    }

    // Build adjacency list sorted by node value
    val maxVal = visited.keys.max()
    return (1..maxVal).map { v ->
        visited[v]?.neighbors?.mapNotNull { it?.`val` }?.sorted() ?: emptyList()
    }
}
