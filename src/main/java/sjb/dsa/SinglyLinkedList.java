package sjb.dsa;

public class SinglyLinkedList
{
	Node head;
	
	///at the end
	public void insert(int data) {
		Node newNode=new Node(data);
		
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
 
	
	
//	public static void main(String[] args) {
//		SinglyLinkedList list=new SinglyLinkedList();
//		list.insert(10);
//		list.insert(20);
//		list.insert(30);
//		list.display();
//	}
		
	
	//at beggining
//	public void insert (int data)
//	{
//		Node newNode=new Node(data);
//	    newNode.next=head;
//		head=newNode;
//	}
//	public void display() {
//		Node current=head;
//		
//		while(current!=null) {
//			System.out.println(current.data);
//			current=current.next;
//		}
//		System.out.println("null");
//	}
//	public static void main(String[] args) {
//		SinglyLinkedList list=new SinglyLinkedList();
//		list.insert(10);
//		list.insert(20);
//		list.insert(30);
//		list.display();
//	}
	
	//at specific position
	public void addatposition(int data,int pos)
	{
		Node newnode=new Node(data
				);
		Node temp=head;
		for(int i=0;i<pos-1 && temp.next!=null;i++)
		{
			temp=temp.next;
		}
		newnode.next=temp.next;
		temp.next=newnode;
		
	}
	public void display() {
		Node current=head;
		
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		SinglyLinkedList list=new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
         list.insert(30);
		list.addatposition(45, 2);
		list.display();
	}
	
	
}

