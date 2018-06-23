public class Heap{
	
	//1.shape property
	//2.heap property
	
	//insert
	//extract-min
	int[] data;
	int count = 0;
	int size;
	Heap(int initSize){
		data = new int[initSize];
		size = initSize;
	}
	
	// 1.insert at the end
	// 2.compare with parent
	// 3.exchange with parent
	void insert(int node){
		
		if(count == data.length){
			
			int[] new_data = new int[2 * size];
			size = 2 * size;
			 
			//Arrays.copyOf();
			for(int i = 0; i < count; i ++){
				new_data[i] = data[i];
			}
			
			data = new_data;
		}
		
		
		data[count] = node;
		
		//init loop
		int index = count;
		int parent = (index - 1) / 2;
		
		while(data[index] < data[parent] && index != 0){
			
			exchange(parent,index);
			index = parent;
			parent = (index - 1) / 2;
		}
		
		count ++;
	}
	
	// 1.move the top
	// 2.move the last to top
	// 3.compare left and right with top
	// 4.select the min exchange with top(parent)
	int extract(){
		if(count < 1) return -1;
		// extract-min
		count --;
		int result = data[0];
		// move the last to top
		data[0] = data[count];
		data[count] = -1;
		
		// System.out.println("data[0]:"+data[0]);
		
		// maintain heap property (init loop)
		int parent = 0;
		int left = 0;
		int right = 0;
		
		// be careful of the expression connected by "||"
		while(true){
			
			left = (parent + 1) * 2 - 1;
			right = (parent + 1) * 2;
			
			//no child,leaf node
			if(!(left < count)) break;
			
			//special condition,only has left child
			if(left == count - 1){
				if(data[parent] > data[left]){
					exchange(parent,left);
				}
				break;
			}
			int new_parent = maintain(parent,left,right);
			//maintain complete
			if(new_parent == parent) break;
			else parent = new_parent;
			
		}
		return result;
	}
	
	int maintain(int parent,int left,int right){
		int min = data[parent];
		int pos = parent;
		
		if(min > data[left]){
			min = data[left];
			pos = left;
		}
		
		if(min > data[right]){
			min = data[right];
			pos = right;
		}
		
		if(pos != parent) exchange(parent,pos);
		
		return pos;
	}
	
	void exchange(int src,int dst){
		int temp = data[src];
		data[src] = data[dst];
		data[dst] = temp;
	}
}
