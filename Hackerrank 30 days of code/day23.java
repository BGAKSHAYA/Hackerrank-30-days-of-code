import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class day23{
    static void levelOrder(Node root){
          //Write your code here
          Node a[]=new Node[10000];
          int first=0,last=1;
          if(root!=null)
          {
              a[first]=root;
              while(true){
                  System.out.print(a[first].data+" ");
                  if(a[first].left!=null)
                     a[last++]=a[first].left;
                  if(a[first].right!=null)
                     a[last++]=a[first].right;
                  first++;
                  if(first==last)
                    return;
                }
          }
    }
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}

      
	