package tree;
 /* 
                    1
                2       3
              4    5  6    7
        */
import java.util.LinkedList;
import java.util.Queue;

 class Node
    {
        int value;
        Node right;
        Node left;

        public Node(int value)
        {
            this.value = value;
            right = null;
            left = null;
        }
 
    }
public class Tree 
{
   
    
    Node root;

        public Tree() 
        {
            root=null;
        }
        
    void preOrderTraversal()
    {
        preOrder(root);
    } 
    void inOrderTraversal()
    {
        inOrder(root);
    }
    void postOrderTraversal()
    {
        postOrder(root);
    }
    public static void main(String[] args)
    {
        Tree tree = new Tree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
       
        System.out.print("preOrder=> ");
        tree.preOrderTraversal();
        System.out.println();
        System.out.print("inOrder=> ");
        tree.inOrderTraversal();
        System.out.println();
        System.out.print("postOrder=> ");
        tree.postOrderTraversal();
        System.out.println();
        System.out.print("BFS=> ");
        tree.BFS();
        System.out.println();
    }
    
      void preOrder(Node node)
    {
        if(node==null) return; 
        System.out.print(node.value+" "); //print data of node
        preOrder(node.left); //recur left subtree
        preOrder(node.right);//recur right subtree
    }
      
      void inOrder(Node node)
      {
          if(node==null) return;
          inOrder(node.left);
          System.out.print(node.value+" ");
          inOrder(node.right);        
      }
      void postOrder(Node node)
      {
          if(node==null)return;
          postOrder(node.left);
          postOrder(node.right);
          System.out.print(node.value+" ");
      }
      void BFS()
      {
          if(root==null)return;
          Queue<Node> queueNode = new LinkedList<>();
          queueNode.add(root);
          while(!queueNode.isEmpty())
          {
              Node currentNode = queueNode.remove();
              System.out.print(currentNode.value+" ");
              if(currentNode.left!=null) queueNode.add(currentNode.left);
              if(currentNode.right!=null)queueNode.add(currentNode.right);
              
          }
          
      }
    
}
