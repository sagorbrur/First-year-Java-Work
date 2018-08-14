
public class Exercise11_4 {
	public static void main(String[] args){
		MyStack stack=new MyStack();
		stack.push("Tom");
		stack.push("Sagor");
		stack.push("Dipok");
		System.out.println(stack.getSize());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}

}
