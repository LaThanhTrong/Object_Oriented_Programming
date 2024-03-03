package Linked_List;

public class LinkedList {
	private Node head;
	private Node cursor;
	public LinkedList() {
		//Empty list
		head = null;
		cursor = null;
	}
	
	public void Reset(){
		cursor = head;
	}
	
	public void advance() {
		cursor = cursor.getNext();
	}	
	
	public boolean hasElements() {
		if(cursor.getNext() != null) {
			return true;
		}
		return false;
	}
	
	public void moveToEnd() {
		while(cursor.getNext() != null) {
			cursor = cursor.getNext();
		}
	}
	
	public String current() {
		return cursor.getData();
	}
	
	public void insert(String s){
	    Node temp = new Node(s);
	    advance();
	    temp.setNext(cursor.getNext());
	    cursor.setNext(temp);
	}
	
	public void show() {
		if(head == null){
			System.out.print("List is empty");
			return;
		}
		Node current = head;
		while(current != null) {
			System.out.print(current.getData()+" --> ");
			current = current.getNext();
		}
		System.out.print("null");
	}
	
	public void reset() {
		
	}
}
