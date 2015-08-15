package com.shypz.DataStructures;


class LinkedListBasic{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l = new LinkedList();
		
		l.addElementToList("3");
		l.addElementToList("4");
		l.addElementToList("5");
		l.addElementToList("6");
		l.addElementToList("7");
		
		System.out.println(l.printElements());
		
		
	}
	
	
	
}

class LinkedList {
	
	private Node head;
	private int listCount;
	
	public LinkedList(){
		head = new Node(null);
		listCount = 0;
	}

	
	public void addElementToList(Object element){
		
		Node nd = new Node(element);
		
		Node current = head;
		
		
		while(current.getNext() != null){
			
			current = current.getNext();
			
		}
		current.setNext(nd);
		listCount++;
		
		
	}
	
    public void addElementAtPosition(){
    	
    	
    	
    }
    
    public int printElements(){
    	
    	return listCount;
    }
    
    public int calculateLengthOfList(){
    	
    	
    	return 1;
    }

	
}

class Node{
	
	Object data;
	
	Node next;
	
	Node(Object data){
		
		this.data = data;
		this.next = null;
	}
	
	Node(Object data,Node next){
		this.data = data;
		this.next = next;
	}
	
	public Object getData(){
		return data;
	}
	
	public void setData(Object data){
		this.data = data;
		
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	
	
}
