/** https://leetcode.com/problems/binary-tree-level-order-traversal/description/
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
    public List<List<Integer>> levelOrder(TreeNode root) {        
        List<List<Integer>> all = new ArrayList<>();
        if(root==null) return all;
        Queue<List<TreeNode>> qlt = new LinkedList<>();
        List<TreeNode> tempn = new ArrayList<>();       
        tempn.add(root);        
        qlt.add(tempn);                    
        List<Integer> tempv = new ArrayList<>();        
        tempv.add(root.val);
        all.add(tempv);
        while(qlt.size()!=0)
        {
            List<TreeNode> reml = qlt.remove();
            List<Integer> temp1 = new ArrayList<>();
            List<TreeNode> temp2 = new ArrayList<>();
            for(TreeNode rem : reml)
            {
            if(rem.left!=null)
            {
            temp2.add(rem.left);                       
            temp1.add(rem.left.val);
            }
            if(rem.right!=null)
            {
            temp2.add(rem.right);
            temp1.add(rem.right.val);
            }
            }
            int count=0;
            for(TreeNode t : temp2)
            {
                if(t!=null) count++;
            }
            if(count>0)
            {
            all.add(temp1);
            qlt.add(temp2);
            }            
        }
            return all;        
    }
}
