package ch04.queues;

public class main {

	public static void main(String[] args) 
	{
		int LIMIT = 5;
		ArrayUnboundedQueue<Integer> Q = new ArrayUnboundedQueue<Integer>(LIMIT);
		
		for(int i = 0; i <= 10; i++)
		{
			Q.enqueue(i);
			System.out.print( i + ", ");
		}
		System.out.println("\nSize before dequeue:" + Q.size() + "\n");
		System.out.println("Is Full: " + Q.isFull() + "\n");
		
		for(int i = 0; i <= 10; i++)
		{
			Q.dequeue();
		}
		System.out.println("IS Empty: " + Q.isEmpty() + "\n");
		
		System.out.println("Size after dequeue: " + Q.size());
		Q.dequeue();// this will throw the error, dequeue(); on an empty queue, show the if statement is working 
		
	}
}
