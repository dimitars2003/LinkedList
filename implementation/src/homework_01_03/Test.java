package homework_01_03;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> ll = new LinkedList<Integer>();
		System.out.println(ll.isEmpty());
		ll.add(5);
		ll.add(1);
		ll.add(7);
		ll.add(3);
		ll.print();
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains(3));
		ll.insertAt(33, 0);
		ll.print();
		ll.removeFrom(3);
		System.out.println("a");
		ll.print();
		ll.remove(7);
		System.out.println("a");
		ll.print();
		System.out.println("a");
		System.out.println(ll.get(33));
		ll.clear();
		
		}

}
