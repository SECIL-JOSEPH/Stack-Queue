import java.util.*;
public class secilStack<T>
{
    private Node top;    
    private int length;
    
    public void push(T data)
    {
        Node temp = new Node(data);
        temp.nextnode = top; //passing top object address to temp.
        top = temp; //Initialize new node as top.
        length++;
    }    	
	public T pop() 
    {
		if(length == 0) 
        {
			throw new EmptyStackException();            
		}		
		T pop = top.data;
		top = top.nextnode; //Initialize previous node as top.
		length--;
		return pop;
	}	
	public T peek() 
    {
		if(length == 0) 
        {
			throw new EmptyStackException();
		}
		return top.data;
	}	
	public String displayStack() 
    {
        String str = "";
		Node currentNode = top;		
		while (currentNode != null) 
        {
            str += currentNode.data + " ";			
			currentNode = currentNode.nextnode; //Initialize previous node as current.
		}
        return str;
	}
    public int length()
    {
		return length;
	}

    private class Node
    {
        T data;
        Node nextnode;
        public Node(T data) 
        {
            this.data = data;
            this.nextnode = null;
        }
    }       
}