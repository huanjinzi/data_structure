/*created by huanjinzi at 2018-06-06*/
class StackTest{
	public static void main(String[] args){
		Stack stack = new Stack();
		
		for(int i = 1; i < 10; i ++){
			stack.push(i);
		}
		stack.dump();
		
		for(int i = 1; i < 4; i ++){
			stack.pop();
		}
		stack.dump();
		
		for(int i = 1; i < 4; i ++){
			stack.pop();
		}
		stack.dump();
	}
}