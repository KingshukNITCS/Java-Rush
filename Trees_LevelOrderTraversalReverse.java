//{ Driver Code Starts
//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GFG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t > 0){
            String s = br.readLine();
            Node root = buildTree(s);
            Tree g = new Tree();
            ArrayList<Integer> ans = g.reverseLevelOrder(root);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}


 

// } Driver Code Ends



/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        List<List<Integer>> lo = levelOrder(node);
        int nl = lo.size();
        for(int i=nl-1; i>=0; i--)
        {
            for(int j : lo.get(i))
            {
                al.add(j);
            }
        }
        return al;
    }
    public List<List<Integer>> levelOrder(Node root) {        
        List<List<Integer>> all = new ArrayList<>();
        if(root==null) return all;
        Queue<List<Node>> qlt = new LinkedList<>();
        List<Node> tempn = new ArrayList<>();       
        tempn.add(root);        
        qlt.add(tempn);                    
        List<Integer> tempv = new ArrayList<>();        
        tempv.add(root.data);
        all.add(tempv);
        while(qlt.size()!=0)
        {
            List<Node> reml = qlt.remove();
            List<Integer> temp1 = new ArrayList<>();
            List<Node> temp2 = new ArrayList<>();
            for(Node rem : reml)
            {
            if(rem.left!=null)
            {
            temp2.add(rem.left);                       
            temp1.add(rem.left.data);
            }
            if(rem.right!=null)
            {
            temp2.add(rem.right);
            temp1.add(rem.right.data);
            }
            }
            int count=0;
            for(Node t : temp2)
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
