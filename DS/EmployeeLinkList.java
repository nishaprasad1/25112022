import java.util.Scanner;

class Node
{
	int id,age;
	String name;
	double sal;


	Node next;
	Node(int id,int age,String name,double sal)
	{
		this.id=id;
		this.age=age;
		this.sal=sal;
		next=null;
	}
}



public class EmployeeManagement {

	Node root;


	void createEmployeeList()
	{
		root=null;
	}

	void insertAtStart(int id,int age,String name,double sal)
	{
		Node n=new Node(id,age,name, sal);
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
	void deleteAtStart()
	{    
		if(root==null)
		{
			System.out.println("List Empty");
		}
		else
		{
			Node t=root;//1
			root=root.next;//2
			System.out.println("Deleted:"+t.id);
		}
	}
	void insertAtEnd(int id,int age,String name,double sal)
	{
		Node n=new Node(id,age,name, sal);
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
	void deleteAtEnd()
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
			System.out.println("Deleted:"+t.id);
		}
	}
	void printAllEmployee()
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
				System.out.println(t.id,t.age,t.name,t.sal);
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

	void searchEmployee(int key)
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
			while(t!=null && t.id!=key)//2
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
	void deleteSpecific(int key)
	{
		if(root==null)
		{
			System.out.println("List Empty");
		}
		else
		{
			Node t,t2;
			t=t2=root;
			while(t!=null && t.id!=key)//2
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

				System.out.println("Deleted:"+t.id);
			}
		}
	}

	void insertInBetween(int key,int id)//inserting after the key
	{
		if(root==null)
		{
			System.out.println("List Empty");
		}
		else
		{
			Node t;
			t=root;
			while(t!=null && t.id!=key)//2
			{
				t=t.next;
			}
			if(t==null)//not found 
				System.out.println("Element Not found");
			else//found
			{
				Node n=new Node(id,age,name, sal);//created node
				n.next=t.next;//1
				t.next=n;//2
			}
		}
	}  
	public static void main(String args[])
	{
		int ch,e;
		var obj=new  EmployeeManagement();
		Scanner in=new Scanner(System.in);
		obj.createEmployeeList();
		do
		{
			System.out.println("1.insertLeft\n2.deleteLeft\n3.insertRight\n4.deleteRight\n5.printList\n6.countNodes\n7.searchList\n8.deleteKeybased\n9.insertAfter\n0.exit");
			ch=in.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Data:");
				e=in.nextInt();
				obj.insertLeft(e);
				System.out.println("insertLeft");
				break;

			case 2:
				obj.deleteLeft();
				break;

			case 3:
				System.out.println("Enter Data:");
				e=in.nextInt();
				obj.insertRight(e);
				System.out.println("insertRight");
				break;
			case 4 :
				obj.deleteRight();
				break;


			case 5:
				obj.printList();
				break;  
			case 6:

				obj.countNodes();
				break; 
			case 7:

				System.out.println("Enter Data:");
				e=in.nextInt();
				obj.searchList(e);
				System.out.println("searchList");
				break;
			case 8 :
				System.out.println("Enter Data:");
				e=in.nextInt();
				obj.deleteKeybased(e);
				System.out.println("searchList");
				break;
			case 9:
				System.out.println("Key:");
				e=in.nextInt();
				System.out.println("values");
				int f;
				f=in.nextInt();
				obj.insertAfter(e,f);
				System.out.println("insertAfter");
				break;
			case 0:
				System.out.println("Exiting ");
				break;

			default:
				System.out.println("Wrong option selected");
				break;
			}
		}while(ch!=0);
	}

}






