package at.fhj.itm.api;

public interface Stack {
	

	

	/**
	 * Tests if this stack is empty.
	 * @return true if empty
	 */
	public abstract boolean isEmpty();
	
	
	
	

	/**
	 * Pushes an item onto the top of this stack.
	 * 
	 * if Stack is full return an error message
	 * 
	 * @param item	Gets pushed to the Stack
	 */
	public abstract void push(String item);

	/**
	 * Removes the object at the top of this stack and returns that
	 * object as the value of this function.
	 * 
	 * @return "Stack is empty!" if empty, else first element of stack.
	 */
	public abstract String pop();

}
