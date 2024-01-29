package ch02.apps;
import ch02.stacks.*;
import support.LLNode;

public class Test034
{
  public static void main(String[] args)
  { 
	  //tester
	  ArrayBoundedStack<Integer> stack1 = new ArrayBoundedStack<Integer>();
	  ArrayBoundedStack<Integer> stack2 = new ArrayBoundedStack<Integer>(); 
	  ArrayBoundedStack<Integer> stack3 = new ArrayBoundedStack<Integer>();
	  for (int i = 6; i < 30; i += 2)									
	  	stack1.push(i);	
	  while (!stack1.isEmpty()) {
	  stack2.push(stack1.top() * 2);
	  stack1.pop();
	  }
	  for (int j = 1; j < 11; j++)
	  	stack1.push(j);
	  for (int k = 0; k < 3; k++) {
	  	stack3.push(2 + stack1.top());
	  	stack1.pop();
	  }
	  while (!stack1.isEmpty()) {
	  	System.out.print(stack1.top() + " ");
	  	stack1.pop();
	  }
	  System.out.println();
	  while (!stack2.isEmpty()) {
	  	System.out.print(stack2.top() + " ");
	  	stack2.pop();
	  }
	  System.out.println();
	  while (!stack3.isEmpty()) {
	  	System.out.print(stack3.top() + " ");
	  	stack3.pop();
	  }
	  System.out.println();

  }
}