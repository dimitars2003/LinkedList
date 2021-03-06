package homework_01_03;

public class LinkedlList<T> implements List<T>{
	private Node <T> data;
	
	@Override
	public boolean isEmpty() {
		if(this.data == null)
			return false;
		else 
			return true;
	}

	@Override
	public boolean contains(Object item) {
		Node <T> temp = data;
		while (temp.getData()!= null) {
			if(temp.getData().equals(item)) {
				return true;
				
			}
			temp = temp.getNext();
			
		}
		return false;
	}
	//n
	
	
	@Override
	public void add(T item) {
		Node<T> temp = data;
		while (temp.getNext()!=null){
			temp = temp.getNext();
			
		}
		Node<T> newnode = new Node <T>(item);
		temp.setNext(newnode);
		
		
		//NOT FINISHED
		//NOT FINISHED
		//NOT FINISHED
	
	}

	@Override
	public void insertAt(T item, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFrom(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Object item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		this.data = null;
		
	}
	
}
