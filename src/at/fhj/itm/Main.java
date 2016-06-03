package at.fhj.itm;

public class Main {

	public static void main(String[] args) {
		StringQueue stringQueue = new StringQueue();
		
		System.out.println(stringQueue.offer("test"));
		System.out.println(stringQueue.poll());
		System.out.println(stringQueue.poll());
		System.out.println(stringQueue.offer("test"));
		System.out.println(stringQueue.remove());
		System.out.println(stringQueue.peek());
		System.out.println(stringQueue.offer("test"));
		System.out.println(stringQueue.peek());
		System.out.println(stringQueue.element());
		stringQueue.remove();
		stringQueue.remove();
		
		

	}

}
