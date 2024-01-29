package ch02.apps;
import ch02.stacks.*;

public class StackDriver 
{
  public static void main(String[] args)
  {
  //  StackInterface<String> test;
  //  test = new ArrayBoundedStack01<String>();   
	  
	  
	  ArrayListStack<Integer> alStack = new ArrayListStack<>();
		System.out.println("Pushing 3 numbers");
		System.out.println(alStack.safePush(10));
		System.out.println(alStack.safePush(20));
		System.out.println(alStack.safePush(30));
		System.out.println();
		System.out.println("Top = " + alStack.safeTop());
		System.out.println();
		System.out.println("Popping 4 times");
		System.out.println(alStack.safePop());
		System.out.println(alStack.safePop());
		System.out.println(alStack.safePop());
		System.out.println(alStack.safePop());
		System.out.println();
		System.out.println("Top = " + alStack.safeTop());
  }
}