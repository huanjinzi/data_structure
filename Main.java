import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int initSize = scanner.nextInt();
		
		Heap heap = new Heap(initSize);
		
		for(int i = 10; i > 0; i --){
			heap.insert(i);
		}
		
		System.out.println("Heap:");
		for(int i = 0; i < 10; i++){
			int out = heap.data[i];
			System.out.println(out);
		}
		
		System.out.println("heap size:" + heap.data.length);
	}
}

class Heap{
	
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
	int extractMin(){
		while(true){
			
		}
	}
	
	void exchange(int src,int dst){
		int temp = data[src];
		data[src] = data[dst];
		data[dst] = temp;
	}
}
