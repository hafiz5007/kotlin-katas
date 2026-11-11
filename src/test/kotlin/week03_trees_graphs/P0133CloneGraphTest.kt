package week03_trees_graphs

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotSame
import kotlin.test.assertNull

class P0133CloneGraphTest {
    private val solution = P0133CloneGraph()

    @Test fun `classic four-node graph`() {
        // Graph: 1 <-> 2, 1 <-> 4, 2 <-> 3, 3 <-> 4
        val original = graphFromAdjacency(listOf(
            listOf(2, 4),   // node 1's neighbors
            listOf(1, 3),   // node 2's neighbors
            listOf(2, 4),   // node 3's neighbors
            listOf(1, 3)    // node 4's neighbors
        ))
        val clone = solution.cloneGraph(original)

        assertNotSame(original, clone, "Clone must be a new object")
        assertEquals(
            listOf(
                listOf(2, 4),
                listOf(1, 3),
                listOf(2, 4),
                listOf(1, 3)
            ),
            clone.toAdjacencyList()
        )
    }

    @Test fun `single node no neighbors`() {
        val original = GraphNode(1)
        val clone = solution.cloneGraph(original)

        assertNotSame(original, clone)
        assertEquals(1, clone!!.`val`)
        assertEquals(0, clone.neighbors.size)
    }

    @Test fun `null input returns null`() {
        assertNull(solution.cloneGraph(null))
    }

    @Test fun `two-node graph with cycle`() {
        // 1 <-> 2
        val original = graphFromAdjacency(listOf(
            listOf(2),
            listOf(1)
        ))
        val clone = solution.cloneGraph(original)

        assertNotSame(original, clone)
        assertEquals(
            listOf(listOf(2), listOf(1)),
            clone.toAdjacencyList()
        )
    }

    @Test fun `self-loop node`() {
        val node = GraphNode(1)
        node.neighbors.add(node)   // self-loop

        val clone = solution.cloneGraph(node)
        assertNotSame(node, clone)
        assertEquals(1, clone!!.`val`)
        assertEquals(1, clone.neighbors.size)
        assertEquals(clone, clone.neighbors[0], "Self-loop should point to the CLONE, not the original")
    }
}
