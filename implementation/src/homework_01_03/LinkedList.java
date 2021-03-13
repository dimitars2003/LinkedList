package homework_01_03;

import java.util.NoSuchElementException;

public class LinkedList<T> implements List<T> {

	private Node<T> head;
	private int counter;
	
	 
	
	public LinkedList() {
		head = null;
		counter = 1;
	}

	@Override
	public boolean isEmpty() { // 0

		if (this.head == null)
			return true;
		else
			return false;
	}

	@Override
	public boolean contains(T item) {// n
		Node<T> temp = head;

		if (head == null) {
			return false;
		}

		while (temp != null) {

			if (temp.getData().equals(item)) {
				return true;

			}
			temp = temp.getNext();

		}
		return false;
	}

	@Override
	public void add(T item) {// n
		if (head == null) {
			head = new Node<>(item);
		} else {
			Node<T> temp = head;

			while (temp.getNext() != null) {
				temp = temp.getNext();
			}

			Node<T> newnode = new Node<T>(item);
			temp.setNext(newnode);

			counter++;
		}
	}

	@Override
	public void insertAt(T item, int index) {// n
		if (index < 0) {
			throw new NegativeArraySizeException("Index cannot be smaller than 0");
		}
		if (index > counter) {
			throw new IndexOutOfBoundsException("Too big index");
			
		}

		Node<T> temp = head;

		if (index == 0) {
			Node<T> newHead = new Node<T>(item);
			
			newHead.setNext(temp);
			
			head = newHead;
			counter++;
			
			
		} else {
			for (int i = 1; i < index; i++) {
				if (temp.getNext() != null)
					temp = temp.getNext();
			}

			Node<T> newnode = new Node<T>(item);
			newnode.setNext(temp.getNext());
			temp.setNext(newnode);
			counter++;
		}
		
	}

	@Override
	public void removeFrom(int index) {// n
		if (index < 0) {
			throw new NegativeArraySizeException("Index cannot be smaller than 0");
		}
		if (index > counter) {
			throw new IndexOutOfBoundsException("Too big index");
		}

		Node<T> temp = head;

		if (index == counter) {
			for (int i = 1; i < index; i++) {
				if (temp.getNext() != null)
					temp = temp.getNext();
			}
			temp.setNext(null);
			counter--;
			System.out.println("deleted");
		}

		else {
			for (int i = 1; i < index; i++) {
				if (temp.getNext() != null)
					temp = temp.getNext();
			}
			Node<T> newnode = temp.getNext();
			temp.setData(newnode.getData());
			temp.setNext(newnode.getNext());
			counter--;
			System.out.println("deleted");
		}
	}

	@Override
	public void remove(T item) {// n
		if (!contains(item)) {
			throw new NoSuchElementException("No such element existing");
			
		} else {
			int index = 1;
			Node<T> temp = head;
			
			
			
			while (index <= counter) {
				
				
				
				if (temp.getData().equals(item)) {
					
					removeFrom(index);	
				}
				else {
					temp = temp.getNext();
				}
				
				index++;
			}

		}
	}

	@Override
	public T get(int index) {// n
		if (index < 0) {
			throw new NegativeArraySizeException("Index cannot be smaller than 0");
		}
		if (index > counter) {
			throw new IndexOutOfBoundsException("Too big index");
		}
		int tempindex = 1;
		Node<T> temp = head;
		while (tempindex < index) {
			if (temp.getNext() != null) {
				temp = temp.getNext();
			}
			tempindex++;
		}

		return temp.getData();
	}

	@Override
	public void clear() {// 0
		this.head = null;

	}

	public void print() {
		int index = 0;
		Node<T> temp = head;
		while (index < counter) {
			System.out.print(temp.getData()+" ");
			temp = temp.getNext();
			index++;
		}

	}

}
