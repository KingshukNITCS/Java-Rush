/**https://leetcode.com/problems/binary-tree-preorder-traversal/description/
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();     
        return (func(al,root));            
    }
    List<Integer> func(List<Integer> al,TreeNode root)
    {
        if(root==null) return al;
        al.add(root.val);
        func(al, root.left);
        func(al, root.right);
        return al;
    }
}
