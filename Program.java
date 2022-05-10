import java.util.*;;
public class Program {
 
    public static void main(String[] args) {
        secilStack<Integer> obj = new secilStack<Integer>();				
		System.out.println(obj.length());		
		//System.out.println(obj.pop());				
		//System.out.println(obj.peek());						
        System.out.println(obj.displayStack());
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);				
		System.out.println(obj.length());		
		System.out.println(obj.pop());				
		System.out.println(obj.peek());						
        System.out.println(obj.displayStack());		

		secilQueue<Integer> obj1=new secilQueue<Integer>();
		System.out.println(obj1.length());		
		System.out.println(obj1.dequeue());						
		System.out.println(obj1.peek());
		System.out.println(obj1.displayQueue());
		obj1.enqueue(1);
		obj1.enqueue(2);
		obj1.enqueue(3);
		obj1.enqueue(4);
		obj1.enqueue(5);
		obj1.enqueue(6);				
		System.out.println(obj1.length());		
		System.out.println(obj1.dequeue());						
		System.out.println(obj1.peek());
		System.out.println(obj1.displayQueue());
	}
}
