package at.fhj.itm;

import at.fhj.itm.api.Stack;




public class StringStack implements Stack
{
	private String[] stack;
	private int counter;


	public StringStack(int stacklength) {
		this.stack = new String[stacklength];
		this.counter = 0;
	}

	
	
	@Override
	public boolean isEmpty() {
		if(counter == 0){
			return true;
		}else{
			return false;
		}
	}

	
	@Override
	public void push(String item) {
		if(counter < stack.length){
			stack[counter] = item;
			counter++;
		}else{
			System.out.println("Stack is full!");
		}
	}

	
	@Override
	public String pop() {
		if(isEmpty()){
			return "Stack is empty!";
		}else{
			counter--;
			String cache = stack[counter];
			stack[counter] = null;
			return cache;
		}
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		StringBuilder stackstring = new StringBuilder();
		for(int i = 0; i<stack.length; i++){
			if(stack[i] != null){
				stackstring.append(stack[i] + " ");
			}else{
				break;
			}
			
		}
		return stackstring.toString();
	}

}