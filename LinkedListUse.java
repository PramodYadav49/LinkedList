package linkedList;

import java.util.Scanner;

public class LinkedListUse {

	

	public static void print(Node<Integer> temp) {
		
	while(temp!=null) {
		System.out.print(temp.data+"  ");
		temp=temp.next;
	}
	}

	public static Node<Integer> TakeInput(){
		Node<Integer> head=null;
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		while(data!=-1) {
			Node<Integer> newNode=new Node<Integer>(data);
			if(head==null) {
				
				head=newNode;
			} else {
				Node<Integer>temp=head;
				
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newNode;
			}
			data=sc.nextInt();
		}
		return head;
	}
	public static Node<Integer> insertNode(Node<Integer> head,int pos, int data){
		Node<Integer> newNode=new Node<Integer>(data);
		
		if(pos==0) {
			newNode.next=head;
			return newNode;
		}
		
		int i=0;Node<Integer> temp=head;
		while(i<pos-1) {
			temp=temp.next;
			i++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		return head;
		
	}
	public static Node<Integer> deleteNode(Node<Integer> head,int pos) {
		Node<Integer> temp=head;
		if(pos==0) {
			head=head.next;
			return head;
		}
		while(pos-1!=0) {
			temp=temp.next;
			pos--;
		}
		Node<Integer> curr=temp.next.next;
		int x=temp.next.data;
		System.out.println(x);
		temp.next=curr;
		return head;
		
	}
	public static void mid(Node<Integer> head){
		Node<Integer> slow=head;
		Node<Integer> fast=slow;
		while(fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.println(slow.data);
		
	}
	public static void main(String[] args) {
		Node<Integer> head=TakeInput();
		mid(head);
		
//		Node<Integer> x=deleteNode(head,2);
//		print(x);
		
		// TODO Auto-generated method stub
//		Node<Integer> node1=new Node<Integer>(20);
//		Node<Integer> node2=new Node<Integer>(30);
//		Node<Integer> node3=new Node<Integer>(40);
//		
//		node1.next=node2;
//		node2.next=node3;
//		Node<Integer> head1=node1;
//		print(head1);
		
		}

}
