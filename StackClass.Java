package misc;

public class Stack<T> {
	
	public static class StackNode<T>{
		
		private T data;
		private StackNode<T> next;
		
		public StackNode(T d) {
			data = d;
		}
		
	}
	
	private StackNode<T> top;
	
	public Stack() {}
	
	public T pop(){
		
		if(top == null) {
			//System.out.println("Empty Stack");
			return null;
		}
		
		T item = top.data;
		top = top.next;
		
		return item;
		
	}
	
	public void push(T item){
		
		StackNode n = new StackNode(item);
		n.next = top;
		top = n;
		
	}
	
	public T peek() {
		
		if(top == null) {
			//System.out.println("Empty Stack");
			return null;
		}
		
		T item = top.data;
		return item;
	}
	
	public boolean is_empty() {
		
		if(top == null){
			return true;
		}
		return false;
		
	}

}
