package at.fhj.itm;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * 
 * @author Max Schopfer
 * @version 1.0
 */
public class StringQueue implements Queue {
	private ArrayList<String> list;
	Exception NoSuchElementExecption = new Exception();

	/**
	 * @param creates empty arraylist
	 */
	public StringQueue() {
		list = new ArrayList<String>();
	}

	
	/* (non-Javadoc)
	 * @see at.fhj.itm.Queue#offer(java.lang.String)
	 */
	@Override
	public boolean offer(String obj) {
		return list.add(obj);
	}

	/**
	 * 
	 */
	/* (non-Javadoc)
	 * @see at.fhj.itm.Queue#poll()
	 */
	@Override
	public String poll() {
		if(list.size() == 0){
			return null;
		}
		String cache = (String) list.get(0);
		list.remove(0);
		return cache;
	}

	/**
	 * 
	 */
	/* (non-Javadoc)
	 * @see at.fhj.itm.Queue#remove()
	 */
	@Override
	public String remove() throws NoSuchElementException{
		if(list.isEmpty()){
			throw new NoSuchElementException();
		}else{
			String cache = list.get(0);
			list.remove(0);
			return cache;
		}

	}
	/**
	 * 
	 */
	/* (non-Javadoc)
	 * @see at.fhj.itm.Queue#peek()
	 */
	@Override
	public String peek() {
		if(list.isEmpty()){
			return null;
		}else{
			return list.get(0);
		}
	}

	/* (non-Javadoc)
	 * @see at.fhj.itm.Queue#element()
	 */
	@Override
	public String element() {
		if(list.isEmpty()){
			NoSuchElementExecption.printStackTrace();
			return null;
		}else{
			return (String) list.get(0);
		}
	}

}
