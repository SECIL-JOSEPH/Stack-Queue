import java.util.*;
public class secilQueue <T>
{
    private Node front;    
    private Node rear;    
    private int length;
    
    public void enqueue(T data)
    {
        if(front == null)
        {
            rear = new Node(data); //If front is null create object for rear.
            front = rear; // front and rear pointing same node.
        }
        else
        {
            rear.nextnode = new Node(data); //If front is not null create object for rear.
            rear = rear.nextnode; //Initialize new node as rear.
        }
        length++;
    }    	
	public T dequeue() 
    {
		if(front != null)
        {
            T remove = front.data;
            front=front.nextnode; //Initialize next node as front.
            length--;
            return remove;
        }				
		return null;
	}	
	public T peek() 
    {
		if(front != null) 
        {
			return front.data;
		}
		return null;
	}			
	public String displayQueue() 
    {
        String str = "";
		Node currentNode = front;
		while (currentNode!= null) 
        {
            str += currentNode.data + " ";			
			currentNode = currentNode.nextnode;
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
