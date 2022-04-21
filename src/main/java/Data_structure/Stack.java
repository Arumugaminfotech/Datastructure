package Data_structure;
import java.util.*;
public class Stack {
	// Stack implementation in Java
	  // store elements of stack
	  private int arr[];
	  // represent top of stack
	  private int top;
	  // total capacity of the stack
	  private int capacity;

	  // Creating a stack
	  Stack(int size) {
	    // initialize the array
	    // initialize the stack variables
	    arr = new int[size];
	    capacity = size;
	    top = -1;
	  }

	  // push elements to the top of stack
	  public void push(int x) {
	    if (isFull()) {
	      System.out.println("Stack OverFlow");

	      // terminates the program
	      System.exit(1);
	    }

	    // insert element on top of stack
	    System.out.println("Inserting " + x);
	    arr[++top] = x;
	  }

	  // pop elements from top of stack
	  public int pop() {

	    // if stack is empty
	    // no element to pop
	    if (isEmpty()) {
	      System.out.println("STACK EMPTY");
	      // terminates the program
	      System.exit(1);
	    }

	    // pop element from top of stack
	    return arr[top--];
	  }

	  // return size of the stack
	  public int getSize() {
	    return top + 1;
	  }

	  // check if the stack is empty
	  public Boolean isEmpty() {
	    return top == -1;
	  }

	  // check if the stack is full
	  public Boolean isFull() {
	    return top == capacity - 1;
	  }

	  // display elements of stack
	  public void printStack() {
	    for (int i = 0; i <= top; i++) {
	      System.out.print(arr[i] + ", ");
	    }
	  }
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the capacity of the stack :");
		int size = sc.nextInt();
		Stack stack = new Stack(size);
		int data;
        char op;
		
		do
		{
			System.out.println("1.Push");
			System.out.println("2.pop");
			System.out.println("3.count");
			System.out.println("4.print");
			System.out.println("Enter your option :");
			int option = sc.nextInt();
			// pushing the element into the task
			if(option == 1)
			{
				System.out.print("Enter the data to insert :");
				data = sc.nextInt();
				stack.push(data);
			}
			// remove element from stack
			else if(option == 2)
			{
				stack.pop();
			}
			else if(option == 3)
			{
				System.out.println(stack.getSize());
			}
			// printing the stack
			else if(option == 4)
			{
				System.out.print("Stack: ");
				stack.printStack();
			}
			//invalid option
			else
			{
				System.out.println("Invalid option");
			}
			System.out.println("Do you want to continue : Y/N ");
			op = sc.next().charAt(0);
			}while( op == 'y');	
		
	}

}
