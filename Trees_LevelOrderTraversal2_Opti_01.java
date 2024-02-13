// Template to change levels in tree. Just use an inner for loop
// Here nested loop but time complexity O(n)
/**
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
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> qt = new LinkedList<>();
        qt.add(root);
        List<Integer> tl = new ArrayList<>();
        tl.add(root.val);
        ans.add(tl);
        while(qt.size()>0)
        {
            int sq = qt.size();
            int count = 0;
            List<Integer> tl2 = new ArrayList<>();
            for(int i=0; i<sq; i++)
            {
                TreeNode rem = qt.remove();
                if(rem.left!=null)
                {
                    tl2.add(rem.left.val);
                    qt.add(rem.left);
                    count++;
                }
                if(rem.right!=null)
                {
                    tl2.add(rem.right.val);
                    qt.add(rem.right);
                    count++;
                }             
            }
            if(count>0) ans.add(tl2);
        }
        return ans;
    }
}
