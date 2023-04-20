package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class main_misc {
    
	
	public static void main(String[] args) {
	  

	Stack<Integer> s = new Stack<>();
	s.push(3);
	s.push(0);
	s.push(1);
	s.push(2);
	s = sort_stack(s);
	while(!s.is_empty()) {
		System.out.println(s.pop());
	}
	
	
		
	}
	
	private static int max(int a,int b){
		if(a > b) {
			return a;
		}
		return b;
	}
	
	private static int min(int a,int b) {
		if(a < b) {
			return a;
		}
		return b;
	}
	
	private static Stack sort_stack(Stack<Integer> s1) {
		
		Stack<Integer> s2 = new Stack<>();
		
		while(true) {
			
			if(s1.peek() != null){
				int swaps = 0;
				while(!s1.is_empty()) {
					
					int x = s1.pop();
                    if(s2.peek() == null) {
                    	s2.push(x);
                    }
                    else {
                    	if(x > s2.peek()) {
                    		
                    		int y = s2.pop();
                    		s2.push(x);
                    		s2.push(y);
                    		swaps++;
                    	}
                    	else {
                    		s2.push(x);
                    	}
                    }
                   
				}
				if(swaps == 0) {
					//System.out.println("--->");
					break;
				}	
			}
			if(s2.peek() != null){
				int swaps = 0;
				
				while(!s2.is_empty()) {
					int x = s2.pop();
					if(s1.peek() == null) {
						s1.push(x);
					}
					else {
						if(x < s1.peek()) {
							int y = s1.pop();
                            s1.push(x);
                            s1.push(y);
                            swaps++;
						}
						else {
							s1.push(x);
						}
					}
				}
				if(swaps == 0) {
					
					while(!s1.is_empty()) {
						s2.push(s1.pop());
					}
					//System.out.println("---");
					break;
					
				}
				
			}
			
		}
		return s2;
		
	}
	
	
	

	
	
		
}
	
  
	
    
	
		

	

	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

