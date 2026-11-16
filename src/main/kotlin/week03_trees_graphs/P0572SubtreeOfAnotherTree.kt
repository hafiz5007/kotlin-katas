package week03_trees_graphs

/*
 * Problem: 572. Subtree of Another Tree (LeetCode)
 *
 * Given the roots of two binary trees `root` and `subRoot`, return true
 * if there is a subtree of `root` with the same structure and node values
 * as `subRoot`, false otherwise.
 *
 * A subtree is a tree consisting of a node and all of this node's descendants.
 */
class P0572SubtreeOfAnotherTree {
  fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {

//        if(root == null && subRoot == null)
//            return true

        if(subRoot == null)
            return true

         if(root == null )
        {
            return false
        }

        // 3. Check if the trees match starting right here
        if (isSameTree(root, subRoot)) {
            return true
        }

        return isSubtree(root?.left, subRoot) || isSubtree(root?.right, subRoot)
    }

    private fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) return true
        if (p == null || q == null || p.`val` != q.`val`) return false
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    }
}
