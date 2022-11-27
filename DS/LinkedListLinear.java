/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amart
 */
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
public class LinkedListLinear 
{
  Node root;
  
 void createLinkedList()
 {
     root=null;
 }
         
 void insertLeft(int data)
 {
     Node n=new Node(data);
     if(root==null)
     {
         root=n;
     }
     else
     {
         n.next=root;//1
         root=n;//2
     }
   }
 void deleteLeft()
 {    
     if(root==null)
     {
         System.out.println("List Empty");
     }
     else
     {
         Node t=root;//1
         root=root.next;//2
         System.out.println("Deleted:"+t.data);
     }
     }
 void insertRight(int data)
 {
     Node n=new Node(data);
     if(root==null)
     {
         root=n;
     }
     else
     {
         Node t=root;//1 use t to search right
         while(t.next!=null)//2
         {
             t=t.next;
         }
          t.next=n;//3
     }
   }
 void deleteRight()
 {
     if(root==null)
     {
         System.out.println("List Empty");
     }
     else
     {
         Node t,t2;
         t=t2=root;
         while(t.next!=null)//2
         {
             t2=t;
             t=t.next;
         }
         t2.next=null;//break link
         System.out.println("Deleted:"+t.data);
     }
   }
 void printList()
 {
     if(root==null)
     {
         System.out.println("List Empty");
     }
     else
     {
         Node t;
         t=root;
         while(t!=null)//2
         {
             System.out.println(t.data);
             t=t.next;
         }
         
     }
   }
 void countNodes()
 {
     if(root==null)
     {
         System.out.println("List Empty");
     }
     else
     {
         Node t;
         int c=0;
         t=root;
         while(t!=null)//2
         {
             //System.out.println(t.data);
             t=t.next;
             c++;
         }
          System.out.println("Total nodes in list are:"+c);
     }
 }
  
 void searchList(int key)
 {
     if(root==null)
     {
         System.out.println("List Empty");
     }
     else
     {
         Node t;
         int c=0;
         t=root;
         while(t!=null && t.data!=key)//2
         {
             t=t.next;
             c++;
         }
         if(t!=null)//found 
            System.out.println("Found at "+c+" from root");
         else
             System.out.println("Not Found");
     }
                
}
  void deleteKeybased(int key)
 {
     if(root==null)
     {
         System.out.println("List Empty");
     }
     else
     {
         Node t,t2;
         t=t2=root;
         while(t!=null && t.data!=key)//2
         {
             t2=t;
             t=t.next;
         }
         if(t==null)//not found 
            System.out.println("Not found");
         else//found
         {
             if(t==root)//case 1
             { root=root.next;
             }
           
             else if(t.next==null)//case2 
             {  t2.next=null;
             }
             else//case 3
             {  t2.next=t.next;
             }
             
             System.out.println("Deleted:"+t.data);
         }
     }
 }

void insertAfter(int key,int data)//inserting after the key
 {
     if(root==null)
     {
         System.out.println("List Empty");
     }
     else
     {
         Node t;
         t=root;
         while(t!=null && t.data!=key)//2
         {
             t=t.next;
         }
         if(t==null)//not found 
            System.out.println("Element Not found");
         else//found
         {
              Node n=new Node(data);//created node
             n.next=t.next;//1
             t.next=n;//2
         }
     }
   }              


}














