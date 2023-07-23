//{ Driver Code Starts
// Initial Template for Java

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class GfG {

    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
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
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }
    static void printInorder(Node root) {
        if (root == null) return;

        printInorder(root.left);
        System.out.print(root.data + " ");

        printInorder(root.right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);
            Solution g = new Solution();
            System.out.println(g.diameter(root));
            t--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

/*class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/


class Pair<F, S> {
    F first;
    S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    
    int max(int a,int b){
        if(a > b){
            return a;
        }
        return b;
    }
    
    int findHeight(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
    
    int height(Node node) 
    {
        // code here 
        if(node == null){
            return 0;
        }
        
        int left = height(node.left);
        int right = height(node.right);
        
        int ans = max(left,right) + 1;
        
        return ans;
    }
    
    Pair<Integer, Integer> findDiameter(Node root) {
        if (root == null) {
            return new Pair<>(0, 0);
        }

        Pair<Integer, Integer> leftSubtree = findDiameter(root.left);
        Pair<Integer, Integer> rightSubtree = findDiameter(root.right);

        int height = Math.max(leftSubtree.first, rightSubtree.first) + 1;
        int diameter = Math.max(leftSubtree.first + rightSubtree.first, Math.max(leftSubtree.second, rightSubtree.second));

        return new Pair<>(height, diameter);
    }
    
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        // Your code here
        /*recursive method
        if(root == null){
            return 0;
        }
        
        
        int op1 = diameter(root.left);
        int op2 = diameter(root.right);
        int op3 = height(root.left) + height(root.right) + 1;
        
        int ans = max(op1,max(op2,op3));*/
        
        if (root == null) {
            return 0;
        }

        Pair<Integer, Integer> result = findDiameter(root);
        return result.second+1;
        
        //return ans;
    }
}
