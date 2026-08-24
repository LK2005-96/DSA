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
    int r=0;
    public int sumEvenGrandparent(TreeNode root) {
        TreeNode temp=root;
        if(temp==null) return 0;
         if(  temp.val%2==0){
          check(temp.left,temp.right);
        } 
         sumEvenGrandparent(temp.left);
          sumEvenGrandparent(temp.right);
        return r;
        }
    public void check(TreeNode node1,TreeNode node2)
        {
            if(node1!=null)
            {
                if(node1.left!=null) r+=node1.left.val;
                if(node1.right!=null) r+=node1.right.val;
            }
            if(node2!=null)
            {
                if(node2.left!=null) r+=node2.left.val;
                if(node2.right!=null) r+=node2.right.val;
            }

        }
        }
    
