package linkedList;

public class NewLinkedListUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewLinkedList s1=new NewLinkedList();
		Node<Integer> head=s1.takeInput();
		s1.print(head);
		head=s1.InsertFirst(head, 10);
		s1.print(head);

	}

}
