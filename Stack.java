/*created by huanjinzi at 2018-06-06*/
class Stack {
	
	private int mTop = -1;
	private int[] mDatas;
	private static final int INIT_SIZE = 15;
	
	public Stack(){
		mDatas = new int[INIT_SIZE];
	}
	
	//pop
	public int pop(){
		//clear data
		mDatas[mTop] = 0;
		return mDatas[mTop--];
	}
	
	//push
	public void push(int element){
		mDatas[++mTop] = element;
	}
	
	//dump
	public void dump(){
		System.out.println("");
		System.out.println("dump:");
		System.out.println("mTop = " + mTop);
		
		for(int element : mDatas){
			if(element == 0) {
				System.out.println("");
				return;
			}
			System.out.print(element + " ");
		}
	}
}