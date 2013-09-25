package edu.nvcc.utils;

public class LinkedList implements LinkedListInterface{

	private LinkedListNode list;
	public LinkedList() {
		list = null;
	}
	
	@Override
	public void add(Object element) {
		// add first element
		LinkedListNode newNode = new LinkedListNode(element,list);
		list = newNode;
	}

	@Override
	public Object remove(Object elememt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(Object element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public String toString() {
		String out="";
		LinkedListNode temp;
		temp = list;
		while(temp!=null) {
			out += temp.getElement() + "\n";
			temp = temp.getLink();
		}
		return out;
	}

}
