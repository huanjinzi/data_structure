import java.util.Scanner;

public class HeapTest{
	public static void main(String[] args){
		
		//set default size of heap is 'initSize',when space is not
		//enough,the heap will grow up with 'initSize * 2 ^ n','n' 
		//is the times heap dilatation.
		Scanner scanner = new Scanner(System.in);
		int initSize = scanner.nextInt();
		
		Heap heap = new Heap(initSize);
		
		int[] sort = {2,3,1,6,4,9,10,7,5,8,100,88,23,56};
		
		for(int i = 0; i < sort.length; i ++){
			heap.insert(sort[i]);
		}
		printHeap(heap);
		
		for(int i = 0; i < sort.length; i ++){
			System.out.println(heap.extract());
		}
		
	}
	
	static void printHeap(Heap heap){
		System.out.println("===");
		for(int i = 0; i < heap.count; i++){
			int out = heap.data[i];
			System.out.println(out);
		}
		System.out.println("===");
	}
}