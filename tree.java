import java.util.*;
import java.io.*;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BST{
    Node root;
    void addNodefunction(int data){
        root=addNode(root,data);
    }

    Node addNode(Node root, int data){
        Node newNode=new Node(data);
        if(root==null){
            root=newNode;
            return root;
        }
        if(root.data < data){
            root.right=addNode(root.right,data);
        }
        if(root.data > data){
            root.left=addNode(root.left,data);
        }
        return root;
    }
    void preOrderTraversal(){
        preOrder(root);
    }
    void preOrder(Node root){
        if(root==null)
          return;

          System.out.print(root.data+" ");
          preOrder(root.left);
          preOrder(root.right);
    }
}
public class tree{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BST TREE=new BST();
     for(int i=0;i<n;i++){
            int no=sc.nextInt();
            Tree.addNodefunction(no);
        }
      Tree.  preOrderTraversal();
    }
}